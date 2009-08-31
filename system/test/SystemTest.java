/**
 * 
 */
package system.test;

import ontology.common.Modifier;
import ontology.common.RVCharacterDescriptor;
import ontology.common.RVHeuristicDescriptor;
import ontology.common.SSCharacterDescriptor;
import ontology.common.SSHeuristicDescriptor;
import ontology.taxonomy.Taxon;
import ontology.taxonomy.TaxonomicRank;
import ontology.values.MeasuringUnit;
import ontology.values.RangeValue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * @author Armando
 *
 */
public class SystemTest {
	private static system.System oracleIDSystem;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Taxon taxon1, taxon2, taxon3, taxon4, taxon5, taxon6, taxon7, taxon8;
		
		System.out.println("Iniciando pruebas para la clase " + system.System.class.getName());
		oracleIDSystem = new system.System();
        
//-----------------------Taxon No. 1---------------------
        taxon1 = new Taxon(TaxonomicRank.FAMILY, "Chromodorididae");
        //-----------------------Structure No. 1---------------------
        taxon1.addToDescription(new SSCharacterDescriptor("Cuerpo","Forma","Alargado"),
                new Modifier(1.0,1.0,0.8));
  		taxon1.addToDescription(new SSCharacterDescriptor("Cuerpo","Forma","Ovalado"),
  		        new Modifier(1.0,1.0,0.1));
  		taxon1.addToDescription(new RVCharacterDescriptor("Cuerpo","Longitud", new RangeValue(0.3, 4.0,
  				MeasuringUnit.CM)), new Modifier(1.0,1.0,1.0));
  		taxon1.addToDescription(new SSCharacterDescriptor("Cuerpo","Conformaci�n","Tiene cerata"),
  		        new Modifier(1.0,1.0,1.0));
  		//-----------------------Structure No. 2---------------------
  		taxon1.addToDescription(new SSCharacterDescriptor("Pie","Disposici�n","Sobresale al manto"),
  		        new Modifier(0.8,1.0,0.8));
  		taxon1.addToDescription(new SSCharacterDescriptor("Pie","Coloraci�n","Blanquecino"),
  		        new Modifier(0.8,1.0,0.7));
  		taxon1.addToDescription(new SSCharacterDescriptor("Pie","Coloraci�n","Crema"),
  		        new Modifier(0.8,1.0,0.7));
  		taxon1.addToDescription(new SSCharacterDescriptor("Pie","Coloraci�n","Gris oscuro casi negro"),
  		        new Modifier(0.8,1.0,0.2));
  		//-----------------------Structure No. 3---------------------
  		taxon1.addToDescription(new SSCharacterDescriptor("Branquia","Posici�n durante desplazamiento",
  				"Hacia atras"), new Modifier(0.8,1.0,0.8));
  		taxon1.addToDescription(new SSCharacterDescriptor("Branquia","Posici�n del ano con respecto a la " +
  				"branquia","En el centro"), new Modifier(0.8,1.0,0.8));
  		taxon1.addToDescription(new RVCharacterDescriptor("Branquia","N�mero hojas branquiales", 
  				new RangeValue(6.0, 9.0)), new Modifier(0.8,1.0,1.0));
  		taxon1.addToDescription(new SSCharacterDescriptor("Branquia","Forma hojas branquiales","Bipinnada"),
  		        new Modifier(0.8,1.0,0.6));
  		taxon1.addToDescription(new SSCharacterDescriptor("Branquia","Forma hojas branquiales","Tripinnada"),
  		        new Modifier(0.8,1.0,0.4));
  		//-----------------------Structure No. 4---------------------
  		taxon1.addToDescription(new SSCharacterDescriptor("Manto","Textura","Lisa"),
  		        new Modifier(1.0,1.0,0.8));
  		taxon1.addToDescription(new SSCharacterDescriptor("Manto","Textura","Con tuberculos"),
  		        new Modifier(1.0,1.0,0.4));
  		taxon1.addToDescription(new SSCharacterDescriptor("Manto","Forma del borde","Ondulado"),
  		        new Modifier(1.0,1.0,0.3));
  		taxon1.addToDescription(new SSCharacterDescriptor("Manto","Textura del borde","Lisa"),
  		        new Modifier(1.0,1.0,0.7));
  		//-----------------------Structure No. 5---------------------
  		taxon1.addToDescription(new SSCharacterDescriptor("Gl�ndulas del manto","Posici�n","Delante"),
  		        new Modifier(1.0,1.0,0.2));
  		taxon1.addToDescription(new SSCharacterDescriptor("Gl�ndulas del manto","Posici�n",
  				"Delante y atras"), new Modifier(1.0,1.0,0.2));
  		taxon1.addToDescription(new SSCharacterDescriptor("Gl�ndulas del manto","Posici�n",
  				"Alrededor del manto"), new Modifier(1.0,1.0,0.4));
  		//-----------------------Structure No. 6---------------------
  		taxon1.addToDescription(new SSCharacterDescriptor("Rinoforos","Forma","Laminados"),
  		        new Modifier(1.0,1.0,1.0));
  		taxon1.addToDescription(new RVCharacterDescriptor("Rinoforos","N�mero de laminillas",
  				new RangeValue(6.0, 20.0)), new Modifier(1.0,1.0,1.0));
  		//-----------------------Structure No. 7---------------------
  		taxon1.addToDescription(new SSCharacterDescriptor("Tent�culos orales","Contextura","Macizo"),
  		        new Modifier(1.0,1.0,0.7));
  		taxon1.addToDescription(new SSCharacterDescriptor("Tentaculos orales","Contextura","Surcado"),
  		        new Modifier(1.0,1.0,0.2));
  		//-----------------------Grouping Heuristic No. 1---------------------
  		taxon1.addToDescription(new SSHeuristicDescriptor("Alimentaci�n", "Alimentaci�n","Esponjas"),
  		        new Modifier(1.0,1.0,1.0));
  		//-----------------------Grouping Heuristic No. 2---------------------
  		taxon1.addToDescription(new RVHeuristicDescriptor("Profundidad donde se encuentra",
  				"Profundidad donde se encuentra", new RangeValue(0.0, 20.0, MeasuringUnit.M)), 
  				new Modifier(1.0,1.0,1.0));
  		//-----------------------Grouping Heuristic No. 3---------------------
  		taxon1.addToDescription(new SSHeuristicDescriptor("Medio de preservacion tenido",
  				"Medio de preservacion tenido","Azul marino"), new Modifier(1.0,1.0,1.0));
  		taxon1.addToDescription(new SSHeuristicDescriptor("Medio de preservacion tenido",
  				"Medio de preservacion tenido","Celeste"), new Modifier(1.0,1.0,0.8));
  		taxon1.addToDescription(new SSHeuristicDescriptor("Medio de preservacion tenido",
  				"Medio de preservacion tenido","Amarillento"), new Modifier(1.0,1.0,0.2));
//-----------------------Taxon No. 2---------------------
	    taxon2 = new Taxon(TaxonomicRank.GENUS, "Chromodoris");
	    //-----------------------Structure No. 1---------------------
	    taxon2.addToDescription(new SSCharacterDescriptor("Cuerpo","Posici�n de la banda dorsal " +
	      		"continua", "Centro"), new Modifier(1.0,1.0,1.0));
	    taxon2.addToDescription(new SSCharacterDescriptor("Cuerpo","Coloraci�n","Brillante azul rojo " +
	      		"blanco anaranjado purpura"), new Modifier(1.0,1.0,1.0));
	    taxon2.addToDescription(new SSCharacterDescriptor("Cuerpo","Forma ventral","Aplanado"),
	                  new Modifier(1.0,1.0,0.6));
	    //-----------------------Structure No. 2---------------------
	    taxon2.addToDescription(new SSCharacterDescriptor("Manto","Forma","Elongado y ovalado"),
	              new Modifier(0.8,1.0,0.7));
	    taxon2.addToDescription(new SSCharacterDescriptor("Manto","Contextura","Con gl�ndulas"),
	                  new Modifier(0.8,1.0,0.8));
	    //-----------------------Structure No. 3---------------------
	    taxon2.addToDescription(new SSCharacterDescriptor("Radula","Forma de los dientes","Denticulados"),
	              new Modifier(0.3,1.0,1.0));
	    taxon2.addToDescription(new SSCharacterDescriptor("Radula","Posici�n del diente m�s conspicuo",
	    		  "Centro"), new Modifier(0.3,1.0,0.5));
//-----------------------Taxon No. 3---------------------
	    taxon3 = new Taxon(TaxonomicRank.SPECIES, "Chromodoris sphoni");
	    //-----------------------Structure No. 1---------------------
	    taxon3.addToDescription(new RVCharacterDescriptor("Cuerpo","Longitud", new RangeValue(0.3, 0.35,
  				MeasuringUnit.CM)), new Modifier(0.0,1.0,1.0));
	    taxon3.addToDescription(new SSCharacterDescriptor("Cuerpo","Forma","Ovalado"),
  		        new Modifier(0.0,1.0,1.0));
	    taxon3.addToDescription(new SSCharacterDescriptor("Cuerpo","Conformaci�n","No tiene tuberculos ni espiculas"),
  		        new Modifier(0.0,1.0,1.0));
	    taxon3.addToDescription(new SSCharacterDescriptor("Cuerpo","Coloraci�n","Verde fosforescente"),
  		        new Modifier(0.0,1.0,0.8));
	    taxon3.addToDescription(new SSCharacterDescriptor("Cuerpo","Coloraci�n","Caf� rojizo"),
  		        new Modifier(0.0,1.0,0.8));
	    taxon3.addToDescription(new SSCharacterDescriptor("Cuerpo","Coloraci�n del fonfo","Blanco"),
  		        new Modifier(0.0,1.0,1.0));
	    taxon3.addToDescription(new SSCharacterDescriptor("Cuerpo","Coloraci�n del fonfo","Crema"),
  		        new Modifier(0.0,1.0,1.0));
	    taxon3.addToDescription(new SSCharacterDescriptor("Cuerpo","Contextura","Lisa"),
  		        new Modifier(0.0,1.0,1.0));
	    //-----------------------Structure No. 2---------------------
	    taxon3.addToDescription(new SSCharacterDescriptor("Branquia","Forma hojas branquiales","Unipinnada"),
	        new Modifier(0.9,1.0,1.0));
	    taxon3.addToDescription(new SSCharacterDescriptor("Branquia","Coloraci�n","Blanco"),
		        new Modifier(0.9,1.0,1.0));
	    taxon3.addToDescription(new SSCharacterDescriptor("Branquia","Coloraci�n","Blanquecino"),
		        new Modifier(0.9,1.0,0.9));
	    taxon3.addToDescription(new SSCharacterDescriptor("Branquia","Coloraci�n de los �pices","Morado"),
		        new Modifier(0.9,1.0,1.0));
	    //-----------------------Structure No. 3---------------------
  		taxon3.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n del patron de rayas en forma de cruz","Rojo violaceo"),
  		        new Modifier(1.0,1.0,1.0));
  		taxon3.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n del patron de rayas en forma de cruz","Granate"),
  		        new Modifier(1.0,1.0,1.0));
  		taxon3.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n de puntos conspicuos","Amarillo"),
  		        new Modifier(1.0,1.0,1.0));
  		taxon3.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n l�nea exterior del borde","Naranja"),
  		        new Modifier(1.0,1.0,1.0));
  		taxon3.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n l�nea interior del borde","Rojo violaceo"),
  		        new Modifier(1.0,1.0,1.0));
  		taxon3.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n de los puntos irregulares localizados entre las l�neas del borde","Amarillo oro"),
  		        new Modifier(1.0,1.0,1.0));
  		//-----------------------Structure No. 4---------------------
  		taxon3.addToDescription(new SSCharacterDescriptor("Rinoforos","Coloraci�n","Blanco"),
  		        new Modifier(0.9,1.0,1.0));
  		taxon3.addToDescription(new SSCharacterDescriptor("Rinoforos","Coloraci�n","Blanquecino"),
  		        new Modifier(0.9,1.0,0.9));
  		taxon3.addToDescription(new SSCharacterDescriptor("Rinoforos","Coloraci�n de los �pices","Morado"),
  		        new Modifier(0.9,1.0,1.0));
  		//-----------------------Structure No. 5---------------------
  		taxon3.addToDescription(new SSCharacterDescriptor("Cola","Coloraci�n","Violaceo"),
  		        new Modifier(0.0,1.0,1.0));
  		taxon3.addToDescription(new SSCharacterDescriptor("Cola","Coloraci�n","Blanco"),
  		        new Modifier(0.0,1.0,0.9));
  		taxon3.addToDescription(new SSCharacterDescriptor("Cola","Coloraci�n","Crema"),
  		        new Modifier(0.0,1.0,0.9));
  		taxon3.addToDescription(new SSCharacterDescriptor("Cola","Coloraci�n del borde","Verde azulado moteado de amarillo"),
  		        new Modifier(0.0,1.0,1.0));
  		//-----------------------Structure No. 6---------------------
  		taxon3.addToDescription(new SSCharacterDescriptor("Pie","Coloraci�n","Blanco hialino"),
  		        new Modifier(0.0,1.0,1.0));
  		taxon3.addToDescription(new SSCharacterDescriptor("Pie","Coloraci�n del borde","Blanco opaco"),
  		        new Modifier(0.0,1.0,1.0));
  		//-----------------------Structure No. 7---------------------
  		taxon3.addToDescription(new SSCharacterDescriptor("Aparato genital","Tamano de la glandula vestibular",
  				"Peque�o"), new Modifier(0.0,1.0,1.0));
