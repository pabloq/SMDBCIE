/**
 * @see "Categor�a Sukia Reasoner en SUKIA SmallTalk"
 */
package reasoner;

/**
 * @author Armando
 *
 */
public class ProposedSolution implements Comparable<ProposedSolution> {
	private String degreeOfCertainty;
	private PossibleSolution solution;
	private boolean status;

	/**
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk"
	 */
	public ProposedSolution() {
		this.setSolution(null);
		this.setStatus(true);
		this.setDegreeOfCertainty("unknown");
	}

	/**
	 * The only possible values for this variable are:
	 * #unknown or #uncertain or #doubfult or #certain
	 * @param degreeOfCertainty
	 */
	public boolean setDegreeOfCertainty(String aDegreeOfCertainty) {
		if (!(aDegreeOfCertainty.equals("unknown") ||
		 aDegreeOfCertainty.equals("uncertain") ||
		 aDegreeOfCertainty.equals("doubfult") ||
		 aDegreeOfCertainty.equals("certain")))
			return false;

		this.degreeOfCertainty = aDegreeOfCertainty;
		
		return true;
	}

	/**
	 * @see "M�todo degreeOfCertainty del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public String getDegreeOfCertainty() {
		return degreeOfCertainty;
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
		return (aProposedSolution.getDegreeOfCertainty().compareTo(this.getDegreeOfCertainty()));
	}
}
