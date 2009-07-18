/**
 * @see "Categor�a Sukia Values de SUKIA Smalltalk"
 */
package domainTheory.values;

import java.util.ArrayList;
import java.util.List;

import domainTheory.Taxon;

/**
 * Clase modificada
 * @see "Clase ValueDescriptor"
 * @author Armando
 */
public abstract class ValueDescriptor {
	private List<Taxon> taxonList;
	
	/**
	 * 
	 */
	public ValueDescriptor() {
		setTaxonList(new ArrayList<Taxon>());
	}
		
	/**
	 * M�todo agregado
	 * @param taxonList
	 */
	public void setTaxonList(List<Taxon> taxonList) {
		this.taxonList = taxonList;
	}

	/**
	 * @see "M�todo taxonList del protocolo accessing-general en SUKIA SmallTalk"
	 * @return
	 */
	public List<Taxon> getTaxonList() {
		return taxonList;
	}
	
	/**
	 * @see "M�todo taxon: del protocolo adding-general en SUKIA SmallTalk"
	 * @param aTaxon
	 */
	public void addTaxon(Taxon aTaxon) {			
		this.getTaxonList().add(aTaxon);
	}
	
	public abstract <T> void addValues(T aDescriptor, Taxon aTaxon);
}
