/**
 * @see "Categor�a Sukia Reasoner en SUKIA SmallTalk"
 */
package system;

import jade.util.leap.ArrayList;
import jade.util.leap.Iterator;
import jade.util.leap.List;
import jade.util.leap.Set;
import jade.util.leap.SortedSetImpl;
import ontology.CBR.CertaintyDegree;
import ontology.CBR.Hypothesis;
import ontology.CBR.PossibleSolution;
import ontology.CBR.ProposedSolution;
import ontology.taxonomy.TaxonomicRank;


/**
 * @author Armando
 *
 */
public class PossibleSolutionSelector {
	private List failureConflictSet;
	private List successfulConflictSet;
	private List generalSolutions;
	private List goalSolutions;
	private List specificSolutions;
	private TaxonomicRank identificationGoal;
	private int maxNumberSolutions;
	private boolean showFailedSolutions;
	private boolean status;

	/**
	 * M�todo de instancia agregado
	 */
	public PossibleSolutionSelector() {
		super();
	}
	
	/**
	 * USER EXPECTATION: aNumberOfSolutions is an integer argument, that determines the maximum number of solutions the user wants to see.
	 * USER EXPECTATION: showFailed is a boolean argument, that determines whether or not to show failed solutions to the user.
	 * @see "M�todo initializeWith:and:and:and:and:and:and: del protocolo initializing en SUKIA SmallTalk"
	 */
	public PossibleSolutionSelector(TaxonomicRank anIdentGoal, List aSuccSList, 
			List aFailSList, int aNumberOfSolutions, boolean showFailed) {
		setIdentificationGoal(anIdentGoal);
		setSuccessfulConflictSet(aSuccSList);
		setFailureConflictSet(aFailSList);
		setMaxNumberSolutions(aNumberOfSolutions);
		setShowFailedSolutions(showFailed);

		setStatus(false);

		setGoalSolutions(new ArrayList());
		setSpecificSolutions(new ArrayList());
		setGeneralSolutions(new ArrayList());
	}

	/**
	 * M�todo de instancia agregado
	 * @param failedStructConflictSet
	 */
	public void setFailureConflictSet(List failedStructConflictSet) {
		this.failureConflictSet = failedStructConflictSet;
	}

	/**
	 * @see "M�todo failedStructConflictSet del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public List getFailureConflictSet() {
		return failureConflictSet;
	}

	/**
	 * M�todo de instancia agregado
	 * @param generalSolutions
	 */
	public void setGeneralSolutions(List generalSolutions) {
		this.generalSolutions = generalSolutions;
	}

	/**
	 * @see "M�todo generalSolutions del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public List getGeneralSolutions() {
		return generalSolutions;
	}

	/**
	 * M�todo de instancia agregado
	 * @param goalSolutions
	 */
	public void setGoalSolutions(List goalSolutions) {
		this.goalSolutions = goalSolutions;
	}

	/**
	 * @see "M�todo generalSolutions: del protocolo adding en SUKIA SmallTalk"
	 * @param aProposedSolution
	 */
	public void addGeneralSolution(ProposedSolution aProposedSolution) {
		this.getGeneralSolutions().add(aProposedSolution);
		this.sortProposedSolutions(this.getGeneralSolutions());
		//Collections.sortPossibleSolutions(this.getGeneralSolutions());
	}
	
	/**
	 * @see "M�todo goalSolutions del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public List getGoalSolutions() {
		return goalSolutions;
	}

	/**
	 * M�todo de instancia agregado
	 * @param identificationGoal
	 */
	public void setIdentificationGoal(TaxonomicRank identificationGoal) {
		this.identificationGoal = identificationGoal;
	}
	
	/**
	 * @see "M�todo goalSolutions: del protocolo adding en SUKIA SmallTalk"
	 * @param aProposedSolution
	 */
	public void addGoalSolution(ProposedSolution aProposedSolution) {
		this.getGoalSolutions().add(aProposedSolution);
		this.sortProposedSolutions(this.getGoalSolutions());
		//Collections.sortPossibleSolutions(this.getGoalSolutions());
	}

