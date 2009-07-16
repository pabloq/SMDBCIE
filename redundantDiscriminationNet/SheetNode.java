/**
 * @see "Categor�a Main de SUKIA Smalltalk"
 */
package redundantDiscriminationNet;

import java.util.List;

import main.Case;
import main.Descriptor;


/**
 * Purpose: Structure that groups (generalizes) a set of cases that share a common Descriptor.  Such cases may be
 * linked directly to the norm (when the cases' descriptions terminate at the Norm), or accessed via indices.  A Norm
 * may NOT directly point to another Norm.
 * IMPORTANT NOTES:
 * 1. There shall be no Index or Case duplication in the Norm's list of successors.
 * 3. A Norm may exist only in the context of a net.
 * 4. The only valid predecessor for an Norm is either an Index.
 * @author Armando
 *
 */
public class SheetNode extends Node {
	private Descriptor<Object> descriptor; //depicting the grouping (generalizing) concept
	private Case aCase;

	/**
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk"
	 */
	public SheetNode() {
		descriptor = null;
		aCase = null;
	}

	/**
	 * @see "M�todo descriptor del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public Descriptor<Object> getDescriptor() {
		return descriptor;
	}

	/**
	 * Sets the variable descriptor with the value of aDescriptor
	 * @see "M�todo descriptor: del protocolo adding en SUKIA SmallTalk"
	 * @param descriptor
	 */
	public void setDescriptor(Descriptor<Object> descriptor) {
		this.descriptor = descriptor;
	}
	
	/**
	 * @see "M�todo addSuccessor: del protocolo adding en SUKIA SmallTalk"
	 */
	public boolean addSuccessor(Node aSuccessor) {
		return true;
	}
	
	/**
	 * @see "M�todo successors del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public List<Node> getSuccessors() {
		return null;
	}
	
	/**
	 * M�todo de instancia agregado 
	 * @param successors
	 */
	public void setSuccessors(List<Node> successors) {
		
	}

	/**
	 * @see "M�todo numCases del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public Case getCase() {
		return aCase;
	}
	
	public void setCase(Case aCase) {
		this.aCase = aCase;
	}
	
	/**
	 * @see "M�todo value del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public Object getValue() {
		if (this.getDescriptor() != null)
			return this.getDescriptor().getValue();
		
		return null;
	}
}
