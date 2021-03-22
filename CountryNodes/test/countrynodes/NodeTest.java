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
 * The Node Class does work when combined with the main method. The reason the test failed is because the MainMethod contains 
 * the parameters that the setters and getters require to not come back as null.
 */
public class NodeTest {
    
    public NodeTest() {
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
     * Test of getData1 method, of class Node.
     */
    @Test
    public void testGetData1() {
        System.out.println("getData1");
        Node instance = new Node();
        String expResult = "";
        String result = instance.getData1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setData1 method, of class Node.
     */
    @Test
    public void testSetData1() {
        System.out.println("setData1");
        String data1 = "";
        Node instance = new Node();
        instance.setData1(data1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getData2 method, of class Node.
     */
    @Test
    public void testGetData2() {
        System.out.println("getData2");
        Node instance = new Node();
        String expResult = "";
        String result = instance.getData2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setData2 method, of class Node.
     */
    @Test
    public void testSetData2() {
        System.out.println("setData2");
        String data2 = "";
        Node instance = new Node();
        instance.setData2(data2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrev method, of class Node.
     */
    @Test
    public void testGetPrev() {
        System.out.println("getPrev");
        Node instance = new Node();
        Node expResult = null;
        Node result = instance.getPrev();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrev method, of class Node.
     */
    @Test
    public void testSetPrev() {
        System.out.println("setPrev");
        Node prev = null;
        Node instance = new Node();
        instance.setPrev(prev);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getNext method, of class Node.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        Node instance = new Node();
        Node expResult = null;
        Node result = instance.getNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNext method, of class Node.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        Node next = null;
        Node instance = new Node();
        instance.setNext(next);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