//-----------------------Taxon No. 4---------------------
	    taxon4 = new Taxon(TaxonomicRank.SPECIES, "Chromodoris clenchi");
	    //-----------------------Structure No. 1---------------------
	    taxon4.addToDescription(new SSCharacterDescriptor("Cuerpo","Coloraci�n","Rojo"),
  		        new Modifier(0.0,1.0,1.0));
	    taxon4.addToDescription(new SSCharacterDescriptor("Cuerpo","Coloraci�n","Rojizo"),
  		        new Modifier(0.0,1.0,0.8));
	    taxon4.addToDescription(new SSCharacterDescriptor("Cuerpo","Coloraci�n","Cafesuzco"),
  		        new Modifier(0.0,1.0,0.5));
	    taxon4.addToDescription(new SSCharacterDescriptor("Cuerpo","Coloraci�n","Blanquecino"),
  		        new Modifier(0.0,1.0,0.1));
	    //-----------------------Structure No. 2---------------------
  		taxon4.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n de numerosas manchas","Blanco con borde amarillento"),
  		        new Modifier(0.0,1.0,1.0));
  		taxon4.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n l�nea exterior del borde","Rojizo"),
  		        new Modifier(0.0,1.0,1.0));
  		taxon4.addToDescription(new SSCharacterDescriptor("Manto","Visibilidad l�nea exterior del borde cuando muerto","Ninguna"),
  		        new Modifier(0.0,1.0,1.0));
  		taxon4.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n del borde","Blanco"),
  		        new Modifier(0.0,1.0,1.0));
  		//-----------------------Structure No. 4---------------------
  		taxon4.addToDescription(new SSCharacterDescriptor("Rinoforos","Coloraci�n de dos manchas localizadas en el centro","Blanco"),
  		        new Modifier(0.0,1.0,1.0));
  		taxon4.addToDescription(new SSCharacterDescriptor("Rinoforos","Visibilidad de dos manchas localizadas en el centro cuando muerto","Ninguna"),
  		        new Modifier(0.0,1.0,1.0));
  		taxon4.addToDescription(new SSCharacterDescriptor("Rinoforos","Coloraci�n de la base","Blanco"),
  		        new Modifier(0.0,1.0,1.0));
  		taxon4.addToDescription(new SSCharacterDescriptor("Rinoforos","Coloraci�n de los apices","Rojo purpura"),
  		        new Modifier(0.0,1.0,1.0));
  		taxon4.addToDescription(new SSCharacterDescriptor("Rinoforos","Coloraci�n de los apices","Blanco"),
  		        new Modifier(0.0,1.0,0.1));
