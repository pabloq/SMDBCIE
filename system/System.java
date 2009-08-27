/**
 * @see "Categor�a Sukia Reasoner en SUKIA SmallTalk"
 */
package system;

import ontology.taxonomy.Taxonomy;
import redundantDiscriminationNet.RDMultiNet;
import searchHintsBase.HintsBase;
import system.scopes.AttributeScopes;
import system.scopes.GroupingHeuristicScopes;
import system.scopes.StructureScopes;

/**
 * @see "Clase Sukia en SUKIA SmallTalk"
 * @author Armando
 *
 */
public class System {
	private RDMultiNet caseMemory;
	private HintsBase hintsBase;
	private Object learner;
	private Reasoner reasoner;
	private String taxonomicGroupName;
	private Taxonomy taxonomy;

	/**
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk"
	 */
	public System(String aCommonName) {
		// Initialize scope classes
		StructureScopes.initialize();
		AttributeScopes.initialize();
		GroupingHeuristicScopes.initialize();

		setTaxonomicGroupName(aCommonName);

		setHintsBase(new HintsBase());
		if (this.loadHintsBase() == null) return;

		setCaseMemory(new RDMultiNet());
		if (this.loadCaseMemory() == null) return;

		setTaxonomy(new Taxonomy());
		if (this.loadTaxonomy() == null) return;

		this.loadReasoner();

		setLearner(null);
	}

	/**
	 * M�todo de instancia agregado
	 * @param caseMemory
	 */
	public void setCaseMemory(RDMultiNet caseMemory) {
		this.caseMemory = caseMemory;
	}

	/**
	 * THIS IS THE METHOD TO BE USED IN ORDER TO READ THE CASE MEMORY
	 * DATA FROM DISK, AND ASSEMBLING IT IN MEMORY
	 * @see "M�todo loadCaseMemory del protocolo preparing en SUKIA SmallTalk"
	 */
	public Object loadCaseMemory() {
		return this;
	}
	
	/**
	 * @see "M�todo caseMemory del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public RDMultiNet getCaseMemory() {
		return caseMemory;
	}

	/**
	 * M�todo de instancia agregado
	 * @param hintsBase
	 */
	public void setHintsBase(HintsBase hintsBase) {
		this.hintsBase = hintsBase;
	}

	/**
	 * THIS IS THE METHOD TO BE USED IN ORDER TO READ THE CASE MEMORY
	 * DATA FROM DISK, AND ASSEMBLING IT IN MEMORY
	 * @see "M�todo loadHintsBase del protocolo preparing en SUKIA SmallTalk"
	 */
	public Object loadHintsBase() {
		return this;
	}
	
	/**
	 * @see "M�todo hintsBase del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public HintsBase getHintsBase() {
		return hintsBase;
	}

	/**
	 * M�todo de instancia agregado
	 * @param learner
	 */
	public void setLearner(Object learner) {
		this.learner = learner;
	}

	/**
	 * @see "M�todo learner del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public Object getLearner() {
		return learner;
	}

	/**
	 * M�todo de instancia agregado
	 * @param reasoner
	 */
	public void setReasoner(Reasoner reasoner) {
		this.reasoner = reasoner;
	}

	/**
	 * @see "M�todo reasoner del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public Reasoner getReasoner() {
		return reasoner;
	}

	/**
	 * Examples of the argument aCommonName: #plant, #mollusk, #fungus
	 * @param aCommonName
	 */
	public void setTaxonomicGroupName(String aCommonName) {
		this.taxonomicGroupName = aCommonName;
	}

	/**
	 * @see "M�todo taxonomicGroupName del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public String getTaxonomicGroupName() {
		return taxonomicGroupName;
	}

	/**
	 * M�todo de instancia agregado
	 * @param taxonomy
	 */
	public void setTaxonomy(Taxonomy taxonomy) {
		this.taxonomy = taxonomy;
	}
	
	/**
	 * THIS IS THE METHOD TO BE USED IN ORDER TO READ THE CASE MEMORY
	 * DATA FROM DISK, AND ASSEMBLING IT IN MEMORY
	 * @see "M�todo loadTaxonomy del protocolo preparing en SUKIA SmallTalk"
	 */
	public Object loadTaxonomy() {
		return this;
	}

	/**
	 * @see "M�todo taxonomy del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public Taxonomy getTaxonomy() {
		return taxonomy;
	}

	/**
	 * @see "M�todo loadReasoner del protocolo preparing en SUKIA SmallTalk"
	 */
	public Object loadReasoner() {
		this.setReasoner(new Reasoner(this));
		
		return this;
	}
}
