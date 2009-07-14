/**
 * @see "Categor�a Sukia Redundant Discriminant Net de SUKIA Smalltalk"
 */
package redundantDiscriminantNet;

import main.Descriptor;

/**
 * Purpose:  List that represents the structure x attribute x value tuple.  A SAVDescriptor is used to create case descriptions.
 * Upon creation, a Descriptor is of the form: ( nil nil nil ).
 * @author Armando
 *
 */
public class SAVDescriptor extends Descriptor<Object> implements Comparable<SAVDescriptor> {
	private String structure;
	
	/**
	 * Class instance invariant: self MUST always have exactly three values. The first element corresponds to the SAV descriptor's structure name,
	 * the second element corresponds to the structure's attribute, and the third one to the attribute's value.
	 * IMPORTANT NOTE: Extreme care should be taken when using this method, as it assumes an empty self.
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk" 
	 */
	public SAVDescriptor() {
		super();
		setStructure(null);
	}
	
	/**
	 * @see "M�todo addStructure: del protocolo adding-private en SUKIA SmallTalk"
	 * @param structure
	 */
	private void setStructure(String structure) {
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
	public void add(String aStructure, String anAttribute, Object aValue) {
		this.setStructure(aStructure);
		super.add(anAttribute, aValue);
	}
	
	/**
	 * Sets self to default values: self = (nil, nil)
	 * @see "M�todo clear del protocolo initializing en SUKIA SmallTalk"
	 */
	public void clear() {
		this.setStructure(null);
		super.clear();
	}
	
	/**
	 * M�todo de instancia agregado
	 */
	public int compareTo(SAVDescriptor aSAVDescriptor) {
		return this.getStructure().concat(this.getAttribute()).compareTo(aSAVDescriptor.getStructure().concat(aSAVDescriptor.getAttribute()));
	}
}
