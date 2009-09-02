/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package system.test;

import java.util.ArrayList;
import java.util.List;
import ontology.common.Modifier;
import ontology.common.SSCharacterDescriptor;
import ontology.taxonomy.Taxon;
import ontology.taxonomy.TaxonomicRank;
import ontology.taxonomy.Taxonomy;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import system.Hypothesis;
import system.PossibleSolution;
import system.PossibleSolutionSelector;
import system.ProposedSolution;
import static org.junit.Assert.*;

/**
 *
 * @author pabloq
 */
public class PossibleSolutionSelectorTest {
    Taxon taxon1,taxon2,taxon3,taxon4,taxon5,taxon6,taxon7;
    Taxonomy taxonomy;

    public PossibleSolutionSelectorTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        //rootTaxon = new Taxon(TaxonomicRank.ROOT, null);
        taxon1 = new Taxon(TaxonomicRank.FAMILY, "Chromodorididae");
        taxon1.addToDescription(new SSCharacterDescriptor("cuerpo","forma","alargado"),
                                    new Modifier(1.0,1.0,0.8));

        taxon1.addToDescription(new SSCharacterDescriptor("cuerpo","forma","ovalado"),
                                    new Modifier(1.0,1.0,0.1));

        taxon2 = new Taxon(TaxonomicRank.FAMILY, "Chromodorididae fake");
        taxon2.addToDescription(new SSCharacterDescriptor("cuerpo1","forma","ovalado"),
                                    new Modifier(1.0,1.0,1.0));
        taxon2.addToDescription(new SSCharacterDescriptor("cuerpo2","forma","ovalado"),
                                    new Modifier(1.0,1.0,1.0));
        taxon3 = new Taxon(TaxonomicRank.GENUS, "Chromodoris");
        taxon3.addToDescription(new SSCharacterDescriptor("cuerpo3","forma","ovalado"),
                                    new Modifier(1.0,1.0,1.0));
        taxon4 = new Taxon(TaxonomicRank.GENUS, "Chromodoris fake");
        taxon4.addToDescription(new SSCharacterDescriptor("cuerpo4","forma","ovalado"),
                                    new Modifier(1.0,1.0,1.0));
        taxon5 = new Taxon(TaxonomicRank.SPECIES, "Chromodoris sphoni");
        taxon5.addToDescription(new SSCharacterDescriptor("cuerpo5","forma","ovalado"),
                                    new Modifier(1.0,1.0,1.0));
        taxon6 = new Taxon(TaxonomicRank.SPECIES, "Chromodoris clenchi");
        taxon6.addToDescription(new SSCharacterDescriptor("cuerpo6","forma","ovalado"),
                                    new Modifier(1.0,1.0,1.0));
        taxon7 = new Taxon(TaxonomicRank.SPECIES, "Chromodoris_kempfi");
        taxon7.addToDescription(new SSCharacterDescriptor("cuerpo7","forma","ovalado"),
                                    new Modifier(1.0,1.0,1.0));


        taxonomy = new Taxonomy("Mollusca");

