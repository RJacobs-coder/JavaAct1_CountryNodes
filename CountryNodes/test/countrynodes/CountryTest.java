/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countrynodes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * The Country Class does work when combined with the main method. The reason the test failed is because the MainMethod contains 
 * the parameters that the setters and getters require to not come back as null.
 */
public class CountryTest {
    
    public CountryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCountryName method, of class Country.
     */
    @Test
    public void testGetCountryName() {
        System.out.println("getCountryName");
        Country instance = new Country();
        String expResult = "";
        String result = instance.getCountryName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCountryName method, of class Country.
     */
    @Test
    public void testSetCountryName() {
        System.out.println("setCountryName");
        String countryName = "";
        Country instance = new Country();
        instance.setCountryName(countryName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCity method, of class Country.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Country instance = new Country();
        String expResult = "";
        String result = instance.getCity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setCity method, of class Country.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "";
        Country instance = new Country();
        instance.setCity(city);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
