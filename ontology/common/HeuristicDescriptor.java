/**
 * @see "Categor�a Main de SUKIA Smalltalk"
 */
package ontology.common;

/**
 * Descriptor es un elemento descriptivo de una descripci�n de un caso: el par attribute-value.
 * Generaliza conceptos en normas.
 * Todas las ra�ces de red (especializaci�nes de normas) contienen un descriptor de la forma (nil, nil),
 * ya que ning�n par attribute-value particular generaliza todos los casos bajo ellos.
 * 
*/
public abstract class HeuristicDescriptor extends Descriptor {
	/**
	 * Class instance invariant: self MUST always have exactly two values. The first
	 * element corresponds to the descriptor's attribute, and the second one to the value.
	 * Extreme care should be taken when using this method, as it assumes an empty self."
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk"
	 */
	public HeuristicDescriptor() {

	}
	
	private static final long serialVersionUID = -3087841394215437493L;

	public HeuristicDescriptor(String instance_name) {
		super(instance_name);
	}
	
	/**
	 * M�todo agregado
	 */
	public HeuristicDescriptor(String aStructure, String anAttribute) {
		super(aStructure, anAttribute);
	}
}
