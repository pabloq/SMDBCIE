/**
 * @see "Categor�a Main de SUKIA Smalltalk"
 */
package main;

/**
 * Descriptor es un elemento descriptivo de una descripci�n de un caso: el par attribute-value.
 * Generaliza conceptos en normas.
 * Todas las ra�ces de red (especializaci�nes de normas) contienen un descriptor de la forma (nil, nil),
 * ya que ning�n par attribute-value particular generaliza todos los casos bajo ellos.
 * 
*/
public class Descriptor<T> {
	protected String attribute;
	protected T value;
	
	/**
	 * Class instance invariant: self MUST always have exactly two values. The first
	 * element corresponds to the descriptor's attribute, and the second one to the value.
	 * Extreme care should be taken when using this method, as it assumes an empty self."
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk"
	 */
	public Descriptor() {
		this.setAttribute(null);
		this.setValue(null);
	}
	
	/**
	 * Sets self to default values: self = (nil, nil)
	 * @see "M�todo clear del protocolo initializing en SUKIA SmallTalk"
	 */
	public void clear() {
		this.setAttribute(null);
		this.setValue(null);
	}
    
	/**
	 * @see "M�todo addAttribute: del protocolo adding-private en SUKIA SmallTalk"
	 * @param attribute
	 */
    private void setAttribute(String attribute) {
    	this.attribute = attribute;
    }
    
    /**
     * @see "M�todo attribute del protocolo accessing en SUKIA SmallTalk"
     * @return
     */
    public String getAttribute() {
    	return attribute;
    }

    /**
     * @see "M�todo value del protocolo accessing en SUKIA SmallTalk"
     * @return
     */
	public T getValue() {
		return value;
	}

	/**
	 * @see "M�todo addValue: del protocolo adding-private en SUKIA SmallTalk"
	 * @param value
	 */
	private void setValue(T value) {
		this.value = value;
	}
	
	/**
	 * @see "M�todo addAttribute:withValue: del protocolo adding en SUKIA SmallTalk"
	 * @param anAttribute
	 * @param aValue
	 */
	public void add(String anAttribute, T aValue) {
		this.setAttribute(anAttribute);
		this.setValue(aValue);
	}
}
