/**
 * 
 */
package domainTheory;

import java.util.ArrayList;

/**
 * @author Armando
 *
 */
public class StructureIndex extends ArrayList<Structure> {
	/**
	 * @see "M�todo initialize del protocolo initializing en SUKIA SmallTalk"
	 */
	public StructureIndex() {
		// TODO Auto-generated constructor stub
		//Pendiente el ordenamiento
	}
	
	/**
	 * @see "M�todo structureWith: del protocolo accessing en SUKIA SmallTalk"
	 * @param aStructureName
	 * @return
	 */
	public Structure structureWith(String aStructureName) {
		for (int i = 1; i <= this.size(); i++) {
			if (this.get(i).getName().equals(aStructureName)) 
				return this.get(i);
		}
		
		return null;
	}
	
	/**
	 * @see "M�todo includes: del protocolo testing en SUKIA SmallTalk"
	 * @param aStructureName
	 * @return
	 */
	public boolean includes(String aStructureName) {
		for (int i = 1; i <= this.size(); i++) {
			if (this.get(i).getName().equals(aStructureName))
				return true;
		}
		
		return false;
	}

}
