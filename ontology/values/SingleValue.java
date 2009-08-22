/**
 * @see "Categor�a Sukia Values de SUKIA Smalltalk"
 */
package ontology.values;

/**
 * @author Armando
 *
 */
public class SingleValue<E> extends Value{
	private E value;
		
	/**
	 * @see "M�todo value del protocolo accessing-weighted values en SUKIA SmallTalk"
	 * @return
	 */
	public E getValue() {
		return value;
	}
	
	/**
	 * @see "M�todo value: del protocolo adding-weighted values en SUKIA SmallTalk"
	 * @param state
	 */
	public void setValue(E value) {
		this.value = value;
	}
	
	/**
	 * @see "M�todo copyFrom:referencing: del protocolo copying en SUKIA SmallTalk"
	 * @param aValue
	 * @param aTaxon
	 */
	@SuppressWarnings("unchecked")
    @Override
	public void addValues(Value aValue) {
		SingleValue<E> svd;
		
		svd = (SingleValue<E>) aValue;
		this.setValue(svd.getValue());
	}
	
	/**
	 * M�todo agregado
	 * @param aValue
	 * @return
	 */
	@SuppressWarnings("unchecked")
    @Override
	public boolean equals(Object aValue) {
		if (aValue == null) return false;
		if (!(aValue instanceof SingleValue)) return false;
		
		if (this.getValue().equals(((SingleValue<Object>)aValue).getValue()))
			return true;
		else return false;
	}
}
