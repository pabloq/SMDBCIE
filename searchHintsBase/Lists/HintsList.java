/**
 * @see "Categor�a Sukia Search Hints Lists de SUKIA Smalltalk"
 */
package searchHintsBase.Lists;

import java.util.ArrayList;

/**
 * @author Armando
 *
 */
@SuppressWarnings("serial")
public class HintsList<T> extends ArrayList<T> {
	private double percentageItemsProcessed;

	/**
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk"
	 */
	public HintsList() {
		resetPercentageItemsProcessed();
	}

	/**
	 * @see "M�todo percentageItemsProcessed: del protocolo adding en SUKIA SmallTalk"
	 * @param percentageItemsProcessed
	 */
	public void setPercentageItemsProcessed(double percentageItemsProcessed) {
		this.percentageItemsProcessed = percentageItemsProcessed;
	}

	/**
	 * @see "M�todo percentageItemsProcessed: del protocolo adding en SUKIA SmallTalk"
	 * @param percentageItemsProcessed
	 */
	public void resetPercentageItemsProcessed() {
		this.percentageItemsProcessed = 0;
	}
	
	/**
	 * "M�todo percentageItemsProcessed del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public double getPercentageItemsProcessed() {
		return percentageItemsProcessed;
	}

}
