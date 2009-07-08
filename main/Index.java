/**
 * @see "Categor�a Main de SUKIA Smalltalk"
 */
package main;

import java.util.ArrayList;
import java.util.List;

import auxiliary.IndexValue;

/**
 * Purpose: Structure that points to one or more Case's or Norm's, according to:
 * a) an attribute, and
 * b) a set of values that the attribute may have.
 * The identifier of an Index is its label, that is, the attribute name (e.g., shape, color). The elements pointed to are packed
 * in instances of IndexValue, and placed in a list.
 * IMPORTANT NOTES:1
 * 1. There must be at least one IndexValue for each Index.
 * 2. There shall be no value duplication in the Index's set of IndexValue's.
 * 3. An index may exist only in the context of a net.
 * 4. The only valid predecessor for an Index is either a Norm or net root.
 * @author Armando
 *
 */
public class Index extends Node {
	private String label; //A Symbol that represents an attribute.
	private List<IndexValue<Object>> successors; // List of IndexValues, each pointing to a case or a norm.
	private Norm predecessorNorm; // Pointer to the Index's predecessor norm.

	/**
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk" 
	 */
	public Index() {
		label = null;
		successors = new ArrayList<IndexValue<Object>>();
		predecessorNorm = null;
	}
	
	/**
	 * Clears and resets the Index's instance variables
	 * @see "M�todo clear del protocolo initializing en SUKIA SmallTalk"
	 */
	public void clear() {
		label = null;
		successors.clear();
		predecessorNorm = null;
	}

	/**
	 * @see "M�todo label del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @see "M�todo addLabel del protocolo adding en SUKIA SmallTalk"
	 * @param label
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * IMPORTANT NOTE: The only valid predecessor for an INDEX  is either a Norm or net root
	 * @see "M�todo addPredecessor del protocolo adding en SUKIA SmallTalk"
	 * @param predecessorNorm
	 */
	public void setPredecessorNorm(Norm predecessorNorm) {
		this.predecessorNorm = predecessorNorm;
	}

	/**
	 * @see "M�todo predecessor del protocolo navigating en SUKIA SmallTalk"
	 * @return
	 */
	public Norm getPredecessorNorm() {
		return predecessorNorm;
	}

	/**
	 * @see "M�todo successors del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public List<IndexValue<Object>> getSuccessors() {
		return successors;
	}
	
	/**
	 * M�todo de instancia agregado
	 * @param successors
	 */
	public void setSuccessors(List<IndexValue<Object>> successors) {
		this.successors = successors;
	}
	
	/**
	 * @see "M�todo addIndexValue: del protocolo adding en SUKIA SmallTalk"
	 * @param anIndexValue
	 */
	public boolean addIndexValue(IndexValue<Object> anIndexValue) {
		int i;
		IndexValue<Object> iv;
	
		// If argument is not an IndexValue, or if argument contains invalid data, do not add
		 if (!(anIndexValue.isValid())) return false;

		// If argument is already included, do not add
		if (this.isValueIncluded(anIndexValue.getValue()) || this.isSuccessorIncluded(anIndexValue.getSuccessors()))
			return false;

		iv = new IndexValue<Object>(anIndexValue.getValue(), anIndexValue.getSuccessors().get(0));
		
		i = 2;
		while (i <= anIndexValue.getSuccessors().size()) {
			iv.addSuccessor(anIndexValue.getSuccessors().get(i-1));
			i = i + 1;
		}

		this.getSuccessors().add(iv);
		
		return true;
	}
	
	/**
	 * @see "M�todo successors: del protocolo navigating en SUKIA SmallTalk"
	 * @param aValue
	 */
	
	public List<Node> getIndexValuesSuccessors(Object aValue) {
		for (int i = 1; i <= this.getSuccessors().size(); i++) {
			if (aValue == this.getSuccessors().get(i-1).getValue())
				return this.getSuccessors().get(i-1).getSuccessors();
		}
		
		return null;
	}
	
	/**
	 * @see "M�todo getIndexValueWith:aValue: del protocolo searching en SUKIA SmallTalk"
	 * @return
	 */
	public IndexValue<Object> getIndexValue(Object aValue) {
		if (this.getSuccessors().isEmpty()) return null;

		for (int i = 1; i <= this.getSuccessors().size(); i++) {
			if (this.getSuccessors().get(i-1).getValue() == aValue)
				return this.getSuccessors().get(i-1);
		}
		
		return null;
	}

	/**
	 * All successors of an Index are represented by instances of IndexValue, which have the form: (val, succ ) | ( val, succ1, ..., succN ).
	 * A successor succ may be a Norm, a Case, or a set of Cases. Since the number of successors for an IndexValue may vary (i.e., one or more),
	 * then, IndexValue returns them in a collection.
	 * Returns: true -  if there is at least ONE succesor, that belongs to any of the IndexValue successor lists, that matches an element in aSuccessorList;
	 * false - if there is no match; i.e., ALL elements in aSuccessorList are new.
	 * @see "M�todo getIndexValueWithaValue: del protocolo testing en SUKIA SmallTalk"
	 * @param aSuccessorList
	 * @return
	 */
	public boolean isSuccessorIncluded(List<Node> aSuccessorList) {
		List<Node> s;

		for (int i = 1; i <= this.getSuccessors().size(); i++) { 
			s = this.getSuccessors().get(i-1).getSuccessors();
			for (int j = 1; j <= this.getSuccessors().size(); j++) {
				if (s.contains(aSuccessorList.get(j-1))) return true;
			}
		}
		
		return false;
	}
	
	/**
	 * @see "M�todo isValueIncluded: del protocolo testing en SUKIA SmallTalk"
	 * @param aValue
	 * @return
	 */
	public boolean isValueIncluded(Object aValue) {
		for (int i = 1; i <= this.getSuccessors().size(); i++) {
			if (aValue == this.getSuccessors().get(i-1).getValue()) return true;
		}
		
		return false;
	}
}
