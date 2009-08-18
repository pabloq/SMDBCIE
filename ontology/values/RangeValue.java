/**
 * @see "Categor�a Sukia Values de SUKIA Smalltalk"
 */
package ontology.values;


/**
 * @author Armando
 *
 */
public class RangeValue extends Value {
	private double lowerBound;
	private double upperBound;

	/**
	 * 
	 */
	public RangeValue() {
		// this is set up for weighted values as default
		super();
		setMeasuringUnit(null);
	}

	/**
	 * @see "M�todo lowerBound del protocolo adding-range values en SUKIA SmallTalk"
	 * @return
	 */
	public void setLowerBound(double lowerBound) {
		this.lowerBound = lowerBound;
	}

	/**
	 * @see "M�todo lowerBound del protocolo accessing-range values en SUKIA SmallTalk"
	 * @return
	 */
	public double getLowerBound() {
		return lowerBound;
	}

	/**
	 * @see "M�todo upperBound del protocolo adding-range values en SUKIA SmallTalk"
	 * @return
	 */
	public void setUpperBound(double upperBound) {
		this.upperBound = upperBound;
	}

	/**
	 * @see "M�todo upperBound del protocolo accessing-range values en SUKIA SmallTalk"
	 * @return
	 */
	public double getUpperBound() {
		return upperBound;
	}	
	
	/**
	 * @see "M�todo copyFrom:referencing: del protocolo copying en SUKIA SmallTalk"
	 * @param aValue
	 * @param aTaxon
	 */
	public  void addValues(Value aValue) {
		RangeValue rvd;
		
		rvd = (RangeValue) aValue;
		this.setLowerBound(rvd.getLowerBound());
		this.setUpperBound(rvd.getUpperBound());
	}
	
	public boolean isRangeWithin(double aLowerBound, double anUpperBound) {
		if (aLowerBound > anUpperBound) return false;

		return ((this.getLowerBound() >= aLowerBound) && (this.getUpperBound() <= anUpperBound));
	}
	
	/**
	 * M�todo agregado
	 * @param aValue
	 * @return
	 */
	public boolean equals(Object aValue) {
		if (aValue == null) return false;
		if (!(aValue instanceof RangeValue)) return false;
		
		if (this.getLowerBound()  == ((RangeValue)aValue).getLowerBound() &&
			this.getUpperBound()  == ((RangeValue)aValue).getUpperBound())
			return true;
		else return false;
	}
}
