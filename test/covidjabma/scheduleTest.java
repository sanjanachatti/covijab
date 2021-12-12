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
public class scheduleTest {
    
    public scheduleTest() {
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
     * Test of Setid method, of class schedule.
     */
    @Test
    public void testSetid() {
        System.out.println("Setid");
        String id = "";
        schedule instance = new schedule();
        instance.Setid(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetDate method, of class schedule.
     */
    @Test
    public void testSetDate() {
        System.out.println("SetDate");
        String Date = "";
        schedule instance = new schedule();
        instance.SetDate(Date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetJabName method, of class schedule.
     */
    @Test
    public void testSetJabName() {
        System.out.println("SetJabName");
        String JabName = "";
        schedule instance = new schedule();
        instance.SetJabName(JabName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetOrgId method, of class schedule.
     */
    @Test
    public void testSetOrgId() {
        System.out.println("SetOrgId");
        String OrgId = "";
        schedule instance = new schedule();
        instance.SetOrgId(OrgId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Getid method, of class schedule.
     */
    @Test
    public void testGetid() {
        System.out.println("Getid");
        schedule instance = new schedule();
        String expResult = "";
        String result = instance.Getid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetDate method, of class schedule.
     */
    @Test
    public void testGetDate() {
        System.out.println("GetDate");
        schedule instance = new schedule();
        String expResult = "";
        String result = instance.GetDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetJabName method, of class schedule.
     */
    @Test
    public void testGetJabName() {
        System.out.println("GetJabName");
        schedule instance = new schedule();
        String expResult = "";
        String result = instance.GetJabName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetOrgId method, of class schedule.
     */
    @Test
    public void testGetOrgId() {
        System.out.println("GetOrgId");
        schedule instance = new schedule();
        String expResult = "";
        String result = instance.GetOrgId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