//-----------------------Taxon No. 5---------------------
	    taxon5 = new Taxon(TaxonomicRank.SPECIES, "Chromodoris kempfi");
	    //-----------------------Structure No. 1---------------------
  		taxon5.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n del borde","Amarillo brillante"),
  		        new Modifier(1.0,1.0,1.0));
  		taxon5.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n del borde","Crema blanquecino"),
  		        new Modifier(1.0,1.0,0.1));
  		taxon5.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n del borde","Verde azulado"),
  		        new Modifier(1.0,1.0,1.0));
  		taxon5.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n del borde","Verde grisaceo"),
  		        new Modifier(1.0,1.0,0.1));
  		taxon5.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n de la banda dorsal continua","Blanco"),
  		        new Modifier(1.0,1.0,1.0));
  		taxon5.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n de las manchas","Azul oscuro"),
  		        new Modifier(1.0,1.0,1.0));
  		taxon5.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n de las manchas","Negro"),
  		        new Modifier(1.0,1.0,0.8));
  		taxon5.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n de las manchas","Celeste"),
  		        new Modifier(1.0,1.0,0.5));
  		//-----------------------Structure No. 2---------------------
  		taxon5.addToDescription(new SSCharacterDescriptor("Rinoforos","Coloraci�n","Purpura"),
  		        new Modifier(0.8,1.0,0.8));
  		taxon5.addToDescription(new SSCharacterDescriptor("Rinoforos","Coloraci�n","De azul a purpura"),
  		        new Modifier(0.8,1.0,1.0));
  		taxon5.addToDescription(new SSCharacterDescriptor("Rinoforos","Coloraci�n","Celeste p�lido"),
  		        new Modifier(0.8,1.0,0.5));
  		//-----------------------Structure No. 3---------------------
	    taxon5.addToDescription(new SSCharacterDescriptor("Branquia","Coloraci�n","Purpura"),
		        new Modifier(0.8,1.0,0.8));
	    taxon5.addToDescription(new SSCharacterDescriptor("Branquia","Coloraci�n","De azul a purpura"),
		        new Modifier(0.8,1.0,1.0));
	    taxon5.addToDescription(new SSCharacterDescriptor("Branquia","Coloraci�n","Celeste p�lido"),
		        new Modifier(0.8,1.0,0.5));
	    
	    oracleIDSystem.getTaxonomy().addTaxon(taxon1, oracleIDSystem.getTaxonomy().getRootTaxon());
	    oracleIDSystem.getTaxonomy().addTaxon(taxon2, taxon1);
	    oracleIDSystem.getTaxonomy().addTaxon(taxon3, taxon2);
	    oracleIDSystem.getTaxonomy().addTaxon(taxon4, taxon2);
	    oracleIDSystem.getTaxonomy().addTaxon(taxon5, taxon2);

