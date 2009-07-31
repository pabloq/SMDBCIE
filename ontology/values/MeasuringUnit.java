/**
 * @see "Categor�a Sukia Values de SUKIA Smalltalk"
 */
package ontology.values;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Armando
 *
 */
public class MeasuringUnit {
	static List<String> unitList;
	
	/**
	 * @see "M�todo initialize del protocolo de clase class initialization en SUKIA SmallTalk"
	 */
	public MeasuringUnit() {
		initialize();
	}
	
	/**
	 * @see "M�todo initialize del protocolo de clase class initialization en SUKIA SmallTalk"
	 */
	public static void initialize() {
		if (unitList == null) {
			unitList = new ArrayList<String>();
			
			unitList.add("mm");
			unitList.add("cm");
			unitList.add("inch");
		}
	}
	
	/**
	 * @see "M�todo exists: del protocolo de clase testing en SUKIA SmallTalk"
	 * @param aMeasuringUnit
	 * @return
	 */
	public static boolean exists(String aMeasuringUnit) {
		return (unitList.contains(aMeasuringUnit));
	}
}
