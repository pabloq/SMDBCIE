/**
 * @see "Categor�a Auxiliary de SUKIA Smalltalk"
 */
package system;

import java.util.List;

/**
 * The SystemParametersManager keeps track of the SukiaSystem's global parameters.
 * @author Armando
 *
 */
public class SystemParametersManager {
	String path; 						// Contains the path (absolute or relative) of the parameters directory.
	String parametersDirectory; 		// Specifies the directory where the default parameter files are located.
	List<String> taxonomicLevelNames; 	// Collection that holds the taxonomic level names valid for the application.
									  	//The ordering of these names matters!
	
	/**
	 * @see "M�todo taxonomicLevelNamesFileName del protocolo de clase class default en SUKIA SmallTalk"
	 * @return
	 */
	public static String taxonomicLevelNamesFileName() {
		return "taxonLevels.txt";
	}


	/**
	 * @see "M�todo path del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @see "M�todo path: del protocolo adding en SUKIA SmallTalk"
	 * @param path
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @see "M�todo parametersDirectory del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public String getParametersDirectory() {
		return parametersDirectory;
	}

	/**
	 * @see "M�todo parametersDirectory: del protocolo adding en SUKIA SmallTalk"
	 * @param parametersDirectory
	 */
	public void setParametersDirectory(String parametersDirectory) {
		this.parametersDirectory = parametersDirectory;
	}

	/**
	 * @see "M�todo taxonomicLevelNames del protocolo accessing en SUKIA SmallTalk"
	 * @return
	 */
	public List<String> getTaxonomicLevelNames() {
		return taxonomicLevelNames;
	}

	/**
	 * M�todo de instancia agregado 
	 * @param taxonomicLevelNames
	 */
	public void setTaxonomicLevelNames(List<String> taxonomicLevelNames) {
		this.taxonomicLevelNames = taxonomicLevelNames;
	}
	
	/**
	 * @see "M�todo loadTaxonomicLevelNames del protocolo adding en SUKIA SmallTalk"
	 */
	// Pendiente de traducir (ojo)
	public void loadTaxonomicLevelNames() {
	
	}
}
