/**
 * @see "Categor�a Sukia Values de SUKIA Smalltalk"
 */
package ontology.common;

/**
 * @author Armando
 *
 */
@SuppressWarnings("serial")
public class SingleValue extends Value{
	private double value;

  	private String _internalInstanceName = null;

  	public String get_internalInstanceName() {
		return _internalInstanceName;
	}

	public SingleValue() {
	  this._internalInstanceName = "";
  	}

  	public SingleValue(String instance_name) {
	  this._internalInstanceName = instance_name;
  	}	
	
	/**
	 * Constructor altenativo
	 */
	public SingleValue(double aValue) {
		this.setValue(aValue);
		this.setMeasuringUnit(MeasuringUnit.COUNT.getMeasuringUnit());
	}

	/**
	 * Constructor altenativo
	 */
	public SingleValue(double aValue, String measuringUnit) {
		this.setValue(aValue);
		this.setMeasuringUnit(measuringUnit);
	}
	
	/**
	 * Constructor altenativo
	 */
	public SingleValue(SingleValue aSingleValue) {
		this.setValue(aSingleValue.getValue());
		this.setMeasuringUnit(aSingleValue.getMeasuringUnit());
	}
	
	/**
	 * @see "M�todo value del protocolo accessing-weighted values en SUKIA SmallTalk"
	 * @return
	 */
	public double getValue() {
		return value;
	}
	
	/**
	 * @see "M�todo value: del protocolo adding-weighted values en SUKIA SmallTalk"
	 * @param state
	 */
	public void setValue(double value) {
		this.value = value;
	}
	
	/**
	 * M�todo agregado
	 * @param aValue
	 * @return
	 */
    @Override
	public boolean equals(Object aValue) {
		if (aValue == null) return false;
		if (!(aValue instanceof SingleValue)) return false;
		
		if (this.getValue() == ((SingleValue)aValue).getValue())
			return true;
		else return false;
	}
	
    @Override
	public int hashCode(){
		return Double.valueOf(this.getValue()).hashCode() + this.getMeasuringUnit().hashCode();
	}
    
    /**
	 * 
	 */
	public String toString() {
		return  Double.toString(this.getValue())+ " " + this.getMeasuringUnit();
	}
}
