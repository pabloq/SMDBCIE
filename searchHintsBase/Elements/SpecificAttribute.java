/**
 * @see "Categor�a Sukia Search Hints Elts de SUKIA Smalltalk"
 */
package searchHintsBase.Elements;

/**
 * @author Armando
 *
 */
public class SpecificAttribute implements Comparable<SpecificAttribute>{
	private String name;
	private int frequency;

	/**
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk"
	 */
	public SpecificAttribute() {
		setName(null);
		setFrequency(0);
	}

	/**
	 * @see "M�todo attribute: del protocolo adding en SUKIA SmallTalk"
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @see "M�todo attribute del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @see "M�todo frequency: del protocolo adding en SUKIA SmallTalk"
	 * @param frequency
	 */
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	/**
	 * @see "M�todo incrementFrequencyBy: del protocolo adding en SUKIA SmallTalk"
	 * @param frequency
	 */
	public void incrementFrequencyBy(int incrementFrequency) {
		this.frequency = this.frequency + incrementFrequency;
	}
	
	/**
	 * @see "M�todo frequency del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public int getFrequency() {
		return frequency;
	}

	/**
	 * M�todo de instancia agregado
	 */
	public int compareTo(SpecificAttribute aSpecificAttribute) {
		return (aSpecificAttribute.getFrequency()-this.getFrequency());
	}
}
