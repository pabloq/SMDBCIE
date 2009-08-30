/**
 * 
 */
package redundantDiscriminationNet.auxiliary.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import ontology.common.Descriptor;
import ontology.common.SSCharacterDescriptor;
import ontology.common.SVCharacterDescriptor;
import ontology.values.SingleValue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import redundantDiscriminationNet.auxiliary.ComparingTable;
import redundantDiscriminationNet.auxiliary.ComparingTableTuple;

/**
 * @author Armando
 *
 */
public class ComparingTableTest {
	private static ComparingTable act;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Iniciando pruebas para la clase " + ComparingTable.class.getName());
		act = new ComparingTable();
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Terminando pruebas para la clase " + ComparingTable.class.getName());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		act.clear();
	}

	/**
	 * Test method for {@link redundantDiscriminationNet.auxiliary.ComparingTable#fill(java.util.List, java.util.List)}.
	 */
	@Test
	public void testFill() {
		List<Descriptor> d1 = new ArrayList<Descriptor>();
		List<Descriptor> d2 = new ArrayList<Descriptor>();
		ComparingTable ct = new ComparingTable();
		ComparingTableTuple<Object> tuple;
		
		System.out.println("Iniciando pruebas para el m�todo fill()");
		
		System.out.println("Verificar que ComparingTable se llene correctamente");
		d1.add(new SVCharacterDescriptor("Cuerpo", "Longitud", new SingleValue(0.3)));
		d1.add(new SSCharacterDescriptor("Pie", "Disposici�n", "Sobresale al manto"));
		d1.add(new SSCharacterDescriptor("Cuerpo", "Conformaci�n", "Tiene cerata"));
		d1.add(new SVCharacterDescriptor("Branquias", "N�mero de hojas branquiales", new SingleValue(6)));
		
		d2.add(new SVCharacterDescriptor("Cuerpo", "Longitud", new SingleValue(1)));
		d2.add(new SSCharacterDescriptor("Cuerpo", "Forma", "Alargado"));
	
		act.fill(d1, d2);
		
		tuple = new ComparingTableTuple<Object>("Longitud", new SingleValue(0.3), new SingleValue(1));		
		ct.add(tuple);
		tuple = new ComparingTableTuple<Object>("Disposici�n", "Sobresale al manto", null);		
		ct.add(tuple);
		tuple = new ComparingTableTuple<Object>("Conformaci�n", "Tiene cerata", null);		
		ct.add(tuple);
		tuple = new ComparingTableTuple<Object>("N�mero de hojas branquiales", new SingleValue(6), null);		
		ct.add(tuple);
		tuple = new ComparingTableTuple<Object>("Forma", null, "Alargado");		
		ct.add(tuple);
		
		assertEquals(ct, act);
	}

	/**
	 * Test method for {@link redundantDiscriminationNet.auxiliary.ComparingTable#extractTuple()}.
	 */
	@Test
	public void testExtractTuple() {
		List<Descriptor> d1 = new ArrayList<Descriptor>();
		List<Descriptor> d2 = new ArrayList<Descriptor>();
		
		System.out.println("Iniciando pruebas para el m�todo ExtractTuple()");
		
		System.out.println("Verificar que devuelve null cuando ComparingTable est� vac�a");
		assertNull(act.extractTuple());
		
		System.out.println("Verificar que devuelve el primer elemento de ComparingTable");
		d1.add(new SVCharacterDescriptor("Cuerpo", "Longitud", new SingleValue(0.3)));
		
		d2.add(new SVCharacterDescriptor("Cuerpo", "Longitud", new SingleValue(1)));
		d2.add(new SSCharacterDescriptor("Cuerpo", "Forma", "Alargado"));
	
		act.fill(d1, d2);
		
		assertEquals(new ComparingTableTuple<Object>("Longitud", new SingleValue(0.3), new SingleValue(1)), act.extractTuple());
	}
}
