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
public class OrganizationTest {
    
    public OrganizationTest() {
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
     * Test of Setid method, of class Organization.
     */
    @Test
    public void testSetid() {
        System.out.println("Setid");
        String id = "";
        Organization instance = new Organization();
        instance.Setid(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetName method, of class Organization.
     */
    @Test
    public void testSetName() {
        System.out.println("SetName");
        String Name = "";
        Organization instance = new Organization();
        instance.SetName(Name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetLocation method, of class Organization.
     */
    @Test
    public void testSetLocation() {
        System.out.println("SetLocation");
        String Location = "";
        Organization instance = new Organization();
        instance.SetLocation(Location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetAddress method, of class Organization.
     */
    @Test
    public void testSetAddress() {
        System.out.println("SetAddress");
        String Address = "";
        Organization instance = new Organization();
        instance.SetAddress(Address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Getid method, of class Organization.
     */
    @Test
    public void testGetid() {
        System.out.println("Getid");
        Organization instance = new Organization();
        String expResult = "";
        String result = instance.Getid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetName method, of class Organization.
     */
    @Test
    public void testGetName() {
        System.out.println("GetName");
        Organization instance = new Organization();
        String expResult = "";
        String result = instance.GetName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetLocation method, of class Organization.
     */
    @Test
    public void testGetLocation() {
        System.out.println("GetLocation");
        Organization instance = new Organization();
        String expResult = "";
        String result = instance.GetLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAddress method, of class Organization.
     */
    @Test
    public void testGetAddress() {
        System.out.println("GetAddress");
        Organization instance = new Organization();
        String expResult = "";
        String result = instance.GetAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