//-----------------------Taxon No. 6---------------------
	    taxon1 = new Taxon(TaxonomicRank.GENUS, "Cadlina");
	    //-----------------------Structure No. 1---------------------
  		taxon1.addToDescription(new SSCharacterDescriptor("Manto","Consistencia","Firme"),
  		        new Modifier(0.0,1.0,1.0));
  		taxon1.addToDescription(new SSCharacterDescriptor("Manto","Contextura","Cubierto de espiculas con pequenos tuberculos"),
  		        new Modifier(0.0,1.0,1.0));
  		//-----------------------Structure No. 2---------------------
  		taxon1.addToDescription(new SSCharacterDescriptor("Gl�ndulas del manto","Tama�o","Grandes en proporcion al cuerpo"),
  		        new Modifier(0.0,1.0,1.0));
  		taxon1.addToDescription(new SSCharacterDescriptor("Gl�ndulas del manto","Disposici�n",
  				"Rodean completamente al manto"), new Modifier(0.0,1.0,1.0));
  		//-----------------------Structure No. 3---------------------
	    taxon1.addToDescription(new SSCharacterDescriptor("Radula","Forma del diente central","Denticulado"),
	            new Modifier(0.0,1.0,1.0));
//-----------------------Taxon No. 7---------------------
	    taxon2 = new Taxon(TaxonomicRank.SPECIES, "Cadlina sparsa");
	    //-----------------------Structure No. 1---------------------
	    taxon2.addToDescription(new SSCharacterDescriptor("Cuerpo","Coloraci�n del fondo","Salm�n"),
  		        new Modifier(0.0,1.0,1.0));
	    taxon2.addToDescription(new SSCharacterDescriptor("Cuerpo","Coloraci�n del fondo","Amarillento"),
  		        new Modifier(0.0,1.0,1.0));
	    taxon2.addToDescription(new RVCharacterDescriptor("Cuerpo","Longitud", new RangeValue(1.0, 3.6,
  				MeasuringUnit.CM)), new Modifier(0.0,1.0,1.0));
	    //-----------------------Structure No. 2---------------------
	    taxon2.addToDescription(new SSCharacterDescriptor("Manto","Coloracion de pequenas manchas laterales","Amarillo"),
  		        new Modifier(0.0,1.0,1.0));
	    //-----------------------Structure No. 3---------------------
	    taxon2.addToDescription(new SSCharacterDescriptor("Branquia","Coloraci�n","Blancuzco"),
		        new Modifier(0.0,1.0,1.0));
	    //-----------------------Structure No. 4---------------------
  		taxon2.addToDescription(new SSCharacterDescriptor("Rinoforos","Coloraci�n","Blancuzco"),
  		        new Modifier(0.0,1.0,1.0));
