/**
 * @see "Categor�a Sukia Values de SUKIA Smalltalk"
 */
package onthology.values;


import onthology.taxonomy.Taxon;

/**
 * @author Armando
 *
 */
public class RangeDescriptor extends ValueDescriptor {
	private double lowerBound;
	private double upperBound;
	private String measuringUnit;

	/**
	 * 
	 */
	public RangeDescriptor() {
		// TODO Auto-generated constructor stub
		// this is set up for weighted values as default
		super();
		setMeasuringUnit(null);
	}
	
	/**
	 * aMeasuringUnit can be #cm, #mm, #inch
	 * @see "M�todo measuringUnit: del protocolo setting-range values (private) en SUKIA SmallTalk"
	 * @param measuringUnit
	 */
	public void setMeasuringUnit(String aMeasuringUnit) {
		if (MeasuringUnit.exists(aMeasuringUnit))
			return;

		this.measuringUnit = aMeasuringUnit;
	}

	/**
	 * @see "M�todo measuringUnit del protocolo accessing-range values en SUKIA SmallTalk"
	 * @return
	 */
	public String getMeasuringUnit() {
		return measuringUnit;
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
	 * @param aDescriptor
	 * @param aTaxon
	 */
	public <T> void addValues(T aDescriptor, Taxon aTaxon) {
		RangeDescriptor rvd;
		
		rvd = (RangeDescriptor) aDescriptor;
		this.setLowerBound(rvd.getLowerBound());
		this.setUpperBound(rvd.getUpperBound());
		this.getTaxonList().add(aTaxon);
	}
	
	public boolean isRangeWithin(double aLowerBound, double anUpperBound) {
		if (aLowerBound > anUpperBound) return false;

		return ((this.getLowerBound() >= aLowerBound) && (this.getUpperBound() <= anUpperBound));
	}
}
