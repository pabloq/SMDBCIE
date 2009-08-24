/*
 * @see "Categor�a output de SUKIA Smalltalk"
 * 
 */

package system.searchAutomata.output;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ontology.taxonomy.Taxon;
import ontology.taxonomy.TaxonomicRank;
import ontology.taxonomy.Taxonomy;
import system.PossibleSolution;


/**
 * Instances of this class will contain the output values of Depth-First Searches (DFS) done on the Case Memory.
 * @author pabloq
 */
public class DFSAutomatonOutput extends SearchAutomatonOutput {
    private Taxonomy taxonomy;
    private static final Comparator<PossibleSolution>  compareByPossibleSolutionLevels = new Comparator<PossibleSolution>() {
                @Override
                public int compare(PossibleSolution o1, PossibleSolution o2) {
                    if (TaxonomicRank.getIndex(o1.getLevel())<TaxonomicRank.getIndex(o2.getLevel())){
                        return -1;
                    }else if (TaxonomicRank.getIndex(o1.getLevel()) == TaxonomicRank.getIndex(o2.getLevel())){
                        return 0;
                    }else{
                        return 1;
                    }
                }
   };
    public DFSAutomatonOutput(){
        taxonomy = null;
    }
    
	/**
	 * Every PossibleSolution contains a search path for the given descriptive element. Thus, there may exist possible solutions
	 * (with different search paths) that are either: a) the same case or b) a successor taxon of another possible solution.  What this
	 * method does is to place the solution descriptions of several possible solutions (that refer to the same taxon) in a single one,
	 * and to inherit the solution description of a predecessor possible-solution taxon.
	 * Precondition: (self possibleSolutions size &gt; 1) &amp;&amp; (self taxonomy is NOT nil).
	 * Returns: 	nil - If the precondition is NOT met.
	 * self - If the process runs OK.
	 * Category private
	 */
    public boolean compress(){
    	List<PossibleSolution> processList, tempList;
    	PossibleSolution ps, compSolution;
    	Taxon psTaxon, compSolutionTaxon;
    	int i;
    	
    	// Check precondition
    	if ((this.getPossibleSolutions().size() < 2) || this.getTaxonomy() == null)
    		return false;

    	// Make the process list a sorted list ordered by taxonomic level, most specific level first
    	processList = new ArrayList<PossibleSolution>();

    	// Empty all possible solutions into the sorted-by-taxonomic-level list
    	while (!(this.getPossibleSolutions().isEmpty())) {
    			processList.add(this.getPossibleSolutions().remove(0));
    	}
        Collections.sort(processList,compareByPossibleSolutionLevels);


    	tempList = new ArrayList<PossibleSolution>();

    	// Scan the process list
    	while (!(processList.isEmpty())) {
    		// Remove the next possible solution from the process list
    		ps = processList.remove(0);

    		// Get the corresponding taxon of the SAVCase
    		psTaxon = this.getTaxonomy().getTaxonFromLevelIndex(ps.getName(), ps.getLevel());

    		// Compare ps against the rest of the possible solutions in processList
    		i = 1;
    		while (i <= processList.size()) {
    			// Get the next possible solution to compare against
    			compSolution = processList.get(i-1);

    			// Check if the proposed solutions are the same object
    			if (ps.getSolution() == compSolution.getSolution()) {
    				// Inherit the compare solution's descriptions and remove it from aPossibleSolutionsList
    				this.inheritPossibleSolutionDescriptionsFrom(compSolution, ps);
    				processList.remove(i-1);
    			} else {
    				// At this point, ps and compSolution are different cases
					compSolutionTaxon = this.getTaxonomy().getTaxonFromLevelIndex(compSolution.getName(), compSolution.getLevel());

					if (psTaxon.isSuccessorOf(compSolutionTaxon))
						this.inheritPossibleSolutionDescriptionsFrom(compSolution, ps);

					i = i + 1;
    			}
    		}
    		// Place the current possible solution in a temporary list
    		tempList.add(ps);
    		ps = null;
    	}

    	// Put all processed taxa back in the possible solutions list
    	this.appendToPossibleSolutions(tempList);

    	return true;
    }
    
    private void inheritPossibleSolutionDescriptionsFrom(PossibleSolution anOldPossibleSolution, PossibleSolution aNewPossibleSolution){
        aNewPossibleSolution.appendToSolutionDescription(anOldPossibleSolution.getSolutionDescription());
        aNewPossibleSolution.appendToConfirmedDescription(anOldPossibleSolution.getConfirmedDescription());
        aNewPossibleSolution.appendToUnconfirmedDescription(anOldPossibleSolution.getUnconfirmedDescription());
        aNewPossibleSolution.appendToDoubtfulDescription(anOldPossibleSolution.getDoubtfulDescription());
    }
	 /**
	 *Category accessing
	 */
    public Taxonomy getTaxonomy(){
        return taxonomy;
    }
    
	 /**
	 *Category adding
	 */
    public void setTaxonomy(Taxonomy aTaxonomy){
        taxonomy = aTaxonomy;
    }
}