	/**
	 * @see "M�todo identificationGoal del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public TaxonomicRank getIdentificationGoal() {
		return identificationGoal;
	}

	/**
	 * M�todo de instancia agregado
	 * @param maxNumberSolutions
	 */
	public void setMaxNumberSolutions(int maxNumberSolutions) {
		this.maxNumberSolutions = maxNumberSolutions;
	}

	/**
	 * @see "M�todo maxNumberSolutions del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public int getMaxNumberSolutions() {
		return maxNumberSolutions;
	}

	/**
	 * M�todo de instancia agregado
	 * @param showFailedSolutions
	 */
	public void setShowFailedSolutions(boolean showFailedSolutions) {
		this.showFailedSolutions = showFailedSolutions;
	}

	/**
	 * @see "M�todo showFailedSolutions del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public boolean isShowFailedSolutions() {
		return showFailedSolutions;
	}

	/**
	 * Mpetodo de instancia agregado
	 * @param specificSolutions
	 */
	public void setSpecificSolutions(List specificSolutions) {
		this.specificSolutions = specificSolutions;
	}

	/**
	 * @see "M�todo specificSolutions del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public List getSpecificSolutions() {
		return specificSolutions;
	}
	
	/**
	 * @see "M�todo specificSolutions: del protocolo adding en SUKIA SmallTalk"
	 * @param aProposedSolution
	 */
	public void addSpecificSolution(ProposedSolution aProposedSolution) {
		this.getSpecificSolutions().add(aProposedSolution);
		this.sortProposedSolutions(this.getSpecificSolutions());
		//Collections.sortPossibleSolutions(this.getSpecificSolutions());
	}

	/**
	 * M�todo de instancia agregado
	 * @param successfulStructConflictSet
	 */
	public void setSuccessfulConflictSet(List successfulStructConflictSet) {
		this.successfulConflictSet = successfulStructConflictSet;
	}