//-----------------------Taxon No. 8---------------------
	    taxon3 = new Taxon(TaxonomicRank.GENUS, "Hypselodoris");
	    //-----------------------Structure No. 1---------------------
	    taxon3.addToDescription(new SSCharacterDescriptor("Cuerpo","Forma","Abultado dorsalmente"),
  		        new Modifier(0.0,1.0,1.0));
	    //-----------------------Structure No. 2---------------------
	    taxon3.addToDescription(new SSCharacterDescriptor("Manto","Forma","Angosto"),
  		        new Modifier(0.0,1.0,1.0));
	    //-----------------------Structure No. 3---------------------
  		taxon3.addToDescription(new SSCharacterDescriptor("Gl�ndulas del manto","Localizaci�n","A lo largo del manto"),
  		        new Modifier(0.0,1.0,1.0));
  		taxon3.addToDescription(new SSCharacterDescriptor("Gl�ndulas del manto","Disposici�n",
  				"Rodean completamente al manto"), new Modifier(0.0,1.0,1.0));
  		//-----------------------Structure No. 4---------------------
	    taxon3.addToDescription(new SSCharacterDescriptor("Branquia","Disposici�n","Forman un circulo alrededor del ano"),
		        new Modifier(0.0,1.0,1.0));
	    //-----------------------Structure No. 5---------------------
	    taxon3.addToDescription(new SSCharacterDescriptor("Radula","Conformaci�n","No tiene diente central"),
	            new Modifier(0.0,1.0,1.0));
