/**
 * @see "Categor�a Sukia Reasoner en SUKIA SmallTalk"
 */
package system;

import java.util.ArrayList;
import java.util.List;

import ontology.common.Description;
import ontology.common.Descriptor;


/**
 * @author Armando
 *
 */
public class Hypothesis {
	private Description description;
	private Description justification;
	private Description unmatchedDescription;
	private List<PossibleSolution> possibleSolutions;
	private double points;

	/**
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk"
	 */
	// Ojo el ordenamiento
	public Hypothesis() {
		setDescription(new Description());

		// Sort criteria: taxonomic level
		setPossibleSolutions(new ArrayList<PossibleSolution>());

		// Sort criteria: concatenated structure and attribute names
		setUnmatchedDescription(new Description());
		setJustification(new Description());
		setPoints(0);
	}

	/**
	 * @see "M�todo descriptiveElement: del protocolo adding en SUKIA SmallTalk"
	 * @param aDescElt
	 */
	public boolean setDescription(Description aDescElt) {
		this.description = aDescElt;
		
		return true;
	}

	/**
	 * @see "M�todo descriptiveElement del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public Description getDescription() {
		return description;
	}

	/**
	 * M�todo de instancia agregado
	 * @param justification
	 */
	public void setJustification(Description justification) {
		this.justification = justification;
	}

	/**
	 * @see "M�todo justification del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public Description getJustification() {
		return justification;
	}
	
	/**
	 * @see "M�todo justification: del protocolo adding en SUKIA SmallTalk"
	 * @param aJustification
	 */
	public void addToJustification(Descriptor aJustification) {
		justification.addToConcreteDescription(aJustification);
	}

	/**
	 * M�todo de instancia agregado
	 * @param points
	 */
	public void setPoints(double points) {
		this.points = points;
	}
	
	/**
	 * @see "M�todo incrementPointsBy: del protocolo adding en SUKIA SmallTalk"
	 * @param increment
	 */
	public void incrementPointsBy(double increment) {
		this.points = this.points + increment;
	}
	
	/**
	 * @see "M�todo incrementPointsBy: del protocolo adding en SUKIA SmallTalk"
	 */
	public void incrementPoints() {
		this.points = this.points + 1;
	}
	
	/**
	 * @see "M�todo points del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public double getPoints() {
		return points;
	}

	/**
	 * M�todo de instancia agregado
	 * @param possibleSolutions
	 */
	public void setPossibleSolutions(List<PossibleSolution> possibleSolutions) {
		this.possibleSolutions = possibleSolutions;
	}

	/**
	 * Adds aPossibleSolution under the following conditions:
	 * 1. If the list is empty, the possible solution may be added directly.
	 * 2. The list may contain ONLY taxa or positive instances of Case or SAVCase, or
	 * 3. The list may contain ONLY negative instances of SAVCase
	 * @see "M�todo possibleSolutions: del protocolo adding en SUKIA SmallTalk"
	 * @param aPossibleSolution
	 * @return
	 */
	public boolean addPossibleSolution(PossibleSolution aPossibleSolution) {
		boolean firstEltStatus, possSolStatus;
	
		if (this.getPossibleSolutions().isEmpty()) {
			this.getPossibleSolutions().add(aPossibleSolution);
			aPossibleSolution.setHypothesis(this);
			return true;
		}

		firstEltStatus = this.getPossibleSolutions().get(0).getStatus();
		possSolStatus = aPossibleSolution.getStatus();

		if (firstEltStatus == possSolStatus){
			this.getPossibleSolutions().add(aPossibleSolution);
			aPossibleSolution.setHypothesis(this);
			return true;
		}	

		return false;
	}

	/**
	 * @see "M�todo possibleSolutions del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public List<PossibleSolution> getPossibleSolutions() {
		return possibleSolutions;
	}

	/**
	 * M�todo de instancia agregado
	 * @param unmatchedDescription
	 */
	public void setUnmatchedDescription(Description unmatchedDescription) {
		this.unmatchedDescription = unmatchedDescription;
	}

	/**
	 * @see "M�todo unmatchedDescription: del protocolo adding en SUKIA SmallTalk"
	 * @param aDescriptor
	 * @return
	 */
	public boolean addToUnmatchedDescription(Descriptor aDescriptor) {
		return this.getUnmatchedDescription().addToConcreteDescription(aDescriptor);
	}
	
	/**
	 * @see "M�todo unmatchedDescription del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public Description getUnmatchedDescription() {
		return unmatchedDescription;
	}
	
	/**
	 * @see "M�todo copyToJustificationFrom: del protocolo adding en SUKIA SmallTalk"
	 * @param aJustificationDescription
	 * @return
	 */
	public boolean copyToJustificationFrom(List<Descriptor> aJustificationDescription) {
		if (aJustificationDescription == null) return false;
		
        for (Descriptor d:aJustificationDescription){
            this.addToJustification(d);
        }
        
		return true;
	}
	
	/**
	 * @see "M�todo copyToUnmatchedDescriptionFrom: del protocolo adding en SUKIA SmallTalk"
	 * @param anUnmatchedDescription
	 * @return
	 */
	public boolean copyToUnmatchedDescriptionFrom(List<Descriptor> anUnmatchedDescription) {
		if (anUnmatchedDescription == null)return false;
                for (Descriptor d:anUnmatchedDescription){
                    this.addToUnmatchedDescription(d);
                }
		return true;
	}

	/**
	 * Determines if the argument aSAVDescriptor is a member of the argument aDescription.
	 * Returns:	-1 (error value) : if aDescription is NOT a description list belonging to self.
	 * nil : if aSAVDescriptor was NOT found in aDescription.
	 * not nil: the instance in aDescription that matched aSAVDescriptor's structure and attribute names.
	 * @see "M�todo includes:in: del protocolo testing en SUKIA SmallTalk"
	 * @param aDescriptor
	 * @param aDescription
	 * @return
	 */
	public boolean contains(Descriptor aDescriptor, List<Descriptor> aDescription) {
		// Make sure that aDescription is indeed one of my description lists. If not, return the -1 error value
		 if (!(aDescription == this.getUnmatchedDescription()))
			 return false;
                for (Descriptor d:aDescription){
                    if (d.getStructure().equals(aDescriptor.getStructure()) &&
                            (d.getAttribute().equals(aDescriptor.getAttribute())))
                        return true;
			// Stop searching if the next descriptor's structure name is (alphabetically) greater than the argument's structure name
                        if (aDescriptor.getStructure().compareTo(d.getStructure()) < 0)
                                return false;
                }
		return false;
	}
	
	/**
	 * Verifica si existen contradicciones entre los descriptores (estructura, atributo, valor)
	 * Se dice que existe contradiccion  si existe dos descripciones distintas para el mismo par
	 * (estructura, atributo)
	 * @see "M&eacute;todo thereAreContradictions: del protocolo testing en SUKIA SmallTalk"
	 * @return
	 */
	public boolean areThereContradictions(Descriptor aDescriptor, 
		List<Descriptor> aDescription) {

		for(Descriptor d: aDescription) {
			if (d.getStructure().equals(aDescriptor.getStructure()) &&
					d.getAttribute().equals(aDescriptor.getAttribute())	) {
					return true; // Hay contradiccion
			}
		}
				
	    return false;
	}
}
