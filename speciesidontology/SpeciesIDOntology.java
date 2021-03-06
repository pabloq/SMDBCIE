// file: SpeciesIDOntology.java generated by ontology bean generator.  DO NOT EDIT, UNLESS YOU ARE REALLY SURE WHAT YOU ARE DOING!
package speciesidontology;

import jade.content.onto.*;
import jade.content.schema.*;

/** file: SpeciesIDOntology.java
 * @author ontology bean generator
 * @version 2009/05/22, 13:27:49
 */
public class SpeciesIDOntology extends jade.content.onto.Ontology  {

  private static final long serialVersionUID = 5687089858125395496L;

  //NAME
  public static final String ONTOLOGY_NAME = "SpeciesID";
  // The singleton instance of this ontology
  private static Ontology theInstance = new SpeciesIDOntology();
  public static Ontology getInstance() {
     return theInstance;
  }


   // VOCABULARY
    public static final String TIENE_CASO="caso";
    public static final String TIENE_DESCRIPCION="descripcion";
    public static final String TIENE="Tiene";
    public static final String FALLIDO_CASO="caso";
    public static final String FALLIDO="Fallido";
    public static final String EXITOSO_CASO="caso";
    public static final String EXITOSO="Exitoso";
    public static final String IDENTIFICA_TAXON="taxon";
    public static final String IDENTIFICA_AGENTE="agente";
    public static final String IDENTIFICA="Identifica";
    public static final String DESCRIPCION_ELEMENTOSDESCRIPTIVOS="elementos-descriptivos";
    public static final String DESCRIPCION="Descripcion";
    public static final String ELEMENTODESCRIPTIVO_ESTRUCTURA="estructura";
    public static final String ELEMENTODESCRIPTIVO_PROPIEDAD="propiedad";
    public static final String ELEMENTODESCRIPTIVO="ElementoDescriptivo";
    public static final String ELEMENTODESCRIPTIVOCUALITATIVO_ESTADO="estado";
    public static final String ELEMENTODESCRIPTIVOCUALITATIVO="Elemento-Descriptivo-Cualitativo";
    public static final String CASO_DESCRIPCION="descripcion";
    public static final String CASO_ESPECIEINFERIDA="especie-inferida";
    public static final String CASO="Caso";
    public static final String ELEMENTODESCRIPTIVOCUANTITATIVO_VALOR="valor";
    public static final String ELEMENTODESCRIPTIVOCUANTITATIVO="Elemento-Descriptivo-Cuantitativo";
    public static final String TAXON_CATEGORIA="categoria";
    public static final String TAXON_NOMBRE="nombre";
    public static final String TAXON="Taxon";

  /**
   * Constructor
  */
  private SpeciesIDOntology(){ 
    super(ONTOLOGY_NAME, BasicOntology.getInstance());
    try { 

    // adding Concept(s)
    ConceptSchema taxonSchema = new ConceptSchema(TAXON);
    add(taxonSchema, speciesidontology.Taxon.class);
    ConceptSchema elementoDescriptivoCuantitativoSchema = new ConceptSchema(ELEMENTODESCRIPTIVOCUANTITATIVO);
    add(elementoDescriptivoCuantitativoSchema, speciesidontology.ElementoDescriptivoCuantitativo.class);
    ConceptSchema casoSchema = new ConceptSchema(CASO);
    add(casoSchema, speciesidontology.Caso.class);
    ConceptSchema elementoDescriptivoCualitativoSchema = new ConceptSchema(ELEMENTODESCRIPTIVOCUALITATIVO);
    add(elementoDescriptivoCualitativoSchema, speciesidontology.ElementoDescriptivoCualitativo.class);
    ConceptSchema elementoDescriptivoSchema = new ConceptSchema(ELEMENTODESCRIPTIVO);
    add(elementoDescriptivoSchema, speciesidontology.ElementoDescriptivo.class);
    ConceptSchema descripcionSchema = new ConceptSchema(DESCRIPCION);
    add(descripcionSchema, speciesidontology.Descripcion.class);

    // adding AID(s)

    // adding Predicate(s)
    PredicateSchema identificaSchema = new PredicateSchema(IDENTIFICA);
    add(identificaSchema, speciesidontology.Identifica.class);
    PredicateSchema exitosoSchema = new PredicateSchema(EXITOSO);
    add(exitosoSchema, speciesidontology.Exitoso.class);
    PredicateSchema fallidoSchema = new PredicateSchema(FALLIDO);
    add(fallidoSchema, speciesidontology.Fallido.class);
    PredicateSchema tieneSchema = new PredicateSchema(TIENE);
    add(tieneSchema, speciesidontology.Tiene.class);


    // adding fields
    taxonSchema.add(TAXON_NOMBRE, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.MANDATORY);
    taxonSchema.add(TAXON_CATEGORIA, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.MANDATORY);
    elementoDescriptivoCuantitativoSchema.add(ELEMENTODESCRIPTIVOCUANTITATIVO_VALOR, (TermSchema)getSchema(BasicOntology.FLOAT), ObjectSchema.MANDATORY);
    casoSchema.add(CASO_ESPECIEINFERIDA, taxonSchema, ObjectSchema.MANDATORY);
    casoSchema.add(CASO_DESCRIPCION, descripcionSchema, ObjectSchema.MANDATORY);
    elementoDescriptivoCualitativoSchema.add(ELEMENTODESCRIPTIVOCUALITATIVO_ESTADO, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.MANDATORY);
    elementoDescriptivoSchema.add(ELEMENTODESCRIPTIVO_PROPIEDAD, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.OPTIONAL);
    elementoDescriptivoSchema.add(ELEMENTODESCRIPTIVO_ESTRUCTURA, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.MANDATORY);
    descripcionSchema.add(DESCRIPCION_ELEMENTOSDESCRIPTIVOS, elementoDescriptivoSchema, 1, ObjectSchema.UNLIMITED);
    identificaSchema.add(IDENTIFICA_AGENTE, (ConceptSchema)getSchema(BasicOntology.AID), ObjectSchema.MANDATORY);
    identificaSchema.add(IDENTIFICA_TAXON, taxonSchema, ObjectSchema.MANDATORY);
    exitosoSchema.add(EXITOSO_CASO, casoSchema, ObjectSchema.MANDATORY);
    fallidoSchema.add(FALLIDO_CASO, casoSchema, ObjectSchema.MANDATORY);
    tieneSchema.add(TIENE_DESCRIPCION, descripcionSchema, ObjectSchema.MANDATORY);
    tieneSchema.add(TIENE_CASO, casoSchema, ObjectSchema.MANDATORY);

    // adding name mappings

    // adding inheritance
    elementoDescriptivoCuantitativoSchema.addSuperSchema(elementoDescriptivoSchema);
    elementoDescriptivoCualitativoSchema.addSuperSchema(elementoDescriptivoSchema);

   }catch (java.lang.Exception e) {e.printStackTrace();}
  }
}
