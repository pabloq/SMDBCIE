/**
 * @see "Categor�a Sukia Redundant Discriminant Net de SUKIA Smalltalk"
 */
package redundantDiscriminantNet;

import main.RootNorm;

/**
 * Purpose: Specialization of a RootNorm, and its mission is to act as a net's entry point.  The three most important features of a SAVRoot
 * are: 1. it does not have a predecessor, 2. its Descriptor is of the form ( nil nil ), and 3. it is identified by a structure name.
 * @author Armando
 *
 */
public class SAVRoot extends RootNorm {
	private String structure;

	/**
	 * Initializes the local variables for this sublcass.  The predecessor's variables have already been initialized when method new was executed.
	 * @see "M�todo initializeWith: del protocolo initializing en SUKIA SmallTalk"
	 * @param aStructureName
	 */
	public SAVRoot(String aStructureName) {
		this.setStructure(aStructureName);
	}

	/**
	 * M�todo de instancia agregado
	 * @param aStructureName
	 */
	public void setStructure(String  aStructureName) {
		this.structure = aStructureName;
	}

	/**
	 * @see "M�todo structure del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public String getStructure() {
		return structure;
	}

}
