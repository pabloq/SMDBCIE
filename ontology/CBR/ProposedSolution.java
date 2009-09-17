/**
 * @see "Categor�a Sukia Reasoner en SUKIA SmallTalk"
 */
package ontology.CBR;

import system.CertaintyDegree;



/**
 * @author Armando
 *
 */
public class ProposedSolution implements Comparable<ProposedSolution> {
	private CertaintyDegree certaintyDegree;
	private PossibleSolution solution;
	private boolean status;

	/**
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk"
	 */
	public ProposedSolution() {
		this.setSolution(null);
		this.setStatus(true);
		this.setCertaintyDegree(CertaintyDegree.UNKNOWN);
	}

	/**
	 * The only possible values for this variable are:
	 * #unknown or #uncertain or #doubfult or #certain
	 * @param certaintyDegree
	 */
	public void setCertaintyDegree(CertaintyDegree aCertaintyDegree) {
		this.certaintyDegree = aCertaintyDegree;
	}

	/**
	 * @see "M�todo degreeOfCertainty del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public CertaintyDegree getCertaintyDegree() {
		return certaintyDegree;
	}

	/**
	 * @see "M�todo solution: del protocolo adding en SUKIA SmallTalk"
	 * @param solution
	 */
	public void setSolution(PossibleSolution solution) {
		this.solution = solution;
	}

	/**
	 * @see "M�todo solution del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public PossibleSolution getSolution() {
		return solution;
	}

	/**
	 * The only possible values for this variable are:
	 * #+ (a positive PossibleSolution)
	 * #- (a negative PossibleSolution)"
	 * @param status
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @see "M�todo status del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * M�todo de instancia agregado
	 */
	public int compareTo(ProposedSolution aProposedSolution) {
		return (aProposedSolution.getCertaintyDegree().compareTo(this.getCertaintyDegree()));
	}
}
