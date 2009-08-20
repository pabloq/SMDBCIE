/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ontology.values.test;

import java.util.List;
import ontology.taxonomy.TaxonomicRank;
import ontology.values.MeasuringUnit;
import ontology.values.RangeDescriptor;
import ontology.values.SingleDescriptor;
import ontology.values.Value;
import ontology.values.ValueDescriptor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pabloq
 */
public class ValueTest {
    SingleDescriptor vd,vd2,vd3;
    RangeDescriptor vdr,vdr2,vdr3;

    public ValueTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        vd = new SingleDescriptor();
        vd2 = new SingleDescriptor();
        vd3 = new SingleDescriptor();
        vd.setValue("alargado");
        vd.setWeight(0.3);

        vd2.setValue("achatado");
        vd2.setWeight(0.2);

        vd3.setValue("redondo");
        vd3.setWeight(0.1);

        vdr = new RangeDescriptor();
        vdr2 = new RangeDescriptor();
        vdr3 = new RangeDescriptor();

        vdr.setLowerBound(5.0);
        vdr.setUpperBound(10.0);
        vdr.setMeasuringUnit(MeasuringUnit.INCH);

        vdr2.setLowerBound(0.1);
        vdr2.setUpperBound(0.5);
        vdr2.setMeasuringUnit(MeasuringUnit.CM);
        
