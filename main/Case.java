package main;

import jade.util.leap.ArrayList;
import jade.util.leap.List;


/**
 * Case representa un caso que es una representaci�n de una situaci�n, donde una descripci�n
 * (i.e., un conjunto de objetos Descriptor) y una soluci�n ilustra como un problema particular fue resuelto
 * Adem�s, una justificaci�n explica las razones de soluci�n del caso.  Cuando un caso (problema) se resuelve,
 * se agrega a una red para referencia futura v�a m�todos de b�squeda heuristica
 * @author Armando
 *
 */
public class Case implements jade.content.Concept {
	private static final long serialVersionUID = 5687089858125395496L;
	private String solution;
	private Description description;
	private Description justification;
	private List predecesor;
	private Boolean state;
	
	public Case() {
		solution = "";
		description = new Description();
		justification = new Description();
		predecesor = new ArrayList();
		state = null;
	}
	
	public void setSolution(String solution) {
		this.solution = solution;
	}
	
	public String getSolution() {
		return solution;
	}
	
	public void setDescription(Description description) {
		this.description = description;
	}
	
	public Description getDescription() {
		return description;
	}

	public void setJustification(Description justification) {
		this.justification = justification;
	}

	public Description getJustification() {
		return justification;
	}

	public void setPredecesor(List predecesor) {
		this.predecesor = predecesor;
	}

	public List getPredecesor() {
		return predecesor;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public Boolean getState() {
		return state;
	}
}