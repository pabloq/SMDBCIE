/**
 * @see "Categor�a Sukia Search Hints Base de SUKIA Smalltalk"
 */
package searchHintsBase;

import searchHintsBase.Lists.FrequentGroupingHeuristicList;
import searchHintsBase.Lists.FrequentStructurePatternList;
import searchHintsBase.Lists.SpecificStructureAttributeList;
import searchHintsBase.Lists.WeightedGroupingHeuristicList;
import searchHintsBase.Lists.WeightedStructureList;

/**
 * @author Armando
 *
 */
public class HintsBase {
	private FrequentStructurePatternList failedFreqStructPattList;
	private FrequentGroupingHeuristicList freqGrpHeuristicList;
	private SpecificStructureAttributeList specStructAttrList;
	private FrequentStructurePatternList successfulFreqStructPattList;
	private WeightedGroupingHeuristicList weightedGrpHeuristicList;
	private WeightedStructureList weightedStructList;

	/**
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk"
	 */
	public HintsBase() {
		// This list must contain objects of class: FrequentGroupingHeuristicElt
		setFreqGrpHeuristicList(new FrequentGroupingHeuristicList());

		/* This list must contain objects of class: FrequentStructurePatternElt. All patterns therein MUST be successful 
		(i.e., patterns that have contributed to solve cases successfully)*/
		setSuccessfulFreqStructPattList(new FrequentStructurePatternList());

		/* This list must contain objects of class: FrequentStructurePatternElt. All patterns therein MUST be unsuccessful 
		(i.e., patterns that have NOT contributed to solve cases)*/
		setFailedFreqStructPattList(new FrequentStructurePatternList());

		// This list must contain objects of class: SpecificStructureAttributeElt
		setSpecStructAttrList(new SpecificStructureAttributeList());

		// This list must contain objects of class: WeightedGroupingHeuristicElt
		setWeightedGrpHeuristicList(new WeightedGroupingHeuristicList());

		// This list must contain objects of class: WeightedStructureElt
		setWeightedStructList(new WeightedStructureList());
	}

	/**
	 * M�todo de instancia agregado
	 * @param failedFreqStructPattList
	 */
	public void setFailedFreqStructPattList(FrequentStructurePatternList failedFreqStructPattList) {
		this.failedFreqStructPattList = failedFreqStructPattList;
	}

	/**
	 * @see "M�todo failedFreqStructPattList del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public FrequentStructurePatternList getFailedFreqStructPattList() {
		return failedFreqStructPattList;
	}

	/**
	 * M�todo de instancia agregado
	 * @param freqGrpHeuristicList
	 */
	public void setFreqGrpHeuristicList(FrequentGroupingHeuristicList freqGrpHeuristicList) {
		this.freqGrpHeuristicList = freqGrpHeuristicList;
	}

	/**
	 * @see "M�todo freqGrpHeuristicList del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public FrequentGroupingHeuristicList getFreqGrpHeuristicList() {
		return freqGrpHeuristicList;
	}

	/**
	 * M�todo de instancia agregado
	 * @param specStructAttrList
	 */
	public void setSpecStructAttrList(SpecificStructureAttributeList specStructAttrList) {
		this.specStructAttrList = specStructAttrList;
	}

	/**
	 * @see "M�todo specStructAttrList del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public SpecificStructureAttributeList getSpecStructAttrList() {
		return specStructAttrList;
	}

	/**
	 * M�todo de instancia agregado
	 * @param successfulFreqStructPattList
	 */
	public void setSuccessfulFreqStructPattList(
			FrequentStructurePatternList successfulFreqStructPattList) {
		this.successfulFreqStructPattList = successfulFreqStructPattList;
	}

	/**
	 * @see "M�todo successfulFreqStructPattList del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public FrequentStructurePatternList getSuccessfulFreqStructPattList() {
		return successfulFreqStructPattList;
	}

	/**
	 * M�todo de instancia agregado
	 * @param weightedGrpHeuristicList
	 */
	public void setWeightedGrpHeuristicList(WeightedGroupingHeuristicList weightedGrpHeuristicList) {
		this.weightedGrpHeuristicList = weightedGrpHeuristicList;
	}

	/**
	 * @see "M�todo weightedGrpHeuristicList del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public WeightedGroupingHeuristicList getWeightedGrpHeuristicList() {
		return weightedGrpHeuristicList;
	}

	/**
	 * M�todo de instancia agregado
	 * @param weightedStructList
	 */
	public void setWeightedStructList(WeightedStructureList weightedStructList) {
		this.weightedStructList = weightedStructList;
	}

	/**
	 * @see "M�todo weightedStructList del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public WeightedStructureList getWeightedStructList() {
		return weightedStructList;
	}
	
	/**
	 * Adds a list element in its corresponding list.
	 * Returns: 	the list instance where the list element was successfully added;
	 * nil - if it was not possible to add the list element in any of the lists in self.
	 * @see "M�todo add: del protocolo adding en SUKIA SmallTalk"
	 * @param <T>
	 * @param aListElement
	 * @return
	 */
	/*public <T> boolean add(T aListElement) {
		return false;
	}*/
}