	/**
	 * @see "M�todo successfulStructConflictSet del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public List getSuccessfulConflictSet() {
		return successfulConflictSet;
	}

	/**
	 * @see "M�todo status: del protocolo adding en SUKIA SmallTalk"
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
	 * This method takes as argument a list of possible solutions, sorted by their point score. Each possible
	 * solution has a taxonomic level, which can be represented numerically. This level is compared against
	 * the [numeric representation of the] level stated in the identification goal. If the possible solution's
	 * level is less than the stated identification goal, then that possible solution is added to the general
	 * -solutions list. If the level is equal to the stated identification goal, the possible solution is
	 * added to the goal-solutions list. Finally, if the level is greater than the stated identification goal,
	 * the possible solution is added to the specific-solutions list.
	 * NOTE: Since the argument is a sorted list, then the first elements to be added to any of the solutions
	 * lists are those with the highest scores.
	 * The process will stop when either of these conditions hold:
	 * 1) The number of elements in the goal-solutions list is equal to the maximum number of solutions
	 * expected by the user.
	 * 2) The number of elements in the specific-solutions list is equal to the maximum number of solutions
	 * expected by the user.
	 * 3) The sum of the elements belonging to the goal-solutions and specific-solutions lists is greater than
	 * or equal to the maximum number of solutions expected by the user.
	 * 4) The argument aSortedPossibleSolutionsList is empty.
	 * PRECONDITION: aSortedPossibleSolutionsList is NOT empty.
	 * @see "M�todo distribute: del protocolo selecting solutions en SUKIA SmallTalk"
	 * Returns: self. The process ran OK.
	 * @return
	 */
	public boolean distribute(List aSortedPossibleSolutionsList) {
		ProposedSolution ps;
		int max, goalLevel, i, psLevel;
		
		// Check the precondition
		if (aSortedPossibleSolutionsList.isEmpty())
			return false;

		// Get the maximum number of elements that can be added  to any solutions list
		if (aSortedPossibleSolutionsList.size() <= this.getMaxNumberSolutions())
			max = aSortedPossibleSolutionsList.size();
		else max = this.getMaxNumberSolutions();

		// Get the identification goal as number
		goalLevel = TaxonomicRank.getIndex(this.getIdentificationGoal());

		i = 1;
		while (i <= max) {
			ps = new ProposedSolution();
			ps.setStatus(this.isStatus());
			ps.setSolution((PossibleSolution)aSortedPossibleSolutionsList.remove(0));

			if (ps.getSolution().getPoints() < 0.0) ps.setCertaintyDegree(CertaintyDegree.UNCERTAIN);
			if (ps.getSolution().getPoints() == 0.0) ps.setCertaintyDegree(CertaintyDegree.DOUBTFUL);
			if (ps.getSolution().getPoints() > 0.0) ps.setCertaintyDegree(CertaintyDegree.CERTAIN);
			
			psLevel = TaxonomicRank.getIndex(ps.getSolution().getLevel());

			// If applicable, insert the new proposed solution to the general solutions list
			if ((psLevel < goalLevel) && (this.getGeneralSolutions().size() < this.getMaxNumberSolutions()))
				this.addGeneralSolution(ps);

			// If applicable, insert the new proposed solution to the goal solutions list
			if ((psLevel == goalLevel) && (this.getGoalSolutions().size() < this.getMaxNumberSolutions()))
				this.addGoalSolution(ps);
			
			// If applicable, insert the new proposed solution to the specific solutions list
			if ((psLevel > goalLevel) && (this.getSpecificSolutions().size() < this.getMaxNumberSolutions()))
				this.addSpecificSolution(ps);

			i = i + 1;
		}

		/* Condition to stop the process: either the number of elements in either the specific or goal 
		 solutions lists is equal to maximum expected by the user, OR the sum of both lists satisfies
		 this user expectation*/
		if ((this.getGoalSolutions().size() == this.getMaxNumberSolutions()) ||
	            (this.getSpecificSolutions().size() == this.getMaxNumberSolutions()) ||
	            ((this.getGoalSolutions().size() + this.getSpecificSolutions().size()) >= this.getMaxNumberSolutions()))
			return true;

		// Try to load some more PossibleSolutions to the solutions lists
		return this.distribute(aSortedPossibleSolutionsList);
	}
	
	/**
	 * Driver method for this class. First, it calls method sortPossibleSolutions, in order to sort the possible
	 * solutions (by point score) of all eligible hypotheses included in the conflict sets. Next, the method
	 * distribute: is called, in order to distribute all sorted-out possible solutions into their corresponding
	 * solutions lists. Finally, an attempt is made to extract, from the goal-solutions list first, the number of
	 * proposed solutions that the user is willing to see.  If that list becomes empty, the specific-solutions
	 * list is used instead. Finally, if the specific-solutions list also becomes empty, the general-solutions
	 * list is used as last resort.
	 * The solution lists are ordered by degree of certainty and by point score also. Hence, the first elements
	 * to be subtracted from each of the solutions lists are the best ones.
	 * @see "M�todo select del protocolo selecting solutions en SUKIA SmallTalk"
	 * Returns: an empty list, OR a list with THE BEST identification solutions.
	 * @return
	 */
	public List select() {
		List proposedSolutionsList;
		List solutions;
		int i;
		
		proposedSolutionsList = this.sortPossibleSolutions();
		solutions = new ArrayList();

		if (proposedSolutionsList.isEmpty())
			return solutions;

		this.distribute(proposedSolutionsList);

		i = 1;
		while (i <= this.getMaxNumberSolutions()) {
			if (!(this.getGoalSolutions().isEmpty()))
				solutions.add(this.getGoalSolutions().remove(0));
			else { 
				if (!(this.getSpecificSolutions().isEmpty()))
					solutions.add(this.getSpecificSolutions().remove(0));
				else {
					if (!(this.getGeneralSolutions().isEmpty()))
						solutions.add(this.getGeneralSolutions().remove(0));
					else i = this.getMaxNumberSolutions();
				}

			} 

			i = i + 1;
		}
		
		return solutions;
	}
	
