/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidjabma;

import java.util.Vector;
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
public class ConnectDbTest {
    
    public ConnectDbTest() {
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
     * Test of Login method, of class ConnectDb.
     */
    @Test
    public void testLogin() throws Exception {
        System.out.println("Login");
        String username = "";
        String password = "";
        ConnectDb instance = new ConnectDb();
        User expResult = null;
        User result = instance.Login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SignUp method, of class ConnectDb.
     */
    @Test
    public void testSignUp() throws Exception {
        System.out.println("SignUp");
        String NationalId = "";
        String Password = "";
        String username = "";
        String FirstName = "";
        String LastName = "";
        String Gender = "";
        String Residence = "";
        String Ages = "";
        ConnectDb instance = new ConnectDb();
        Boolean expResult = null;
        Boolean result = instance.SignUp(NationalId, Password, username, FirstName, LastName, Gender, Residence, Ages);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ResetPassword method, of class ConnectDb.
     */
    @Test
    public void testResetPassword() throws Exception {
        System.out.println("ResetPassword");
        String NationalId = "";
        String Password = "";
        ConnectDb instance = new ConnectDb();
        Boolean expResult = null;
        Boolean result = instance.ResetPassword(NationalId, Password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateUserRole method, of class ConnectDb.
     */
    @Test
    public void testUpdateUserRole() throws Exception {
        System.out.println("UpdateUserRole");
        String NationalId = "";
        String role = "";
        ConnectDb instance = new ConnectDb();
        Boolean expResult = null;
        Boolean result = instance.UpdateUserRole(NationalId, role);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetUsers method, of class ConnectDb.
     */
    @Test
    public void testGetUsers() throws Exception {
        System.out.println("GetUsers");
        ConnectDb instance = new ConnectDb();
        Vector<User> expResult = null;
        Vector<User> result = instance.GetUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateUser method, of class ConnectDb.
     */
    @Test
    public void testUpdateUser() throws Exception {
        System.out.println("UpdateUser");
        String NationalId = "";
        String Password = "";
        String username = "";
        String FirstName = "";
        String LastName = "";
        String Gender = "";
        String Residence = "";
        String Ages = "";
        String role = "";
        ConnectDb instance = new ConnectDb();
        boolean expResult = false;
        boolean result = instance.UpdateUser(NationalId, Password, username, FirstName, LastName, Gender, Residence, Ages, role);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteUser method, of class ConnectDb.
     */
    @Test
    public void testDeleteUser() throws Exception {
        System.out.println("DeleteUser");
        String NationalId = "";
        ConnectDb instance = new ConnectDb();
        Boolean expResult = null;
        Boolean result = instance.DeleteUser(NationalId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreatePackage method, of class ConnectDb.
     */
    @Test
    public void testCreatePackage() throws Exception {
        System.out.println("CreatePackage");
        String id = "";
        String Derivery = "";
        String EntId = "";
        String Name = "";
        String Cost = "";
        String Amount = "";
        ConnectDb instance = new ConnectDb();
        Boolean expResult = null;
        Boolean result = instance.CreatePackage(id, Derivery, EntId, Name, Cost, Amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdatePackage method, of class ConnectDb.
     */
    @Test
    public void testUpdatePackage() throws Exception {
        System.out.println("UpdatePackage");
        String id = "";
        String Derivery = "";
        String EntId = "";
        String Name = "";
        String Cost = "";
        String Amount = "";
        ConnectDb instance = new ConnectDb();
        Boolean expResult = null;
        Boolean result = instance.UpdatePackage(id, Derivery, EntId, Name, Cost, Amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetPackage method, of class ConnectDb.
     */
    @Test
    public void testGetPackage() throws Exception {
        System.out.println("GetPackage");
        ConnectDb instance = new ConnectDb();
        Vector<Derivery> expResult = null;
        Vector<Derivery> result = instance.GetPackage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeletePackage method, of class ConnectDb.
     */
    @Test
    public void testDeletePackage() throws Exception {
        System.out.println("DeletePackage");
        String id = "";
        ConnectDb instance = new ConnectDb();
        Boolean expResult = null;
        Boolean result = instance.DeletePackage(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateOrganization method, of class ConnectDb.
     */
    @Test
    public void testUpdateOrganization() throws Exception {
        System.out.println("UpdateOrganization");
        String id = "";
        String Name = "";
        String Location = "";
        String Address = "";
        ConnectDb instance = new ConnectDb();
        boolean expResult = false;
        boolean result = instance.UpdateOrganization(id, Name, Location, Address);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreateOrganization method, of class ConnectDb.
     */
    @Test
    public void testCreateOrganization() throws Exception {
        System.out.println("CreateOrganization");
        String Name = "";
        String Location = "";
        String Address = "";
        ConnectDb instance = new ConnectDb();
        boolean expResult = false;
        boolean result = instance.CreateOrganization(Name, Location, Address);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteOrganizatione method, of class ConnectDb.
     */
    @Test
    public void testDeleteOrganizatione() throws Exception {
        System.out.println("DeleteOrganizatione");
        String id = "";
        ConnectDb instance = new ConnectDb();
        Boolean expResult = null;
        Boolean result = instance.DeleteOrganizatione(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetOrganization method, of class ConnectDb.
     */
    @Test
    public void testGetOrganization() throws Exception {
        System.out.println("GetOrganization");
        ConnectDb instance = new ConnectDb();
        Vector<Organization> expResult = null;
        Vector<Organization> result = instance.GetOrganization();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteEnterPrises method, of class ConnectDb.
     */
    @Test
    public void testDeleteEnterPrises() throws Exception {
        System.out.println("DeleteEnterPrises");
        String id = "";
        ConnectDb instance = new ConnectDb();
        Boolean expResult = null;
        Boolean result = instance.DeleteEnterPrises(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreateEnterPrises method, of class ConnectDb.
     */
    @Test
    public void testCreateEnterPrises() throws Exception {
        System.out.println("CreateEnterPrises");
        String Name = "";
        String Location = "";
        String country = "";
        String Vaccine = "";
        String Address = "";
        ConnectDb instance = new ConnectDb();
        boolean expResult = false;
        boolean result = instance.CreateEnterPrises(Name, Location, country, Vaccine, Address);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateEnterPrises method, of class ConnectDb.
     */
    @Test
    public void testUpdateEnterPrises() throws Exception {
        System.out.println("UpdateEnterPrises");
        String Id = "";
        String Name = "";
        String Location = "";
        String country = "";
        String Vaccine = "";
        String Address = "";
        ConnectDb instance = new ConnectDb();
        boolean expResult = false;
        boolean result = instance.UpdateEnterPrises(Id, Name, Location, country, Vaccine, Address);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetEnterPrises method, of class ConnectDb.
     */
    @Test
    public void testGetEnterPrises() throws Exception {
        System.out.println("GetEnterPrises");
        ConnectDb instance = new ConnectDb();
        Vector<EnterPrises> expResult = null;
        Vector<EnterPrises> result = instance.GetEnterPrises();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetDocumentation method, of class ConnectDb.
     */
    @Test
    public void testGetDocumentation() throws Exception {
        System.out.println("GetDocumentation");
        ConnectDb instance = new ConnectDb();
        Vector<String> expResult = null;
        Vector<String> result = instance.GetDocumentation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateDocumentation method, of class ConnectDb.
     */
    @Test
    public void testUpdateDocumentation() throws Exception {
        System.out.println("UpdateDocumentation");
        String id = "";
        String Text = "";
        ConnectDb instance = new ConnectDb();
        Boolean expResult = null;
        Boolean result = instance.UpdateDocumentation(id, Text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreateDocumentation method, of class ConnectDb.
     */
    @Test
    public void testCreateDocumentation() throws Exception {
        System.out.println("CreateDocumentation");
        String EntId = "";
        String Text = "";
        ConnectDb instance = new ConnectDb();
        Boolean expResult = null;
        Boolean result = instance.CreateDocumentation(EntId, Text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetOrganizationList method, of class ConnectDb.
     */
    @Test
    public void testGetOrganizationList() throws Exception {
        System.out.println("GetOrganizationList");
        ConnectDb instance = new ConnectDb();
        String[] expResult = null;
        String[] result = instance.GetOrganizationList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Createschedule method, of class ConnectDb.
     */
    @Test
    public void testCreateschedule() throws Exception {
        System.out.println("Createschedule");
        String Date = "";
        String Vaccine = "";
        String OrgId = "";
        String time = "";
        ConnectDb instance = new ConnectDb();
        Boolean expResult = null;
        Boolean result = instance.Createschedule(Date, Vaccine, OrgId, time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeriverPackage method, of class ConnectDb.
     */
    @Test
    public void testDeriverPackage() throws Exception {
        System.out.println("DeriverPackage");
        ConnectDb instance = new ConnectDb();
        boolean expResult = false;
        boolean result = instance.DeriverPackage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Getschedule method, of class ConnectDb.
     */
    @Test
    public void testGetschedule() throws Exception {
        System.out.println("Getschedule");
        ConnectDb instance = new ConnectDb();
        Vector<schedule> expResult = null;
        Vector<schedule> result = instance.Getschedule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetJab method, of class ConnectDb.
     */
    @Test
    public void testGetJab() throws Exception {
        System.out.println("GetJab");
        ConnectDb instance = new ConnectDb();
        Vector<JabDetails> expResult = null;
        Vector<JabDetails> result = instance.GetJab();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetReuestJab method, of class ConnectDb.
     */
    @Test
    public void testGetReuestJab() throws Exception {
        System.out.println("GetReuestJab");
        ConnectDb instance = new ConnectDb();
        Vector<JabDetails> expResult = null;
        Vector<JabDetails> result = instance.GetReuestJab();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
