/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidjabma;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class DocumentationTest {
    
    public DocumentationTest() {
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
     * Test of Setid method, of class Documentation.
     */
    @Test
    public void testSetid() {
        System.out.println("Setid");
        String id = "";
        Documentation instance = new Documentation();
        instance.Setid(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetText method, of class Documentation.
     */
    @Test
    public void testSetText() {
        System.out.println("SetText");
        String Text = "";
        Documentation instance = new Documentation();
        instance.SetText(Text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetEntId method, of class Documentation.
     */
    @Test
    public void testSetEntId() {
        System.out.println("SetEntId");
        String EntId = "";
        Documentation instance = new Documentation();
        instance.SetEntId(EntId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Getid method, of class Documentation.
     */
    @Test
    public void testGetid() {
        System.out.println("Getid");
        Documentation instance = new Documentation();
        String expResult = "";
        String result = instance.Getid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetText method, of class Documentation.
     */
    @Test
    public void testGetText() {
        System.out.println("GetText");
        Documentation instance = new Documentation();
        String expResult = "";
        String result = instance.GetText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetEntId method, of class Documentation.
     */
    @Test
    public void testGetEntId() {
        System.out.println("GetEntId");
        Documentation instance = new Documentation();
        String expResult = "";
        String result = instance.GetEntId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
