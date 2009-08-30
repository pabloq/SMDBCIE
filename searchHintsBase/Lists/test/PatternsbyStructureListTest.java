/**
 * 
 */
package searchHintsBase.Lists.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
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

import searchHintsBase.Lists.PatternsbyStructureList;
import searchHintsBase.Elements.DescriptorsPattern;
import searchHintsBase.Elements.PatternsbyStructure;

/**
 * @author Armando
 *
 */
public class PatternsbyStructureListTest {
	private static PatternsbyStructureList patterns;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Iniciando pruebas para la clase " + PatternsbyStructureList.class.getName());
		patterns = new PatternsbyStructureList();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Teminando pruebas para la clase " + PatternsbyStructureList.class.getName());
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
		patterns.clear();
	}

	/**
	 * Test method for {@link searchHintsBase.Lists.PatternsbyStructureList#add(searchHintsBase.elements.PatternsbyStructure)}.
	 */
	@Test
	public void testAddPatternsbyStructure() {
		List<Descriptor> dl;
		PatternsbyStructure patternsbyStructure;
		
		System.out.println("Iniciando pruebas para el m�todo Add()");
		
		System.out.println("Verificar que no se agregue una referencia a null");
		assertFalse(patterns.add(null));
		
		System.out.println("Verificar que no se agregue una referencia Sin patronres");
		assertFalse(patterns.add(new PatternsbyStructure("Pie")));
		
		System.out.println("Verificar que se agregue una referencia v�lida");
		dl = new ArrayList<Descriptor>();
		dl.add(new SVCharacterDescriptor("Branquias", "N�mero de hojas branquiales", new SingleValue(6)));
		patternsbyStructure = new PatternsbyStructure("Branquias");
		patternsbyStructure.addPattern(new DescriptorsPattern(dl, 1, 0));
		assertTrue(patterns.add(patternsbyStructure));
		
		dl = new ArrayList<Descriptor>();
		dl.add(new SVCharacterDescriptor("Branquias", "N�mero de hojas branquiales", new SingleValue(6)));
		patternsbyStructure = new PatternsbyStructure("Branquias");
		patternsbyStructure.addPattern(new DescriptorsPattern(dl, 10, 0));
		assertTrue(patterns.add(patternsbyStructure));
	}

	/**
	 * Test method for {@link searchHintsBase.Lists.PatternsbyStructureList#sortBySuccessFrecuencyCriteria(java.util.List)}.
	 */
	@Test
	public void testSortBySuccessFrecuencyCriteria() {
		List<Descriptor> dl;
		PatternsbyStructure patternsbyStructure;
		
		System.out.println("Iniciando pruebas para el m�todo SortBySuccessFrecuencyCriteria()");
		
		System.out.println("Verificar que se obtiene una lista ordenada de forma descendente seg�n criterio");
		dl = new ArrayList<Descriptor>();
		dl.add(new SVCharacterDescriptor("Branquias", "N�mero de hojas branquiales", new SingleValue(6)));
		dl.add(new SSCharacterDescriptor("Branquias", "Forma de hojas branquiales", "Tripinnada"));
		dl.add(new SSCharacterDescriptor("Branquias", "Posici�n durante desplazamiento", "Hacia atras"));
		dl.add(new SSCharacterDescriptor("Branquias", "Posici�n del ano con respecto a la branquia",
				"En el centro"));
		patternsbyStructure = new PatternsbyStructure("Branquias");
		patternsbyStructure.addPattern(new DescriptorsPattern(dl, 10, 0));
		assertTrue(patterns.add(patternsbyStructure));
		
		dl = new ArrayList<Descriptor>();
		dl.add(new SVCharacterDescriptor("Branquias", "N�mero de hojas branquiales", new SingleValue(6)));
		dl.add(new SSCharacterDescriptor("Branquias", "Posici�n durante desplazamiento", "Hacia atras"));
		dl.add(new SSCharacterDescriptor("Branquias", "Posici�n del ano con respecto a la branquia",
				"En el centro"));
		patternsbyStructure = new PatternsbyStructure("Branquias");
		patternsbyStructure.addPattern(new DescriptorsPattern(dl, 5, 0));
		assertTrue(patterns.add(patternsbyStructure));
		
		dl = new ArrayList<Descriptor>();
		dl.add(new SSCharacterDescriptor("Cuerpo", "Forma", "Ovalado"));
		dl.add(new SVCharacterDescriptor("Cuerpo", "Longitud", new SingleValue(1)));
		dl.add(new SSCharacterDescriptor("Cuerpo", "Conformaci�n", "Tiene cerata"));
		patternsbyStructure = new PatternsbyStructure("Cuerpo");
		patternsbyStructure.addPattern(new DescriptorsPattern(dl, 8, 0));
		assertTrue(patterns.add(patternsbyStructure));
		
		dl = new ArrayList<Descriptor>();
		dl.add(new SSCharacterDescriptor("Manto", "Textura", "Lisa"));
		dl.add(new SSCharacterDescriptor("Manto", "Forma del borde", "Ondulado"));
		dl.add(new SSCharacterDescriptor("Manto", "Textura del borde", "Lisa"));
		patternsbyStructure = new PatternsbyStructure("Manto");
		patternsbyStructure.addPattern(new DescriptorsPattern(dl, 2, 0));
		assertTrue(patterns.add(patternsbyStructure));
		
		
		dl = new ArrayList<Descriptor>();
		dl.add(new SVCharacterDescriptor("Branquias", "N�mero de hojas branquiales", new SingleValue(6)));
		dl.add(new SSCharacterDescriptor("Branquias", "Posici�n durante desplazamiento", "Hacia atras"));
		dl.add(new SSCharacterDescriptor("Branquias", "Posici�n del ano con respecto a la branquia",
				"En el centro"));
		dl.add(new SSCharacterDescriptor("Manto", "Forma del borde", "Ondulado"));
		dl.add(new SSCharacterDescriptor("Manto", "Textura del borde", "Lisa"));
		dl.add(new SSCharacterDescriptor("Cuerpo", "Forma", "Ovalado"));
		
		
		assertEquals(new ArrayList<String>(Arrays.asList("Branquias", "Manto", "Cuerpo")),
				patterns.sortBySuccessFrecuencyCriteria(dl));
		
		dl.add(new SVCharacterDescriptor("Cuerpo", "Longitud", new SingleValue(1)));
		assertEquals(new ArrayList<String>(Arrays.asList("Cuerpo", "Branquias", "Manto")),
				patterns.sortBySuccessFrecuencyCriteria(dl));
	}

	/**
	 * Test method for {@link searchHintsBase.Lists.PatternsbyStructureList#sortByFailureFrecuencyCriteria(java.util.List)}.
	 */
	@Test
	public void testSortByFailureFrecuencyCriteria() {
		List<Descriptor> dl;
		PatternsbyStructure patternsbyStructure;
		
		System.out.println("Iniciando pruebas para el m�todo SortBySuccessFrecuencyCriteria()");
		
		System.out.println("Verificar que se obtiene una lista ordenada de forma descendente seg�n criterio");
		dl = new ArrayList<Descriptor>();
		dl.add(new SVCharacterDescriptor("Branquias", "N�mero de hojas branquiales", new SingleValue(6)));
		dl.add(new SSCharacterDescriptor("Branquias", "Forma de hojas branquiales", "Tripinnada"));
		dl.add(new SSCharacterDescriptor("Branquias", "Posici�n durante desplazamiento", "Hacia atras"));
		dl.add(new SSCharacterDescriptor("Branquias", "Posici�n del ano con respecto a la branquia",
				"En el centro"));
		patternsbyStructure = new PatternsbyStructure("Branquias");
		patternsbyStructure.addPattern(new DescriptorsPattern(dl, 10, 1));
		assertTrue(patterns.add(patternsbyStructure));
		
		dl = new ArrayList<Descriptor>();
		dl.add(new SVCharacterDescriptor("Branquias", "N�mero de hojas branquiales", new SingleValue(6)));
		dl.add(new SSCharacterDescriptor("Branquias", "Posici�n durante desplazamiento", "Hacia atras"));
		dl.add(new SSCharacterDescriptor("Branquias", "Posici�n del ano con respecto a la branquia",
				"En el centro"));
		patternsbyStructure = new PatternsbyStructure("Branquias");
		patternsbyStructure.addPattern(new DescriptorsPattern(dl, 5, 5));
		assertTrue(patterns.add(patternsbyStructure));
		
		dl = new ArrayList<Descriptor>();
		dl.add(new SSCharacterDescriptor("Cuerpo", "Forma", "Ovalado"));
		dl.add(new SVCharacterDescriptor("Cuerpo", "Longitud", new SingleValue(1)));
		dl.add(new SSCharacterDescriptor("Cuerpo", "Conformaci�n", "Tiene cerata"));
		patternsbyStructure = new PatternsbyStructure("Cuerpo");
		patternsbyStructure.addPattern(new DescriptorsPattern(dl, 8, 3));
		assertTrue(patterns.add(patternsbyStructure));
		
		dl = new ArrayList<Descriptor>();
		dl.add(new SSCharacterDescriptor("Manto", "Textura", "Lisa"));
		dl.add(new SSCharacterDescriptor("Manto", "Forma del borde", "Ondulado"));
		dl.add(new SSCharacterDescriptor("Manto", "Textura del borde", "Lisa"));
		patternsbyStructure = new PatternsbyStructure("Manto");
		patternsbyStructure.addPattern(new DescriptorsPattern(dl, 2, 8));
		assertTrue(patterns.add(patternsbyStructure));
		
		
		dl = new ArrayList<Descriptor>();
		dl.add(new SVCharacterDescriptor("Branquias", "N�mero de hojas branquiales", new SingleValue(6)));
		dl.add(new SSCharacterDescriptor("Branquias", "Posici�n durante desplazamiento", "Hacia atras"));
		dl.add(new SSCharacterDescriptor("Branquias", "Posici�n del ano con respecto a la branquia",
				"En el centro"));
		dl.add(new SSCharacterDescriptor("Manto", "Forma del borde", "Ondulado"));
		dl.add(new SSCharacterDescriptor("Manto", "Textura del borde", "Lisa"));
		dl.add(new SSCharacterDescriptor("Cuerpo", "Forma", "Ovalado"));
		
		
		assertEquals(new ArrayList<String>(Arrays.asList("Branquias", "Manto", "Cuerpo")),
				patterns.sortByFailureFrecuencyCriteria(dl));
		
		dl.add(new SVCharacterDescriptor("Cuerpo", "Longitud", new SingleValue(1)));
		assertEquals(new ArrayList<String>(Arrays.asList("Cuerpo", "Branquias", "Manto")),
				patterns.sortByFailureFrecuencyCriteria(dl));
	}

	/**
	 * Test method for {@link searchHintsBase.Lists.PatternsbyStructureList#contains(searchHintsBase.elements.PatternsbyStructure)}.
	 */
	@Test
	public void testContainsPatternsbyStructure() {
		List<Descriptor> dl;
		PatternsbyStructure patternsbyStructure;
		
		System.out.println("Iniciando pruebas para el m�todo ContainsPatternsbyStructure()");
		
		System.out.println("Verificar que no contiene una referencia");
		dl = new ArrayList<Descriptor>();
		dl.add(new SVCharacterDescriptor("Branquias", "N�mero de hojas branquiales", new SingleValue(6)));
		patternsbyStructure = new PatternsbyStructure("Branquias");
		patternsbyStructure.addPattern(new DescriptorsPattern(dl, 1, 0));
		assertFalse(patterns.contains(patternsbyStructure));
		
		System.out.println("Verificar que s� contiene una referencia");
		patterns.add(patternsbyStructure);
		assertTrue(patterns.contains(patternsbyStructure));
	}

	/**
	 * Test method for {@link searchHintsBase.Lists.PatternsbyStructureList#getPatternByStructure(java.lang.String)}.
	 */
	@Test
	public void testGetPatternByStructure() {
		List<Descriptor> dl;
		PatternsbyStructure patternsbyStructure;
		
		System.out.println("Iniciando pruebas para el m�todo GetPatternByStructure()");
		
		System.out.println("Verificar que no contiene una referencia");
		dl = new ArrayList<Descriptor>();
		dl.add(new SVCharacterDescriptor("Branquias", "N�mero de hojas branquiales", new SingleValue(6)));
		patternsbyStructure = new PatternsbyStructure("Branquias");
		patternsbyStructure.addPattern(new DescriptorsPattern(dl, 1, 0));
		assertNull(patterns.getPatternByStructure(patternsbyStructure.getStructureName()));
		
		System.out.println("Verificar que s� contiene una referencia");
		patterns.add(patternsbyStructure);
		assertNotNull(patterns.getPatternByStructure(patternsbyStructure.getStructureName()));
	}

	/**
	 * Test method for {@link searchHintsBase.Lists.PatternsbyStructureList#contains(java.lang.String)}.
	 */
	@Test
	public void testContainsString() {
		List<Descriptor> dl;
		PatternsbyStructure patternsbyStructure;
		
		System.out.println("Iniciando pruebas para el m�todo ContainsString()");
		
		System.out.println("Verificar que no contiene una referencia");
		dl = new ArrayList<Descriptor>();
		dl.add(new SVCharacterDescriptor("Branquias", "N�mero de hojas branquiales", new SingleValue(6)));
		patternsbyStructure = new PatternsbyStructure("Branquias");
		patternsbyStructure.addPattern(new DescriptorsPattern(dl, 1, 0));
		assertFalse(patterns.contains(patternsbyStructure.getStructureName()));
		
		System.out.println("Verificar que s� contiene una referencia");
		patterns.add(patternsbyStructure);
		assertTrue(patterns.contains(patternsbyStructure.getStructureName()));
	}
}
