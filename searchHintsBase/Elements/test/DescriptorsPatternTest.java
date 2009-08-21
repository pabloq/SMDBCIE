/**
 * 
 */
package searchHintsBase.Elements.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import ontology.common.CharacterDescriptor;
import ontology.common.Descriptor;
import ontology.common.HeuristicDescriptor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import searchHintsBase.Elements.DescriptorsPattern;

/**
 * @author Armando
 *
 */
public class DescriptorsPatternTest {
	private static DescriptorsPattern descriptorsPattern;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Iniciando pruebas para la clase " + DescriptorsPattern.class.getName());
		descriptorsPattern = new DescriptorsPattern();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Terminando pruebas para la clase " + DescriptorsPattern.class.getName());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		descriptorsPattern.addDescriptor(new CharacterDescriptor<Object>("Cuerpo", "Longitud", 0.3));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		descriptorsPattern.getPattern().clear();
	}

	/**
	 * Test method for {@link searchHintsBase.elements.DescriptorsPattern#addDescriptor(ontology.common.Descriptor)}.
	 */
	@Test
	public void testAddDescriptor() {
		Descriptor<Object> aDescriptor;
		
		System.out.println("Iniciando pruebas para el m�todo AddDescriptor()");
		
		System.out.println("Verificar que no se agregue una referencia a null");
		assertFalse(descriptorsPattern.addDescriptor(null));
		
		System.out.println("Verificar que no haya contradicciones en la descripci�n o duplicados");
		assertFalse(descriptorsPattern.addDescriptor(new CharacterDescriptor<Object>("Cuerpo", "Longitud", 0.3)));
		assertFalse(descriptorsPattern.addDescriptor(new CharacterDescriptor<Object>("Pie", "Disposici�n", "Sobresale al manto")));
		assertFalse(descriptorsPattern.addDescriptor(new CharacterDescriptor<Object>("Cuerpo", "Longitud", 1)));
		assertFalse(descriptorsPattern.addDescriptor(new HeuristicDescriptor<Object>("Supervivencia", "Alimentaci�n", "Carnivoro")));
		
		System.out.println("Verificar que se agregue un descriptor v�lido");
		aDescriptor = new CharacterDescriptor<Object>("Cuerpo", "Conformaci�n", "Tiene cerata");
		assertTrue(descriptorsPattern.addDescriptor(aDescriptor));
	}

	/**
	 * Test method for {@link searchHintsBase.elements.DescriptorsPattern#howSimilarTo(java.util.List)}.
	 */
	@Test
	public void testHowSimilarTo() {
		List<Descriptor<Object>> dl;
		
		System.out.println("Iniciando pruebas para el m�todo HowSimilarTo()");
		
		System.out.println("Verificar que el patr�n es igual a una lista de descriptores");
		dl = new ArrayList<Descriptor<Object>>();
		dl.add(new CharacterDescriptor<Object>("Cuerpo", "Longitud", 0.3));
		assertEquals(1, descriptorsPattern.howSimilarTo(dl));
		
		System.out.println("Verificar que el patr�n es completamente distinto a una lista de descriptores");
		dl.clear();
		dl.add(new CharacterDescriptor<Object>("Cuerpo", "Conformaci�n", "Tiene cerata"));
		assertEquals(0, descriptorsPattern.howSimilarTo(dl));
		
		System.out.println("Verificar que el patr�n es medianamente distinto a una lista de descriptores");
		dl.clear();
		dl.add(new CharacterDescriptor<Object>("Cuerpo", "Longitud", 0.3));
		dl.add(new CharacterDescriptor<Object>("Cuerpo", "Conformaci�n", "Tiene cerata"));
		assertEquals(0.5, descriptorsPattern.howSimilarTo(dl));
	}
	
	/**
	 * Test method for {@link searchHintsBase.elements.DescriptorsPattern#compareTo(searchHintsBase.elements.DescriptorsPattern)}.
	 */
	@Test
	public void testCompareTo() {
		List<Descriptor<Object>> dl;
		DescriptorsPattern dp;
		
		System.out.println("Iniciando pruebas para el m�todo CompareTo()");
		
		System.out.println("Verificar que el patr�n de descriptores es igual con otro patr�n de descriptores" +
				"seg�n el criterio de comparaci�n");
		dl = new ArrayList<Descriptor<Object>>();
		dl.add(new CharacterDescriptor<Object>("Cuerpo", "Longitud", 0.3));
		dp = new DescriptorsPattern(dl, 0, 1);
		assertEquals(0, descriptorsPattern.compareTo(dp));
		
		System.out.println("Verificar que el patr�n de descriptores es distinto con otro patr�n de descriptores" +
				"seg�n el criterio de comparaci�n");
		dl.clear();
		assertTrue(descriptorsPattern.compareTo(dp) < 0);
	
		dl.add(new CharacterDescriptor<Object>("Cuerpo", "Longitud", 0.3));
		dl.add(new CharacterDescriptor<Object>("Cuerpo", "Conformaci�n", "Tiene cerata"));
		assertTrue(descriptorsPattern.compareTo(dp) > 0);
	}
}