        vdr3.setLowerBound(50.0);
        vdr3.setUpperBound(4.0);
        vdr3.setMeasuringUnit(MeasuringUnit.MM);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getValueDescriptors method, of class Value.
     */
    @Test
    public void testGetValueDescriptors_GenericType_TaxonomicRank() {
        System.out.println("getValueDescriptors");
        ValueDescriptor aDescriptor = null;
        TaxonomicRank aLevel = null;
        Value instance = new Value();
        ValueDescriptor expResult = null;
        ValueDescriptor result = instance.getValueDescriptors(aDescriptor, aLevel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueDescriptors method, of class Value.
     */
    @Test
    public void testGetValueDescriptors_0args() {
        System.out.println("getValueDescriptors");
        Value instance = new Value();
        Value expResult = null;
        Value result = instance.getValueDescriptors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueDescriptors method, of class Value.
     */
    @Test
    public void testGetValueDescriptors_TaxonomicRank() {
        System.out.println("getValueDescriptors");
        TaxonomicRank aLevel = null;
        Value instance = new Value();
        List expResult = null;
        List result = instance.getValueDescriptors(aLevel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRangeDescriptorsWithNumber method, of class Value.
     */
    @Test
    public void testGetRangeDescriptorsWithNumber() {
        System.out.println("getRangeDescriptorsWithNumber");
        double aNumber = 0.0;
        TaxonomicRank aLevel = null;
        Value instance = new Value();
        List expResult = null;
        List result = instance.getRangeDescriptorsWithNumber(aNumber, aLevel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRangeDescriptorsWithRange method, of class Value.
     */
    @Test
    public void testGetRangeDescriptorsWithRange() {
        System.out.println("getRangeDescriptorsWithRange");
        double aLowerBound = 0.0;
        double anUpperBound = 0.0;
        TaxonomicRank aLevel = null;
        Value instance = new Value();
        List expResult = null;
        List result = instance.getRangeDescriptorsWithRange(aLowerBound, anUpperBound, aLevel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSingleDescriptors method, of class Value.
     */
    @Test
    public void testGetSingleDescriptors_GenericType_TaxonomicRank() {
        System.out.println("getSingleDescriptors");
        Object aValue = null;
        TaxonomicRank aLevel = null;
        Value instance = new Value();
        List expResult = null;
        List result = instance.getSingleDescriptors(aValue, aLevel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSingleDescriptorsWithWeightInRange method, of class Value.
     */
    @Test
    public void testGetSingleDescriptorsWithWeightInRange() {
        System.out.println("getSingleDescriptorsWithWeightInRange");
        Object aValue = null;
        TaxonomicRank aLevel = null;
        double aLowerBound = 0.0;
        double anUpperBound = 0.0;
        Value instance = new Value();
        List expResult = null;
        List result = instance.getSingleDescriptorsWithWeightInRange(aValue, aLevel, aLowerBound, anUpperBound);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSingleDescriptors method, of class Value.
     */
    @Test
    public void testGetSingleDescriptors_4args_1() {
        System.out.println("getSingleDescriptors");
        Object aValue = null;
        double aWeight = 0.0;
        TaxonomicRank aLevel = null;
        String anOperator = "";
        Value instance = new Value();
        List expResult = null;
        List result = instance.getSingleDescriptors(aValue, aWeight, aLevel, anOperator);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSingleDescriptors method, of class Value.
     */
    @Test
    public void testGetSingleDescriptors_4args_2() {
        System.out.println("getSingleDescriptors");
        double aWeight = 0.0;
        TaxonomicRank aLevel = null;
        double aLowerBound = 0.0;
        double anUpperBound = 0.0;
        Value instance = new Value();
        List expResult = null;
        List result = instance.getSingleDescriptors(aWeight, aLevel, aLowerBound, anUpperBound);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSingleDescriptors method, of class Value.
     */
    @Test
    public void testGetSingleDescriptors_3args() {
        System.out.println("getSingleDescriptors");
        Value instance = new Value();
        instance.addValueDescriptor(vd, TaxonomicRank.FAMILY);
        instance.addValueDescriptor(vdr, TaxonomicRank.FAMILY);
        instance.addValueDescriptor(vd2, TaxonomicRank.FAMILY);
        instance.addValueDescriptor(vd3, TaxonomicRank.FAMILY);
        instance.addValueDescriptor(vdr3, TaxonomicRank.FAMILY);
        instance.getSingleDescriptors(0.3,TaxonomicRank.FAMILY, "=");
        assertEquals(vd,instance.getSingleDescriptors(0.3,TaxonomicRank.FAMILY, "=").get(0));
        assertEquals(vd3,instance.getSingleDescriptors(0.1,TaxonomicRank.FAMILY, "=").get(0));
    }

    /**
     * Test of addValueDescriptor method, of class Value.
     */
    @Test
    public void testAddValueDescriptor() {
        System.out.println("addValueDescriptor");
        Value instance = new Value();
        instance.addValueDescriptor(vd, TaxonomicRank.FAMILY);
        instance.addValueDescriptor(vd2, TaxonomicRank.GENUS);
        instance.addValueDescriptor(vd3, TaxonomicRank.SPECIES);


        assertEquals(3,instance.getValueDescriptors().size());
        /*
         * Check it they were added well
         *
         */
        assertEquals(vd,instance.getValueDescriptors().get(TaxonomicRank.getIndex(TaxonomicRank.FAMILY)-1).get(0));
        assertEquals(vd2,instance.getValueDescriptors().get(TaxonomicRank.getIndex(TaxonomicRank.GENUS)-1).get(0));
        assertEquals(vd3,instance.getValueDescriptors().get(TaxonomicRank.getIndex(TaxonomicRank.SPECIES)-1).get(0));

    }


    /**
     * Test of addValueDescriptorWithUniqueValue method, of class Value.
     */
    @Test
    public void testAddValueDescriptorWithUniqueValue() {
        System.out.println("addValueDescriptorWithUniqueValue");
        Value instance = new Value();
        instance.addValueDescriptor(vd, TaxonomicRank.FAMILY);
        instance.addValueDescriptor(vd2, TaxonomicRank.GENUS);
        instance.addValueDescriptor(vd3, TaxonomicRank.SPECIES);


        assertEquals(3,instance.getValueDescriptors().size());
        /*
         * Check it they were added well
         *
         */
        assertEquals(vd,instance.getValueDescriptors().get(TaxonomicRank.getIndex(TaxonomicRank.FAMILY)-1).get(0));
        assertEquals(vd2,instance.getValueDescriptors().get(TaxonomicRank.getIndex(TaxonomicRank.GENUS)-1).get(0));
        assertEquals(vd3,instance.getValueDescriptors().get(TaxonomicRank.getIndex(TaxonomicRank.SPECIES)-1).get(0));
    }

    /**
     * Test of includes method, of class Value.
     */
    @Test
    public void testIncludes() {
        System.out.println("includes");
        Value instance = new Value();
        instance.addValueDescriptor(vd, TaxonomicRank.FAMILY);
        instance.addValueDescriptor(vd2, TaxonomicRank.GENUS);
        instance.addValueDescriptor(vd3, TaxonomicRank.SPECIES);

        instance.addValueDescriptor(vdr, TaxonomicRank.FAMILY);
        instance.addValueDescriptor(vdr2, TaxonomicRank.GENUS);
        instance.addValueDescriptor(vdr3, TaxonomicRank.SPECIES);

        assertTrue(instance.includes(vd, TaxonomicRank.getIndex(TaxonomicRank.FAMILY)-1));
        assertTrue(instance.includes(vd2, TaxonomicRank.getIndex(TaxonomicRank.GENUS)-1));
        assertTrue(instance.includes(vd3, TaxonomicRank.getIndex(TaxonomicRank.SPECIES)-1));
        assertTrue(instance.includes(vdr, TaxonomicRank.getIndex(TaxonomicRank.FAMILY)-1));
        assertTrue(instance.includes(vdr2, TaxonomicRank.getIndex(TaxonomicRank.GENUS)-1));
        assertTrue(instance.includes(vdr3, TaxonomicRank.getIndex(TaxonomicRank.SPECIES)-1));

        /*
         * Some wrong cases
         *
         */
        assertFalse(instance.includes(vd, TaxonomicRank.getIndex(TaxonomicRank.GENUS)-1));
        assertFalse(instance.includes(vdr2, TaxonomicRank.getIndex(TaxonomicRank.SPECIES)-1));

        SingleDescriptor tvd = new SingleDescriptor();
        SingleDescriptor tvd2 = new SingleDescriptor();
        tvd.setValue("alargado");
        tvd.setWeight(0.3);

        tvd2.setValue("achatado");
        tvd2.setWeight(0.2);

        assertTrue(instance.includes(tvd, TaxonomicRank.getIndex(TaxonomicRank.FAMILY)-1));
        tvd.setWeight(0.9);
        assertFalse(instance.includes(tvd, TaxonomicRank.getIndex(TaxonomicRank.FAMILY)-1));

        assertTrue(instance.includes(tvd2, TaxonomicRank.getIndex(TaxonomicRank.GENUS)-1));
        tvd2.setWeight(0.45345);
        assertFalse(instance.includes(tvd2, TaxonomicRank.getIndex(TaxonomicRank.GENUS)-1));
    }

    /**
     * Test of includesUniqueValue method, of class Value.
     */
    @Test
    public void testIncludesUniqueValue() {
        System.out.println("includesUniqueValue");
        Value instance = new Value();
        instance.addValueDescriptor(vd, TaxonomicRank.FAMILY);
        instance.addValueDescriptor(vd2, TaxonomicRank.GENUS);
        instance.addValueDescriptor(vd3, TaxonomicRank.SPECIES);

        instance.addValueDescriptor(vdr, TaxonomicRank.FAMILY);
        instance.addValueDescriptor(vdr2, TaxonomicRank.GENUS);
        instance.addValueDescriptor(vdr3, TaxonomicRank.SPECIES);

        assertTrue(instance.includes(vd, TaxonomicRank.getIndex(TaxonomicRank.FAMILY)-1));
        assertTrue(instance.includes(vd2, TaxonomicRank.getIndex(TaxonomicRank.GENUS)-1));
        assertTrue(instance.includes(vd3, TaxonomicRank.getIndex(TaxonomicRank.SPECIES)-1));
        assertTrue(instance.includes(vdr, TaxonomicRank.getIndex(TaxonomicRank.FAMILY)-1));
        assertTrue(instance.includes(vdr2, TaxonomicRank.getIndex(TaxonomicRank.GENUS)-1));
        assertTrue(instance.includes(vdr3, TaxonomicRank.getIndex(TaxonomicRank.SPECIES)-1));

        /*
         * Some wrong cases
         *
         */
        assertFalse(instance.includes(vd, TaxonomicRank.getIndex(TaxonomicRank.GENUS)-1));
        assertFalse(instance.includes(vdr2, TaxonomicRank.getIndex(TaxonomicRank.SPECIES)-1));

    }

}