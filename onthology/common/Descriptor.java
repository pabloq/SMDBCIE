/**
 * @see "Categor�a Main de SUKIA Smalltalk"
 */
package onthology.common;

/**
 * Descriptor es un elemento descriptivo de una descripci�n de un caso: el par attribute-value.
 * Generaliza conceptos en normas.
 * Todas las ra�ces de red (especializaci�nes de normas) contienen un descriptor de la forma (nil, nil),
 * ya que ning�n par attribute-value particular generaliza todos los casos bajo ellos.
 * 
*/
public class Descriptor<T> implements Comparable<Descriptor<T>> {
	private String structure;
	private String attribute;
	private T value;
	
	/**
	 * Class instance invariant: self MUST always have exactly two values. The first
	 * element corresponds to the descriptor's attribute, and the second one to the value.
	 * Extreme care should be taken when using this method, as it assumes an empty self."
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk"
	 */
	public Descriptor() {
		this.setStructure(null);
		this.setAttribute(null);
		this.setValue(null);
	}
	
	/**
	 * Sets self to default values: self = (nil, nil)
	 * @see "M�todo clear del protocolo initializing en SUKIA SmallTalk"
	 */
	public void clear() {
		this.setStructure(null);
		this.setAttribute(null);
		this.setValue(null);
	}
	
	/**
	 * @see "M�todo addStructure: del protocolo adding-private en SUKIA SmallTalk"
	 * @param structure
	 */
	public void setStructure(String structure) {
		this.structure = structure;
	}
	
	/**
	 * @see "M�todo structure del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public String getStructure() {
		return structure;
	}

	/**
	 * @see "M�todo addStructure:Attribute:Value: del protocolo adding en SUKIA SmallTalk"
	 * @param aStructure
	 * @param anAttribute
	 * @param aValue
	 */
	public void add(String aStructure, String anAttribute, T aValue) {
		this.setStructure(aStructure);
		this.setAttribute(anAttribute);
		this.setValue(aValue);
	}
    
	/**
	 * @see "M�todo addAttribute: del protocolo adding-private en SUKIA SmallTalk"
	 * @param attribute
	 */
    public void setAttribute(String attribute) {
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
	 * M�todo de instancia agregado
	 */
	public int compareTo(Descriptor<T> aDescriptor) {
		return this.getStructure().concat(this.getAttribute()).compareTo(aDescriptor.getStructure().concat(aDescriptor.getAttribute()));
	}
}