	/**
	 * This method sorts possible solutions by their point scores.
	 * Returns: a [possibly empty] sorted possible solutions list.
	 * @see "M�todo sortPossibleSolutions del protocolo selecting solutions en SUKIA SmallTalk"
	 * @return
	 */
	public List sortPossibleSolutions() {
		List pSolutions;
		//Hypothesis hypothesis;
	
		/* All possible solutions will be sorted by their point number: those with higher scores will 
		 be at the beginning of the list*/
		pSolutions = new ArrayList();

		// FIRST CHOICE: Load all successful (i.e., positive) structure possible solutions, if any
		Iterator i = this.getSuccessfulConflictSet().iterator();
		
		while (i.hasNext()) {
			Hypothesis hypothesis = (Hypothesis) i.next(); 

			Iterator j = hypothesis.getPossibleSolutions().iterator();
			
			while (j.hasNext()) {
				PossibleSolution aPossibleSolution = (PossibleSolution) j.next();
                pSolutions.add(aPossibleSolution);
            }
        }
        
        this.sortPossibleSolutions(pSolutions);
        
		if (!(pSolutions.isEmpty())) {
			this.setStatus(true);
			return pSolutions;
		}

		/* If the user wants to see failed solutions, *in case there aren't any positive solutions*, 
		  load them in the list*/
		if (this.isShowFailedSolutions()) {
			// Load all failed (i.e., negative) structure possible solutions, if any
			i = this.getFailureConflictSet().iterator();
			
			while (i.hasNext()) {
				Hypothesis hypothesis = (Hypothesis) i.next(); 
				Iterator j = hypothesis.getPossibleSolutions().iterator();
				
				while (j.hasNext()) {
					PossibleSolution aPossibleSolution = (PossibleSolution) j.next();
                    pSolutions.add(aPossibleSolution);
                }
            }

            this.sortPossibleSolutions(pSolutions);
			if (!(pSolutions.isEmpty()))
				this.setStatus(false);
		}
		
		return pSolutions;
	}
	
	/**
	 * M�todo de instancia agregado
	 * @param pSolutions
	 */
	private void sortPossibleSolutions(List pSolutions) {
		java.util.List<PossibleSolution> anotherPSolutions = new java.util.ArrayList<PossibleSolution>();
		
		Iterator i = pSolutions.iterator();
		
		while (i.hasNext()) {
			anotherPSolutions.add((PossibleSolution)i.next());
		}
		
		java.util.Collections.sort(anotherPSolutions,
				new java.util.Comparator<PossibleSolution>() {
					public int compare(PossibleSolution elem1, PossibleSolution elem2) {
						if ((elem2.getPoints()	- elem1.getPoints()) > 0)
							return 1;
						else if ((elem2.getPoints() - elem1.getPoints()) < 0)
							return -1;
						else return 0;
					}
				}); //OJO buscar alternativa de ordenamiento
		
		pSolutions.clear();
		
		java.util.Iterator<PossibleSolution> j = anotherPSolutions.iterator();
		
		while (j.hasNext()) {
			pSolutions.add(j.next());
		}
	}
	
	private void sortProposedSolutions(List proposedSolutions) {
		Set proposedSolutionsSet = new SortedSetImpl();
		
		Iterator i = proposedSolutions.iterator();
		
		while (i.hasNext()) {
			proposedSolutionsSet.add(i.next());
		}
		
		proposedSolutions.clear();
		
		Iterator j = proposedSolutionsSet.iterator();
		
		while (j.hasNext()) {
			proposedSolutions.add(j.next());
		}
	}
}
