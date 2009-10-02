// file: TaxonomyOntology.java generated by ontology bean generator.  DO NOT EDIT, UNLESS YOU ARE REALLY SURE WHAT YOU ARE DOING!
package ontology.taxonomy;

import ontology.common.CommonTerminologyOntology;
import jade.content.onto.*;
import jade.content.schema.*;

/** file: TaxonomyOntology.java
 * @author ontology bean generator
 * @version 2009/09/30, 13:34:31
 */
public class TaxonomyOntology extends jade.content.onto.Ontology  {

  private static final long serialVersionUID = -8627856865395943317L;

  //NAME
  public static final String ONTOLOGY_NAME = "Taxonomy";
  // The singleton instance of this ontology
  private static Ontology theInstance = new TaxonomyOntology();
  public static Ontology getInstance() {
     return theInstance;
  }


   // VOCABULARY
    public static final String ISSUCCESSORTAXONOF_OBJECTTAXON="objectTaxon";
    public static final String ISSUCCESSORTAXONOF_SUBJECTTAXON="subjectTaxon";
    public static final String ISSUCCESSORTAXONOF="IsSuccessorTaxonOf";
    public static final String ISPREDECESSORTAXONOF_OBJECTTAXON="objectTaxon";
    public static final String ISPREDECESSORTAXONOF_SUBJECTTAXON="subjectTaxon";
    public static final String ISPREDECESSORTAXONOF="IsPredecessorTaxonOf";
    public static final String ISROOTTAXON_TAXON="taxon";
    public static final String ISROOTTAXON="IsRootTaxon";
    public static final String ISSHEETTAXON_TAXON="taxon";
    public static final String ISSHEETTAXON="IsSheetTaxon";
    public static final String MODIFIER_SCOREWEIGHT="scoreWeight";
    public static final String MODIFIER_STRUCTUREWEIGHT="structureWeight";
    public static final String MODIFIER_ATTRIBUTEWEIGHT="attributeWeight";
    public static final String MODIFIER="Modifier";
    public static final String WEIGHTEDDESCRIPTION_WEIGHTEDDESCRIPTORS="weightedDescriptors";
    public static final String WEIGHTEDDESCRIPTION="WeightedDescription";
    public static final String WEIGHTEDDESCRIPTOR_MODIFIER="modifier";
    public static final String WEIGHTEDDESCRIPTOR_DESCRIPTOR="descriptor";
    public static final String WEIGHTEDDESCRIPTOR="WeightedDescriptor";
    public static final String TAXON_NAME="name";
    public static final String TAXON_WEIGHTEDDESCRIPTION="weightedDescription";
    public static final String TAXON_LEVEL="level";
    public static final String TAXON_PREDECESSOR="predecessor";
    public static final String TAXON_SUCCESSORS="successors";
    public static final String TAXON="Taxon";

  /**
   * Constructor
  */
  private TaxonomyOntology(){ 
    super(ONTOLOGY_NAME, CommonTerminologyOntology.getInstance());
    try { 

    // adding Concept(s)
    ConceptSchema taxonSchema = new ConceptSchema(TAXON);
    add(taxonSchema, ontology.taxonomy.Taxon.class);
    ConceptSchema weightedDescriptorSchema = new ConceptSchema(WEIGHTEDDESCRIPTOR);
    add(weightedDescriptorSchema, ontology.taxonomy.WeightedDescriptor.class);
    ConceptSchema weightedDescriptionSchema = new ConceptSchema(WEIGHTEDDESCRIPTION);
    add(weightedDescriptionSchema, ontology.taxonomy.WeightedDescription.class);
    ConceptSchema modifierSchema = new ConceptSchema(MODIFIER);
    add(modifierSchema, ontology.taxonomy.Modifier.class);

    // adding AgentAction(s)

    // adding AID(s)

    // adding Predicate(s)
    PredicateSchema isSheetTaxonSchema = new PredicateSchema(ISSHEETTAXON);
    add(isSheetTaxonSchema, ontology.taxonomy.IsSheetTaxon.class);
    PredicateSchema isRootTaxonSchema = new PredicateSchema(ISROOTTAXON);
    add(isRootTaxonSchema, ontology.taxonomy.IsRootTaxon.class);
    PredicateSchema isPredecessorTaxonOfSchema = new PredicateSchema(ISPREDECESSORTAXONOF);
    add(isPredecessorTaxonOfSchema, ontology.taxonomy.IsPredecessorTaxonOf.class);
    PredicateSchema isSuccessorTaxonOfSchema = new PredicateSchema(ISSUCCESSORTAXONOF);
    add(isSuccessorTaxonOfSchema, ontology.taxonomy.IsSuccessorTaxonOf.class);


    // adding fields
    taxonSchema.add(TAXON_SUCCESSORS, taxonSchema, 0, ObjectSchema.UNLIMITED);
    taxonSchema.add(TAXON_PREDECESSOR, taxonSchema, ObjectSchema.OPTIONAL);
    taxonSchema.add(TAXON_LEVEL, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.MANDATORY);
    taxonSchema.add(TAXON_WEIGHTEDDESCRIPTION, weightedDescriptionSchema, ObjectSchema.MANDATORY);
    taxonSchema.add(TAXON_NAME, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.MANDATORY);
    weightedDescriptorSchema.add(WEIGHTEDDESCRIPTOR_DESCRIPTOR, (ConceptSchema) getSchema(CommonTerminologyOntology.DESCRIPTOR), ObjectSchema.MANDATORY);
    weightedDescriptorSchema.add(WEIGHTEDDESCRIPTOR_MODIFIER, modifierSchema, ObjectSchema.MANDATORY);
    weightedDescriptionSchema.add(WEIGHTEDDESCRIPTION_WEIGHTEDDESCRIPTORS, weightedDescriptorSchema, 1, ObjectSchema.UNLIMITED);
    modifierSchema.add(MODIFIER_ATTRIBUTEWEIGHT, (TermSchema)getSchema(BasicOntology.FLOAT), ObjectSchema.MANDATORY);
    modifierSchema.add(MODIFIER_STRUCTUREWEIGHT, (TermSchema)getSchema(BasicOntology.FLOAT), ObjectSchema.MANDATORY);
    modifierSchema.add(MODIFIER_SCOREWEIGHT, (TermSchema)getSchema(BasicOntology.FLOAT), ObjectSchema.MANDATORY);
    isSheetTaxonSchema.add(ISSHEETTAXON_TAXON, taxonSchema, ObjectSchema.MANDATORY);
    isRootTaxonSchema.add(ISROOTTAXON_TAXON, taxonSchema, ObjectSchema.MANDATORY);
    isPredecessorTaxonOfSchema.add(ISPREDECESSORTAXONOF_SUBJECTTAXON, taxonSchema, ObjectSchema.MANDATORY);
    isPredecessorTaxonOfSchema.add(ISPREDECESSORTAXONOF_OBJECTTAXON, taxonSchema, ObjectSchema.MANDATORY);
    isSuccessorTaxonOfSchema.add(ISSUCCESSORTAXONOF_SUBJECTTAXON, taxonSchema, ObjectSchema.MANDATORY);
    isSuccessorTaxonOfSchema.add(ISSUCCESSORTAXONOF_OBJECTTAXON, taxonSchema, ObjectSchema.MANDATORY);

    // adding name mappings

    // adding inheritance

   }catch (java.lang.Exception e) {e.printStackTrace();}
  }
}
