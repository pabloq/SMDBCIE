/**
 * @see "Categor�a Sukia Search Hints Base de SUKIA Smalltalk"
 */
package searchHintsBase;

import searchHintsBase.Lists.PatternsbyStructureList;
import searchHintsBase.Lists.SpecificPatternsbyStructureList;
import searchHintsBase.Lists.WeightedPatternsbyStructureList;

/**
 * @author Armando
 *
 */
public class HintsBase {
	private PatternsbyStructureList patternsbyStructureList;
	private SpecificPatternsbyStructureList specStructAttrList;
	private WeightedPatternsbyStructureList weightedPatternsList;

	/**
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk"
	 */
	public HintsBase() {
		/* This list must contain objects of class: FrequentStructurePatternElt. All patterns therein MUST be successful 
		(i.e., patterns that have contributed to solve cases successfully)*/
		this.setPatternsbyStructureList(new PatternsbyStructureList());

		// This list must contain objects of class: SpecificStructureAttributeElt
		this.setSpecificPatternsbyStructureList(new SpecificPatternsbyStructureList());

		// This list must contain objects of class: WeightedStructureElt
		this.setWeightedPatternsbyStructureList(new WeightedPatternsbyStructureList());
	}

	/**
	 * M�todo de instancia agregado
	 * @param specStructAttrList
	 */
	public void setSpecificPatternsbyStructureList(SpecificPatternsbyStructureList specStructAttrList) {
		this.specStructAttrList = specStructAttrList;
	}

	/**
	 * @see "M�todo specStructAttrList del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public SpecificPatternsbyStructureList getSpecStructAttrList() {
		return specStructAttrList;
	}

	/**
	 * M�todo de instancia agregado
	 * @param successfulFreqStructPattList
	 */
	public void setPatternsbyStructureList(PatternsbyStructureList patternsbyStructureList) {
		this.patternsbyStructureList = patternsbyStructureList;
	}

	/**
	 * @see "M�todo successfulFreqStructPattList del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public PatternsbyStructureList getPatternsbyStructureList() {
		return patternsbyStructureList;
	}

	/**
	 * @see "M�todo weightedGrpHeuristicList del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public WeightedPatternsbyStructureList getWeightedPatternsbyStructureList() {
		return weightedPatternsList;
	}

	/**
	 * M�todo de instancia agregado
	 * @param weightedPatternsList
	 */
	public void setWeightedPatternsbyStructureList(WeightedPatternsbyStructureList weightedPatternsList) {
		this.weightedPatternsList = weightedPatternsList;
	}
}
