/**
 * @see "Categor�a Main de SUKIA Smalltalk"
 */
package main;

import java.util.ArrayList;
import java.util.List;

import domainTheory.Structure;


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
	private String solution;
	private Description<Descriptor<Object>> description;
	private Description<Descriptor<Object>> justification;
	private List<PredecessorNode> predecessors;
	private boolean state;
	
	/**
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk"
	 */
	public Case() {
		solution = null;
		description = new Description<Descriptor<Object>>();
		justification = new Description<Descriptor<Object>>();
		predecessors = new ArrayList<PredecessorNode>();
		state = false;
	}
	
	/**
	 * @see "M�todo solution del protocolo adding en SUKIA SmallTalk"
	 * @param solution
	 */
	public void setSolution(String solution) {
		this.solution = solution;
	}
	
	/**
	 * @see "M�todo solution del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public String getSolution() {
		return solution;
	}
	
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

	public void setPredecesor(List<PredecessorNode> predecesor) {
		this.predecessors = predecesor;
	}

	/**
	 * @see "M�todo predecessor del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public List<PredecessorNode> getPredecesors() {
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
	public void addPredecessor(Node aPredecessor, Object aValue) {
		PredecessorNode pn;
		pn = new PredecessorNode(aPredecessor, aValue); 
		predecessors.add(pn);
	}
	
	/**
	 * @see "M�todo removePredecessorWith:and: del protocolo removing en SUKIA SmallTalk"
	 * @param aPredecessor
	 * @param aValue
	 * @return
	 */
	public PredecessorNode removePredecessor(Node aPredecessor, Object aValue) {
		for( int i = 1; i <= predecessors.size(); i++) {
			if (predecessors.get(i-1).getValue().equals(aValue) && predecessors.get(i-1).getNode().equals(aPredecessor))
				return predecessors.remove(i-1);
		}
		
		return null;
	}
	
	/**
	 * Clears and resets all of the case's instance variables
	 * @see "M�todo flush del protocolo resetting en SUKIA SmallTalk"
	 */
	public void clear() {
		this.getDescription().clear();
		solution = null;
		this.getJustification().clear();
		this.getPredecesors().clear();
		this.setState(false);
	}
	
	/**
	 * Implemented by SAVCase.  For polymorphism reasons, this method is needed by Case, since a net may be composed of Case's or SAVCase's
	 * @see "M�todo currentStructure del protocolo special en SUKIA SmallTalk"
	 * @return
	 */
	public String currentStructure() {
		return null;
	}

	/**
	 * Implemented by SAVCase.  For polymorphism reasons, this method is needed by Case, since a net may be composed of Case's or SAVCase's
	 * @see "M�todo flushDescriptionCopy del protocolo special en SUKIA SmallTalk"
	 */
	public void flushDescriptionCopy() {
		
	}
	
	/**
	 * Implemented by SAVCase.  For polymorphism reasons, this method is needed by Case, since a net may be composed of Case's or SAVCase's
	 * @see "M�todo flushStructureCopy del protocolo special en SUKIA SmallTalk"
	 */
	public void flushStructureCopy() {
		
	}
	
	/**
	 * Implemented by SAVCase.  For polymorphism reasons, this method is needed by Case, since a net may be composed of Case's or SAVCase's
	 * @see "M�todo prepareDescriptionWith del protocolo special en SUKIA SmallTalk"
	 * @param aStructure
	 */
	public void prepareDescriptionWith(Structure aStructure) {

	}
	
	/**
	 * Implemented by SAVCase.  For polymorphism reasons, this method is needed by Case, since a net may be composed of Case's or SAVCase's
	 * @see "M�todo restoreDescription del protocolo special en SUKIA SmallTalk"
	 */
	public void restoreDescription() {

	}
}