//-----------------------Taxon No. 9---------------------
	    taxon4 = new Taxon(TaxonomicRank.SPECIES, "Hypselodoris agassizii");
	    //-----------------------Structure No. 1---------------------
	    taxon4.addToDescription(new SSCharacterDescriptor("Cuerpo","Coloraci�n","Azul negruzco"),
  		        new Modifier(0.0,1.0,1.0));
	    taxon4.addToDescription(new SSCharacterDescriptor("Cuerpo","Coloraci�n","Celeste claro"),
  		        new Modifier(0.0,1.0,0.9));
	    taxon4.addToDescription(new SSCharacterDescriptor("Cuerpo","Coloracion de numerosas manchas","Blanco y amarillo"),
  		        new Modifier(0.0,1.0,1.0));
	    taxon4.addToDescription(new RVCharacterDescriptor("Cuerpo","Longitud", new RangeValue(0.3, 0.38,
  				MeasuringUnit.CM)), new Modifier(0.0,1.0,1.0));
	    //-----------------------Structure No. 2---------------------
	    taxon4.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n de las marcas ovaladas","Blanco"),
  		        new Modifier(0.0,1.0,1.0));
	    taxon4.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n l�nea exterior del borde","Amarillo"),
  		        new Modifier(0.0,1.0,1.0));
	    taxon4.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n l�nea exterior del borde","Amarillo p�lido"),
  		        new Modifier(0.0,1.0,0.8));
	    taxon4.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n linea media del borde","Azul marino a negro"),
  		        new Modifier(0.0,1.0,1.0));
	    taxon4.addToDescription(new SSCharacterDescriptor("Manto","Coloraci�n l�nea interior del borde","Verde claro"),
  		        new Modifier(0.0,1.0,1.0));
	    //-----------------------Structure No. 3---------------------
	    taxon4.addToDescription(new SSCharacterDescriptor("Branquia","Coloraci�n hojas branquiales","Crema amarillento"),
		        new Modifier(0.0,1.0,1.0));
	    taxon4.addToDescription(new SSCharacterDescriptor("Branquia","Coloraci�n hojas branquiales","Blanco opaco"),
		        new Modifier(0.0,1.0,0.7));
	    taxon4.addToDescription(new SSCharacterDescriptor("Branquia","Coloraci�n de los �pices","Azul oscuro a negro"),
		        new Modifier(0.0,1.0,1.0));
	    taxon4.addToDescription(new SSCharacterDescriptor("Branquia","Coloraci�n de los �pices","Celeste claro"),
		        new Modifier(0.0,1.0,6.0));
	    //-----------------------Structure No. 4---------------------
  		taxon4.addToDescription(new SSCharacterDescriptor("Rinoforos","Coloraci�n","Negro"),
  		        new Modifier(0.0,1.0,1.0));
  		taxon4.addToDescription(new SSCharacterDescriptor("Rinoforos","Coloraci�n","Celeste claro"),
  		        new Modifier(0.0,1.0,0.6));
  		taxon4.addToDescription(new SSCharacterDescriptor("Rinoforos","Coloraci�n del raquis","Amarillo"),
  		        new Modifier(0.0,1.0,1.0));
  		taxon4.addToDescription(new SSCharacterDescriptor("Rinoforos","Coloraci�n del raquis","Blanco"),
  		        new Modifier(0.0,1.0,0.6));	