        //taxon1.setPredecessor(rootTaxon);
        assertTrue(taxonomy.addTaxon(taxon1, taxonomy.getRootTaxon()));
        assertTrue(taxonomy.addTaxon(taxon2, taxonomy.getRootTaxon()));
        assertTrue(taxonomy.addTaxon(taxon3, taxon1));
        assertTrue(taxonomy.addTaxon(taxon4, taxon2));
        assertTrue(taxonomy.addTaxon(taxon5, taxon3));
        assertTrue(taxonomy.addTaxon(taxon6, taxon3));
        assertTrue(taxonomy.addTaxon(taxon7, taxon4));
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of distribute method, of class PossibleSolutionSelector.
     */
    @Test
    public void testDistribute() {
        java.lang.System.out.println("distribute");
        PossibleSolutionSelector instance = new PossibleSolutionSelector(TaxonomicRank.SPECIES, new ArrayList<Hypothesis>(),
                new ArrayList<Hypothesis>(),new ArrayList<Hypothesis> (),  new ArrayList<Hypothesis> (),1, true);
        List<PossibleSolution> aSortedPossibleSolutionsList = new ArrayList<PossibleSolution>();

        PossibleSolution aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(10.0);
        assertTrue(aPossibleSolution.setSolution(taxon1));
        aSortedPossibleSolutionsList.add(aPossibleSolution);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(9.0);
        assertTrue(aPossibleSolution.setSolution(taxon2));
        aSortedPossibleSolutionsList.add(aPossibleSolution);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(8.0);
        assertTrue(aPossibleSolution.setSolution(taxon3));
        aSortedPossibleSolutionsList.add(aPossibleSolution);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(7.0);
        assertTrue(aPossibleSolution.setSolution(taxon4));
        aSortedPossibleSolutionsList.add(aPossibleSolution);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(6.0);
        assertTrue(aPossibleSolution.setSolution(taxon5));
        aSortedPossibleSolutionsList.add(aPossibleSolution);
        
        assertTrue(instance.distribute(aSortedPossibleSolutionsList));

        aSortedPossibleSolutionsList = new ArrayList<PossibleSolution>();

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(10.0);
        assertTrue(aPossibleSolution.setSolution(taxon1));
        aSortedPossibleSolutionsList.add(aPossibleSolution);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(9.0);
        assertTrue(aPossibleSolution.setSolution(taxon2));
        aSortedPossibleSolutionsList.add(aPossibleSolution);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(8.0);
        assertTrue(aPossibleSolution.setSolution(taxon3));
        aSortedPossibleSolutionsList.add(aPossibleSolution);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(7.0);
        assertTrue(aPossibleSolution.setSolution(taxon4));
        aSortedPossibleSolutionsList.add(aPossibleSolution);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(6.0);
        assertTrue(aPossibleSolution.setSolution(taxon5));
        aSortedPossibleSolutionsList.add(aPossibleSolution);

        instance = new PossibleSolutionSelector(TaxonomicRank.GENUS, new ArrayList<Hypothesis>(),
                new ArrayList<Hypothesis>(),new ArrayList<Hypothesis> (),  new ArrayList<Hypothesis> (),2, true);


        assertTrue(instance.distribute(aSortedPossibleSolutionsList));

        aSortedPossibleSolutionsList = new ArrayList<PossibleSolution>();

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(10.0);
        assertTrue(aPossibleSolution.setSolution(taxon1));
        aSortedPossibleSolutionsList.add(aPossibleSolution);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(9.0);
        assertTrue(aPossibleSolution.setSolution(taxon2));
        aSortedPossibleSolutionsList.add(aPossibleSolution);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(8.0);
        assertTrue(aPossibleSolution.setSolution(taxon3));
        aSortedPossibleSolutionsList.add(aPossibleSolution);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(7.0);
        assertTrue(aPossibleSolution.setSolution(taxon4));
        aSortedPossibleSolutionsList.add(aPossibleSolution);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(6.0);
        assertTrue(aPossibleSolution.setSolution(taxon5));
        aSortedPossibleSolutionsList.add(aPossibleSolution);

        instance = new PossibleSolutionSelector(TaxonomicRank.FAMILY, new ArrayList<Hypothesis>(),
                new ArrayList<Hypothesis>(),new ArrayList<Hypothesis> (),  new ArrayList<Hypothesis> (),2, true);

        assertTrue(instance.distribute(aSortedPossibleSolutionsList));

    }

