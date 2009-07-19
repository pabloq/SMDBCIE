/**
 * @see "Categor�a Sukia Search Hints Elts de SUKIA Smalltalk"
 */
package searchHintsBase.Elements;

/**
 * @author Armando
 *
 */
public class WeightedIndicator {
	private String indicatorName;
	private double accumulatedWeight;
	private int numberTaxa;

	/**
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk"
	 */
	public WeightedIndicator() {
		setIndicatorName(null);
		setAccumulatedWeight(0);
		setNumberTaxa(0);
	}

	/**
	 * @see "M�todo indicatorName: del protocolo adding en SUKIA SmallTalk"
	 * @param indicatorName
	 */
	public void setIndicatorName(String indicatorName) {
		this.indicatorName = indicatorName;
	}

	/**
	 * @see "M�todo name del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public String getIndicatorName() {
		return indicatorName;
	}

	/**
	 * M�todo de instancia agregado
	 * @param accumulatedWeight
	 */
	public void setAccumulatedWeight(double accumulatedWeight) {
		this.accumulatedWeight = accumulatedWeight;
	}

	/**
	 * @see "M�todo accumulatedWeight: del protocolo adding en SUKIA SmallTalk"
	 * @param accumulatedWeight
	 */
	public void incrementAccumulatedWeight(double incrementAccumulatedWeight) {
		this.accumulatedWeight = this.accumulatedWeight + incrementAccumulatedWeight;
	}
	
	/**
	 * @see "M�todo accumulatedWeight del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public double getAccumulatedWeight() {
		return accumulatedWeight;
	}

	/**
	 * M�todo de instancia agregado
	 * @param numberTaxa
	 */
	public void setNumberTaxa(int numberTaxa) {
		this.numberTaxa = numberTaxa;
	}

	/**
	 * @see "M�todo numberTaxa: del protocolo adding en SUKIA SmallTalk"
	 * @param numberTaxa
	 */
	public void incrementNumberTaxa() {
		this.numberTaxa = this.numberTaxa + 1;
	}
	
	/**
	 * @see "M�todo numberTaxa del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public int getNumberTaxa() {
		return numberTaxa;
	}

	/**
	 * @see "M�todo meanWeight del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public double meanWeight() {
		return (double)(accumulatedWeight / numberTaxa);
	}
	
}
