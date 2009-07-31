/**
 * @see "Categor�a Sukia Domain Theory de SUKIA Smalltalk"
 */
package ontology.common;

import java.util.List;

import ontology.taxonomy.Taxon;
import ontology.taxonomy.TaxonomicLevels;
import ontology.values.RangeDescriptor;
import ontology.values.SingleDescriptor;
import ontology.values.Value;
import ontology.values.ValueDescriptor;



/**
 * @author Armando
 *
 */
public class Attribute implements Comparable<Attribute>{
	private String name;
	private Value values;

	/**
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk"
	 * @see "M�todo newWithOneLevel del protocolo instance creation en SUKIA SmallTalk"
	 */
	public Attribute() {
		setName(null);
		setValues(new Value());
	}
	
	/**
	 * @see "M�todo oneLevel del protocolo de clase one level en SUKIA SmallTalk"
	 * @return
	 */
	public static int oneLevel() {
		return 0;
	}
	
	/**
	 * @see "M�todo name: del protocolo adding en SUKIA SmallTalk"
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @see "M�todo name del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Metodo de instancia agregado
	 * @param values
	 */
	private void setValues(Value values) {
		this.values = values;
	}

	/**
	 * @see "M�todo values del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public Value getValues() {
		return values;
	}

	/**
	 * @see "M�todo copyFrom:referencing: del protocolo copying en SUKIA SmallTalk"
	 * @param attribute
	 * @param taxon
	 */
	public <T> boolean addValues(Attribute attribute, Taxon taxon) {
		List<ValueDescriptor> vList;
		ValueDescriptor ovd, nvd;

		if (values.size() < attribute.getValues().size())
			return false;

		name = attribute.getName();
		
		for (int i = 1; i <= attribute.getValues().size(); i++) {
			vList = attribute.getValues().get(i-1);
			
			for (int j = 1; j <= vList.size(); j++) {
				ovd = vList.get(j-1);
				if (ovd instanceof SingleDescriptor)
					nvd = new SingleDescriptor<T>();
				else {
					nvd = new RangeDescriptor();
				}
				
				nvd.addValues(ovd, taxon);
				if (this.getValues().size() == attribute.getValues().size())
					// Ojo verificar �ndice
					this.getValues().addValueDescriptor(nvd, TaxonomicLevels.getLevels().get(i+1));
				else
					this.getValues().addValueDescriptor(nvd, taxon.getLevel());
				
			}
			
		}
		
		return true;
	}
	
	/**
	 * M�todo de instancia agregado
	 */
	public int compareTo(Attribute aAttribute) {
		return this.getName().compareTo(aAttribute.getName());
	}
}
