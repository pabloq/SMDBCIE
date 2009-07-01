/**
 * 
 */
package domainTheory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Armando
 *
 */
public class TaxonomicLevels {
	static List<String> levels;

	/**
	 * Adds taxonomic level names to the Levels list. The first level MUST always be #root. All other level names MUST be added
	 * according to their hierarchical ordering.  Thus, the second name in the list represents the MOST general taxonomic level,
	 * while the last name represents the most specific taxonomic level.
	 * PRECONDITION: There must be at least two taxonomic level names: #root + #aTaxonomicLevelName.
	 * @see "M�todo initialize del protocolo de clase class initialization en SUKIA SmallTalk"
	 */
	public TaxonomicLevels() {
		// TODO Auto-generated constructor stub
		initialize();
	}
	
	/**
	 * @see "M�todo initialize del protocolo de clase class initialization en SUKIA SmallTalk"
	 */
	public static void initialize() {
		levels = new ArrayList<String>();
		
		levels.add("root");
		levels.add("family");
		levels.add("genus");
		levels.add("species");
	}

	/**
	 * Returns the list of taxonomic levels
	 * @see "M�todo level del protocolo de clase accessing en SUKIA SmallTalk"
	 * @return
	 */
	public static List<String> getLevels() {
		return levels;
	}
	
	/**
	 * Returns the root level name, which always must be the first name in the levels list (i.e., the taxonomic hierarchy)
	 * @see "M�todo root del protocolo de clase accessing en SUKIA SmallTalk"
	 * @return
	 */
	public static String getRoot() {
		return levels.get(0);
	}
	
	/**
	 * Returns the most general taxonomic level name, which always must be the second name in the levels list (i.e., the taxonomic hierarchy)
	 * @see "M�todo mostGeneralLevel del protocolo de clase accessing en SUKIA SmallTalk"
	 * @return
	 */
	public static String getMostGeneralLevel() {
		return levels.get(1);
	}
	
	/**
	 * Returns the most specific taxonomic level name, which always must be the last name in the levels list (i.e., the taxonomic hierarchy)
	 * @see "M�todo mostSpecificLevel del protocolo de clase accessing en SUKIA SmallTalk"
	 * @return
	 */
	public static String getMostSpecificLevel() {
		return levels.get(levels.size()-1);
	}
	
	/**
	 * @see "M�todo getNameByNumber: del protocolo de clase class messages en SUKIA SmallTalk"
	 * @param aNumber
	 * @return
	 */
	public static String getNameByNumber(int aNumber) {
		if ((aNumber < 0) || (aNumber > (levels.size() - 1))) {
			return null;
		}

		return levels.get(aNumber+1);
	}
	
	/**
	 * @see "M�todo getNumberByName: del protocolo de clase class messages en SUKIA SmallTalk"
	 * @param aName
	 * @return
	 */
	public static int getNumberByName(String aName) {
		for (int i = 1; i <= levels.size(); i++) {
			if (levels.get(i).equals(aName)) 
				return (i - 1);
		}
		
		return -1;
	}
	
	/**
	 * Three taxonomic levels for this implementation: 1 - family; 2 - genus; 3 - species
	 * @see "M�todo nomenclaturalNumber del protocolo de clase class messages en SUKIA SmallTalk"
	 */
	public static int nomenclaturalNumber() {
		return (levels.size() - 1);
	}
	
	/**
	 * Four taxonomic levels for this implementation: 0 - #root; 1 - family; 2 - genus; 3 - species
	 * @see "M�todo totalNumber del protocolo de clase class messages en SUKIA SmallTalk"
	 */
	public static int totalNumber() {
		return levels.size();
	}
	
	/**
	 * @see "M�todo transformToIndex: del protocolo de clase class messages en SUKIA SmallTalk"
	 * @param aLevel
	 * @return
	 */
	//Pendiente de hacer m�todo hom�nimo
	public static int transformToIndex(String aLevel){
		int levelNumber = -1;

		levelNumber = getNumberByName(aLevel);
		
		if ((levelNumber == -1) || (levelNumber < getNumberByName("family")) || (levelNumber > nomenclaturalNumber()))
			return -1;
		else return levelNumber;
	}
	
	/**
	 * @see "M�todo includes: del protocolo de clase testing en SUKIA SmallTalk"
	 * @param aTaxonomicLevelName
	 * @return
	 */
	public static boolean includes(String aTaxonomicLevelName) {
		return levels.contains(aTaxonomicLevelName);
	}
	
	/**
	 * @see "M�todo isLinkOKBetween:and: del protocolo de clase testing en SUKIA SmallTalk"
	 * @param aParentTaxon
	 * @param aSuccessorTaxon
	 * @return
	 */
	public static boolean isLinkOKBetween(Taxon aParentTaxon, Taxon aSuccessorTaxon) {
		return (((TaxonomicLevels.getNumberByName(aSuccessorTaxon.getLevel())) - (TaxonomicLevels.getNumberByName(aParentTaxon.getLevel()))) == 1);
	}
}