//-----------------------Taxon No. 10---------------------
	    taxon5 = new Taxon(TaxonomicRank.GENUS, "Glossodoris");
	    //-----------------------Structure No. 1---------------------
	    taxon5.addToDescription(new SSCharacterDescriptor("Cuerpo","Alto","Considerable"),
  		        new Modifier(0.0,1.0,1.0));
	    //-----------------------Structure No. 2---------------------
	    taxon5.addToDescription(new SSCharacterDescriptor("Manto","Forma","Plegado"),
  		        new Modifier(0.0,1.0,1.0));
	    //-----------------------Structure No. 3---------------------
  		taxon5.addToDescription(new SSCharacterDescriptor("Gl�ndulas del manto","Disposici�n",
  				"Forman un circulo alrededor del ano"), new Modifier(0.0,1.0,1.0));
  		//-----------------------Structure No. 4---------------------
	    taxon5.addToDescription(new SSCharacterDescriptor("Branquia","Movimiento hojas branquiales durante desplazamiento","Ritmico"),
		        new Modifier(0.0,1.0,1.0));
	    //-----------------------Structure No. 4---------------------
	    taxon5.addToDescription(new SSCharacterDescriptor("Vagina","Forma","Angosta"),
		        new Modifier(0.0,1.0,1.0));   
//-----------------------Taxon No. 11---------------------
	    taxon6 = new Taxon(TaxonomicRank.SPECIES, "Glossodoris dalli");
	    
//-----------------------Taxon No. 12---------------------
	    taxon7 = new Taxon(TaxonomicRank.SPECIES, "Glossodoris sedna");
	    
//-----------------------Taxon No. 13---------------------
	    taxon8 = new Taxon(TaxonomicRank.GENUS, "Mexichromis");
	    
	    oracleIDSystem.getTaxonomy().addTaxon(taxon1, oracleIDSystem.getTaxonomy()
	    		.getTaxonFromLevelIndex("Chromodorididae"));
	    oracleIDSystem.getTaxonomy().addTaxon(taxon2, taxon1);
	    oracleIDSystem.getTaxonomy().addTaxon(taxon3, oracleIDSystem.getTaxonomy()
	    		.getTaxonFromLevelIndex("Chromodorididae"));
	    oracleIDSystem.getTaxonomy().addTaxon(taxon4, taxon3);
	    oracleIDSystem.getTaxonomy().addTaxon(taxon5, oracleIDSystem.getTaxonomy()
	    		.getTaxonFromLevelIndex("Chromodorididae"));
	    oracleIDSystem.getTaxonomy().addTaxon(taxon6, taxon5);
	    oracleIDSystem.getTaxonomy().addTaxon(taxon7, taxon5);
	    oracleIDSystem.getTaxonomy().addTaxon(taxon8, oracleIDSystem.getTaxonomy()
	    		.getTaxonFromLevelIndex("Chromodorididae"));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
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

}
