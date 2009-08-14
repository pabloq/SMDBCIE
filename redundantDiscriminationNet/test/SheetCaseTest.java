/**
 * 
 */
package redundantDiscriminationNet.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import ontology.CBR.Case;
import ontology.common.Descriptor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import redundantDiscriminationNet.Index;
import redundantDiscriminationNet.Norm;
import redundantDiscriminationNet.SheetCase;

/**
 * @author Armando
 *
 */
public class SheetCaseTest {
	private static SheetCase sheetcase;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Iniciando pruebas para la clase " + SheetCase.class.getName());
		sheetcase = new SheetCase(new Descriptor<Object>("Pie", "Disposici�n", "Sobresale al manto"));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Terminando pruebas para la clase " + SheetCase.class.getName());
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
	}

	/**
	 * Test method for {@link redundantDiscriminationNet.SheetCase#addPredecessor(redundantDiscriminationNet.Node)}.
	 */
	@Test
	public final void testAddPredecessor() {
		Norm norm;
		Index index;
		
		System.out.println("Iniciando pruebas para el m�todo AddPredecessor()");
		
		System.out.println("Verificar que un predecesor v�lido se agregue");
		norm = new Norm(new Descriptor<Object>("Pie", "Disposici�n", "Sobresale al manto"));
		index = new Index("Disposici�n");
		assertTrue(sheetcase.addPredecessor(norm));
		assertTrue(sheetcase.addPredecessor(index));
		
		System.out.println("Verificar que un norma con descriptor duplicado no se agregue");
		assertFalse(sheetcase.addPredecessor(norm));
		
		System.out.println("Verificar que un �ndice incompatible no se agregue");
		assertFalse(sheetcase.addPredecessor(index));
		
		System.out.println("Verificar que una referencia null no se agregue");
		assertFalse(sheetcase.addPredecessor(null));
	}

	/**
	 * Test method for {@link redundantDiscriminationNet.SheetCase#addSuccessor(redundantDiscriminationNet.Node)}.
	 */
	@Test
	public final void testAddSuccessor() {
		System.out.println("Iniciando pruebas para el m�todo AddSuccessor()");
		
		System.out.println("Verificar que no es posbible agregar un sucesor");
		assertFalse(sheetcase.addSuccessor(new Index("Disposici�n")));
	}

	/**
	 * Test method for {@link redundantDiscriminationNet.SheetCase#setCase(ontology.CBR.Case)}.
	 */
	@Test
	public final void testSetCase() {
		Case aCase;
		List<Descriptor<Object>> dl;
		
		System.out.println("Iniciando pruebas para el m�todo testSetCase()");
		
		System.out.println("Verificar que un caso incompatible no se embebe");
		dl = new ArrayList<Descriptor<Object>>();
		dl.add(new Descriptor<Object>("Cuerpo", "Longitud", 0.3));
		aCase = new Case(dl);
		assertFalse(sheetcase.setCase(aCase));
		
		System.out.println("Verificar que un caso compatible se embebe");
		dl = new ArrayList<Descriptor<Object>>();
		dl.add(new Descriptor<Object>("Pie", "Disposici�n", "Sobresale al manto"));
		aCase = new Case(dl);
		assertTrue(sheetcase.setCase(aCase));
		
	}

}