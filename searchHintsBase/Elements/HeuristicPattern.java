/**
 * @see "Categor�a Sukia Search Hints Elts de SUKIA Smalltalk"
 */
package searchHintsBase.Elements;

/**
 * @author Armando
 *
 */
public class HeuristicPattern implements Comparable<HeuristicPattern> {
	private int successFrequency;
	private int failureFrequency;
	private String groupingHeuristicName;
	private Object value;


	/**
	 * Initialize the frequent grouping heuristic element.  The instance variable 'value' will NOT be an instance of Value,
	 * because (at least for now) it doesn't need to store extra information, such as value levels, weights or ranges. Thus,
	 * the contents of the variable value will be a discreet symbol (no ranges).
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk"
	 */
	public HeuristicPattern() {
		setGroupingHeuristicName(null);
		setValue(0);
		setSuccessFrequency(0);
		setFailureFrequency(0);
	}

	/**
	 * M�todo de instancia agregado
	 */
	public int compareTo(HeuristicPattern aFrequentGroupingHeuristicElt) {
		return (this.getFailureFrequency() - aFrequentGroupingHeuristicElt.getFailureFrequency());
	}

	/**
	 * @see "M�todo incrementFailureFrequency del protocolo adding en SUKIA SmallTalk"
	 */
	public void incrementFailureFrequency() {
		this.failureFrequency = this.failureFrequency+1;
	}
	
	/**
	 * M�todo de instancia agregado
	 * @param failureFrequency
	 */
	public void setFailureFrequency(int failureFrequency) {
		this.failureFrequency = failureFrequency;
	}

	/**
	 * @see "M�todo failureFrequency del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public int getFailureFrequency() {
		return failureFrequency;
	}

	/**
	 * @see "M�todo groupingHeuristicName: del protocolo adding en SUKIA SmallTalk"
	 * @param groupingHeuristicName
	 */
	public void setGroupingHeuristicName(String groupingHeuristicName) {
		this.groupingHeuristicName = groupingHeuristicName;
	}

	/**
	 * @see "M�todo groupingHeuristicName del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public String getGroupingHeuristicName() {
		return groupingHeuristicName;
	}

	/**
	 * @see "M�todo incrementSuccessFrequency del protocolo adding en SUKIA SmallTalk"
	 * @param successFrequency
	 */
	public void incrementSuccessFrequency() {
		this.successFrequency = this.successFrequency+1;
	}
	
	/**
	 * M�todo de instancia agregado
	 * @param successFrequency
	 */
	public void setSuccessFrequency(int successFrequency) {
		this.successFrequency = successFrequency;
	}

	/**
	 * @see "M�todo getSuccessFrequency del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public int getSuccessFrequency() {
		return successFrequency;
	}
	
	/**
	 * @see "M�todo value; del protocolo adding en SUKIA SmallTalk"
	 * @param value
	 */
	public void setValue(Object value) {
		this.value = value;
	}

	/**
	 * @see "M�todo value del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public Object getValue() {
		return value;
	}
}
