/**
 * 
 */
package auxiliary;

import java.util.ArrayList;

import main.Case;
import main.Descriptor;

/**
 * @author Armando
 *
 */
public class ComparingTableTuple<T> {
	String attribute;
	T aCIValue;
	T aCCValue;
	
	/**
	 * M�todo constructor agregado
	 */
	public ComparingTableTuple() {
		// TODO Auto-generated constructor stub
		this.setAttribute("");
		this.setACCValue(null);
		this.setACIValue(null);
	}
	
	/**
	 * @see "M�todo newWith:caseToInsertValue:caseToCompareValue: del protocolo de clase instance creation en SUKIA SmallTalk"
	 * @param anAttribute
	 * @param aCIValue
	 * @param aCCValue
	 */
	public ComparingTableTuple(String anAttribute, T aCIValue, T aCCValue) {
		// TODO Auto-generated constructor stub
		this.setAttribute(anAttribute);
		this.setACCValue(aCCValue);
		this.setACIValue(aCIValue);
	}

	/**
	 * Returns the attribute name
	 * @see "M�todo attribute del protocolo reading en SUKIA SmallTalk"
	 * @return
	 */
	public String getAttribute() {
		return attribute;
	}

	/**
	 * M�todo de instancia agregado
	 * @param attribute
	 */
	private void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	/**
	 * Returns the value of the attribute, found in the case-to-insert description
	 * @see "M�todo aCIValue del protocolo reading en SUKIA SmallTalk"
	 * @return
	 */
	public T getACIValue() {
		return aCIValue;
	}

	/**
	 * M�todo de instancia agregado
	 * @param value
	 */
	private void setACIValue(T value) {
		aCIValue = value;
	}

	/**
	 * Returns the value of the attribute, found in the case-to-compare description
	 * @see "M�todo aCCValue del protocolo reading en SUKIA SmallTalk"
	 * @return
	 */
	public T getACCValue() {
		return aCCValue;
	}

	/**
	 * M�todo de instancia agregado
	 * @param value
	 */
	private void setACCValue(T value) {
		aCCValue = value;
	}

	/**
	 * @see "M�todo add:caseToInsertValue:caseToCompareValue: del protocolo adding en SUKIA SmallTalk"
	 * @param anAttribute
	 * @param aCIValue
	 * @param aCCValue
	 */
	public void add(String anAttribute, T aCIValue, T aCCValue) {
		this.setAttribute(anAttribute);
		this.setACCValue(aCCValue);
		this.setACIValue(aCIValue);
	}
}
