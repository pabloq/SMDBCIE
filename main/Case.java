package main;

import java.util.ArrayList;
import java.util.List;


/**
 * Case representa un caso que es una representaci�n de una situaci�n, donde una descripci�n
 * (i.e., un conjunto de objetos Descriptor) y una soluci�n ilustra como un problema particular fue resuelto
 * Adem�s, una justificaci�n explica las razones de soluci�n del caso.  Cuando un caso (problema) se resuelve,
 * se agrega a una red para referencia futura v�a m�todos de b�squeda heuristica
 * @author Armando
 *
 */
public class Case extends Node {
	private String solution;
	private List<Descriptor> description;
	private List<Descriptor> justification;
	private List predecessors;
	private Boolean state;
	
	public Case() {
		solution = "";
		description = new ArrayList<Descriptor>();
		justification = new ArrayList<Descriptor>();
		predecessors = new ArrayList();
		state = null;
	}
	
	public void setSolution(String solution) {
		this.solution = solution;
	}
	
	public String getSolution() {
		return solution;
	}
	
	public void setDescription(List<Descriptor> description) {
		this.description = description;
	}
	
	public List<Descriptor> getDescription() {
		return description;
	}

	public void setJustification(List<Descriptor> justification) {
		this.justification = justification;
	}

	public List<Descriptor> getJustification() {
		return justification;
	}

	public void setPredecesor(List predecesor) {
		this.predecessors = predecesor;
	}

	public List getPredecesor() {
		return predecessors;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public Boolean getState() {
		return state;
	}
}