    /**
     * Test of select method, of class PossibleSolutionSelector.
     */
    @Test
    public void testSelect() {
        java.lang.System.out.println("select");
        List<Hypothesis> aConflictSet = new ArrayList<Hypothesis>();

        PossibleSolution aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(10.0);
        assertTrue(aPossibleSolution.setSolution(taxon1));
        Hypothesis aHypothesis = new Hypothesis();
        aHypothesis.addPossibleSolutions(aPossibleSolution);
        aConflictSet.add(aHypothesis);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(9.0);
        assertTrue(aPossibleSolution.setSolution(taxon2));
        aHypothesis = new Hypothesis();
        aHypothesis.addPossibleSolutions(aPossibleSolution);
        aConflictSet.add(aHypothesis);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(8.0);
        assertTrue(aPossibleSolution.setSolution(taxon3));
        aHypothesis = new Hypothesis();
        aHypothesis.addPossibleSolutions(aPossibleSolution);
        aConflictSet.add(aHypothesis);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(7.0);
        assertTrue(aPossibleSolution.setSolution(taxon4));
        aHypothesis = new Hypothesis();
        aHypothesis.addPossibleSolutions(aPossibleSolution);
        aConflictSet.add(aHypothesis);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(6.0);
        assertTrue(aPossibleSolution.setSolution(taxon5));
        aHypothesis = new Hypothesis();
        aHypothesis.addPossibleSolutions(aPossibleSolution);
        aConflictSet.add(aHypothesis);


        PossibleSolutionSelector instance = new PossibleSolutionSelector(TaxonomicRank.FAMILY, aConflictSet,
                new ArrayList<Hypothesis>(),new ArrayList<Hypothesis> (),  new ArrayList<Hypothesis> (),2, true);

        List<ProposedSolution> aProposedSolution = instance.select();

        assertEquals(2,aProposedSolution.size());
        assertEquals(taxon1,aProposedSolution.get(0).getSolution().getSolution());
        assertEquals(taxon2,aProposedSolution.get(1).getSolution().getSolution());
        
    }

    /**
     * Test of sortPossibleSolutions method, of class PossibleSolutionSelector.
     */
    @Test
    public void testSortPossibleSolutions() {
        java.lang.System.out.println("sortPossibleSolutions");
        List<Hypothesis> aConflictSet = new ArrayList<Hypothesis>();

        PossibleSolution aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(1.0);
        assertTrue(aPossibleSolution.setSolution(taxon1));
        Hypothesis aHypothesis = new Hypothesis();
        aHypothesis.addPossibleSolutions(aPossibleSolution);
        aConflictSet.add(aHypothesis);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(2.0);
        assertTrue(aPossibleSolution.setSolution(taxon2));
        aHypothesis = new Hypothesis();
        aHypothesis.addPossibleSolutions(aPossibleSolution);
        aConflictSet.add(aHypothesis);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(3.0);
        assertTrue(aPossibleSolution.setSolution(taxon3));
        aHypothesis = new Hypothesis();
        aHypothesis.addPossibleSolutions(aPossibleSolution);
        aConflictSet.add(aHypothesis);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(4.0);
        assertTrue(aPossibleSolution.setSolution(taxon4));
        aHypothesis = new Hypothesis();
        aHypothesis.addPossibleSolutions(aPossibleSolution);
        aConflictSet.add(aHypothesis);

        aPossibleSolution = new PossibleSolution ();
        aPossibleSolution.setPoints(5.0);
        assertTrue(aPossibleSolution.setSolution(taxon5));
        aHypothesis = new Hypothesis();
        aHypothesis.addPossibleSolutions(aPossibleSolution);
        aConflictSet.add(aHypothesis);


        PossibleSolutionSelector instance = new PossibleSolutionSelector(TaxonomicRank.FAMILY, aConflictSet,
                new ArrayList<Hypothesis>(),new ArrayList<Hypothesis> (),  new ArrayList<Hypothesis> (),2, true);

        List<PossibleSolution> aProposedSolution = instance.sortPossibleSolutions();
        /*
         * Sort by points
         */

        assertEquals(5.0,aProposedSolution.get(0).getPoints(),0.0);
        assertEquals(4.0,aProposedSolution.get(1).getPoints(),0.0);
        assertEquals(3.0,aProposedSolution.get(2).getPoints(),0.0);
        assertEquals(2.0,aProposedSolution.get(3).getPoints(),0.0);
        assertEquals(1.0,aProposedSolution.get(4).getPoints(),0.0);

    }

}