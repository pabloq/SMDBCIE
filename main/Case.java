/**
 * @see "Categor�a Main de SUKIA Smalltalk"
 */
package main;

import java.util.ArrayList;
import java.util.List;

import reasoner.CaseSolution;

import auxiliary.SingleIndexValue;


/**
 * Case representa un caso que es una representaci�n de una situaci�n, donde una descripci�n
 * (i.e., un conjunto de objetos Descriptor) y una soluci�n ilustra como un problema particular fue resuelto
 * Adem�s, una justificaci�n explica las razones de soluci�n del caso.  Cuando un caso (problema) se resuelve,
 * se agrega a una red para referencia futura v�a m�todos de b�squeda heuristica
 * @see "Categor�a Main de SUKIA Smalltalk"
 * @author Armando
 *
 */
public class Case extends Node {
	private CaseSolution solution; // An object that represents the solution to the case.  Such object may be a text string, or a compund object with more associated information.
	private Description<Descriptor<Object>> description; // A list containing a set of Descriptor's (a description of the problem)
	private Description<Descriptor<Object>> justification; // A list containing a set of Descriptor's (the solution path of the case, i.e., the result of the traversal across the net and other reference structures). 
	private List<SingleIndexValue<Node>> predecessors; // A list containing links to the case's predecessor norms and/or indices within the net. 
	private boolean state; // A case may be "positive" (i.e., the given solution is correct) or "negative" (i.e., the given solution is incorrect)
	
	/**
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk"
	 */
	public Case() {
		solution = null;
		description = new Description<Descriptor<Object>>();
		justification = new Description<Descriptor<Object>>();
		predecessors = new ArrayList<SingleIndexValue<Node>>();
		state = false;
	}
	
	/**
	 * @see "M�todo solution del protocolo adding en SUKIA SmallTalk"
	 * @param solution
	 */
	public void setSolution(CaseSolution solution) {
		this.solution = solution;
	}
	
	/**
	 * @see "M�todo solution del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public CaseSolution getSolution() {
		return solution;
	}
	
	/**
	 * M�todo de instancia agregado
	 * @param description
	 */
	public void setDescription(Description<Descriptor<Object>> description) {
		this.description = description;
	}
	
	/**
	 * @see "M�todo description del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public Description<Descriptor<Object>> getDescription() {
		return description;
	}

	/**
	 * M�todo de instancia agregado
	 * @param justification
	 */
	public void setJustification(Description<Descriptor<Object>> justification) {
		this.justification = justification;
	}

	/**
	 * @see "M�todo justification del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public Description<Descriptor<Object>> getJustification() {
		return justification;
	}

	public void setPredecesor(List<SingleIndexValue<Node>> predecesor) {
		this.predecessors = predecesor;
	}

	/**
	 * @see "M�todo predecessor del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public List<SingleIndexValue<Node>> getPredecessors() {
		return predecessors;
	}

	/**
	 * @see "M�todo state del protocolo adding en SUKIA SmallTalk"
	 * @param state
	 */
	public void setState(boolean state) {
		this.state = state;
	}

	/**
	 * @see "M�todo state del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public boolean getState() {
		return state;
	}
	
	/**
	 * Argument aPredecessor can be an Index or a Norm
	 * @see "M�todo addPredecessorWith:and: del protocolo adding en SUKIA SmallTalk"
	 * @param aPredecessor
	 */
	public boolean addPredecessor(Node aPredecessor, Object aValue) {
		SingleIndexValue<Node> pn;
		
		pn = new SingleIndexValue<Node>();
		pn.setValue(aValue);
		pn.setSuccessor(aPredecessor);
		
		if (!(this.getPredecessors().contains(pn)))
			predecessors.add(pn);
		
		return true;
	}
	
	/**
	 * Appends aDescriptor to the variable description
	 * @see "M�todo addToDescription: del protocolo adding en SUKIA SmallTalk"
	 * @param aDescriptor
	 * @return
	 */
	public boolean addToDescription(Descriptor<Object> aDescriptor) {
		if (this.getDescription().contains(aDescriptor))
			return false;
		this.getDescription().add(aDescriptor);
		
		return true;
	}
	
	/**
	 * Appends aDescriptor to the variable description
	 * @see "M�todo addToJustification: del protocolo adding en SUKIA SmallTalk"
	 * @param aDescriptor
	 * @return
	 */
	public boolean addToJustification(Descriptor<Object> aDescriptor) {
		if (this.getDescription().contains(aDescriptor))
			return false;
		this.getJustification().add(aDescriptor);
		
		return true;
	}
	
	/**
	 * @see "M�todo removePredecessorWith:and: del protocolo removing en SUKIA SmallTalk"
	 * @param aPredecessor
	 * @param aValue
	 * @return
	 */
	public boolean removePredecessor(Node aPredecessor, Object aValue) {
		for( int i = 1; i <= predecessors.size(); i++) {
			if (predecessors.get(i-1).getValue().equals(aValue) && predecessors.get(i-1).getSuccessor().equals(aPredecessor))
				predecessors.remove(i-1);
				return true;
		}
		
		return false;
	}
	
	/**
	 * Clears and resets all of the case's instance variables
	 * @see "M�todo flush del protocolo resetting en SUKIA SmallTalk"
	 */
	public void clear() {
		this.getDescription().clear();
		solution = null;
		this.getJustification().clear();
		this.getPredecessors().clear();
		this.setState(false);
	}
	
	/**
	 * Implemented by SAVCase.  For polymorphism reasons, this method is needed by Case, since a net may be composed of Case's or SAVCase's
	 * @see "M�todo currentStructure del protocolo special en SUKIA SmallTalk"
	 * @return
	 */
	public String getCurrentStructure() {
		return null;
	}
	
	/**
	 * Implemented by SAVCase.  For polymorphism reasons, this method is needed by Case, since a net may be composed of Case's or SAVCase's
	 * @see "M�todo flushDescriptionCopy del protocolo special en SUKIA SmallTalk"
	 * @return
	 */
	public void flushDescriptionCopy() {

	}
	
	/**
	 * Implemented by SAVCase.  For polymorphism reasons, this method is needed by Case, since a net may be composed of Case's or SAVCase's
	 * @see "M�todo flushStructureCopy del protocolo special en SUKIA SmallTalk"
	 * @return
	 */
	public void flushStructureCopy() {

	}
	
	/**
	 * Implemented by SAVCase.  For polymorphism reasons, this method is needed by Case, since a net may be composed of Case's or SAVCase's
	 * @see "M�todo prepareDescriptionWith del protocolo special en SUKIA SmallTalk"
	 * @param aStructure
	 */
	public void prepareDescriptionWith(String aStructure) {

	}
	
	/**
	 * Implemented by SAVCase.  For polymorphism reasons, this method is needed by Case, since a net may be composed of Case's or SAVCase's
	 * @see "M�todo restoreDescription del protocolo special en SUKIA SmallTalk"
	 */
	public void restoreDescription() {

	}
}