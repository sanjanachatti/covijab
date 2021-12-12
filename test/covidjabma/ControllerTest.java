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
public class ControllerTest {
    
    public ControllerTest() {
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
     * Test of login method, of class Controller.
     */
    @Test
    public void testLogin_String_String() throws Exception {
        System.out.println("login");
        String username = "";
        String password = "";
        Controller instance = new Controller();
        String expResult = "";
        String result = instance.login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of goToAdmin method, of class Controller.
     */
    @Test
    public void testGoToAdmin() {
        System.out.println("goToAdmin");
        Controller instance = new Controller();
        instance.goToAdmin();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GoToHome method, of class Controller.
     */
    @Test
    public void testGoToHome() {
        System.out.println("GoToHome");
        Controller instance = new Controller();
        instance.GoToHome();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Login method, of class Controller.
     */
    @Test
    public void testLogin_0args() {
        System.out.println("Login");
        Controller instance = new Controller();
        instance.Login();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateJab method, of class Controller.
     */
    @Test
    public void testUpdateJab() {
        System.out.println("UpdateJab");
        JabDetails data = null;
        String id = "";
        Controller instance = new Controller();
        instance.UpdateJab(data, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteJab method, of class Controller.
     */
    @Test
    public void testDeleteJab() {
        System.out.println("deleteJab");
        String name = "";
        Controller instance = new Controller();
        instance.deleteJab(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class Controller.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        String id = "";
        Controller instance = new Controller();
        instance.deleteUser(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeApp method, of class Controller.
     */
    @Test
    public void testCloseApp() {
        System.out.println("closeApp");
        Controller instance = new Controller();
        instance.closeApp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreateUser method, of class Controller.
     */
    @Test
    public void testCreateUser() {
        System.out.println("CreateUser");
        String NationalId = "";
        String Password = "";
        String username = "";
        String FirstName = "";
        String LastName = "";
        String Gender = "";
        String Residence = "";
        String Ages = "";
        Controller instance = new Controller();
        instance.CreateUser(NationalId, Password, username, FirstName, LastName, Gender, Residence, Ages);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateUserRole method, of class Controller.
     */
    @Test
    public void testUpdateUserRole() {
        System.out.println("UpdateUserRole");
        String id = "";
        String Role = "";
        Controller instance = new Controller();
        instance.UpdateUserRole(id, Role);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Destructor method, of class Controller.
     */
    @Test
    public void testDestructor() {
        System.out.println("Destructor");
        Controller instance = new Controller();
        instance.Destructor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreateJab method, of class Controller.
     */
    @Test
    public void testCreateJab() {
        System.out.println("CreateJab");
        String name = "";
        String amount = "";
        String cost = "";
        String hospital = "";
        String location = "";
        Controller instance = new Controller();
        instance.CreateJab(name, amount, cost, hospital, location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ResetPassword method, of class Controller.
     */
    @Test
    public void testResetPassword() {
        System.out.println("ResetPassword");
        String id = "";
        String password = "";
        Controller instance = new Controller();
        instance.ResetPassword(id, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetUsers method, of class Controller.
     */
    @Test
    public void testGetUsers() {
        System.out.println("GetUsers");
        Controller instance = new Controller();
        instance.GetUsers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreateJabPackage method, of class Controller.
     */
    @Test
    public void testCreateJabPackage() {
        System.out.println("CreateJabPackage");
        String id = "";
        String Derivery = "";
        String EntId = "";
        String Name = "";
        String Cost = "";
        String Amount = "";
        Controller instance = new Controller();
        instance.CreateJabPackage(id, Derivery, EntId, Name, Cost, Amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreateDocumentation method, of class Controller.
     */
    @Test
    public void testCreateDocumentation() {
        System.out.println("CreateDocumentation");
        String EntId = "";
        String Text = "";
        Controller instance = new Controller();
        instance.CreateDocumentation(EntId, Text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetOrganizationList method, of class Controller.
     */
    @Test
    public void testGetOrganizationList() {
        System.out.println("GetOrganizationList");
        Controller instance = new Controller();
        String[] expResult = null;
        String[] result = instance.GetOrganizationList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Createschedule method, of class Controller.
     */
    @Test
    public void testCreateschedule() {
        System.out.println("Createschedule");
        String Date = "";
        String Vaccine = "";
        String OrgId = "";
        String time = "";
        Controller instance = new Controller();
        instance.Createschedule(Date, Vaccine, OrgId, time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetDocumentations method, of class Controller.
     */
    @Test
    public void testGetDocumentations() {
        System.out.println("GetDocumentations");
        Controller instance = new Controller();
        Vector<String> expResult = null;
        Vector<String> result = instance.GetDocumentations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeriverPackage method, of class Controller.
     */
    @Test
    public void testDeriverPackage() {
        System.out.println("DeriverPackage");
        Controller instance = new Controller();
        instance.DeriverPackage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RequesyJab method, of class Controller.
     */
    @Test
    public void testRequesyJab() {
        System.out.println("RequesyJab");
        String Id = "";
        String name = "";
        String Date = "";
        Controller instance = new Controller();
        instance.RequesyJab(Id, name, Date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreateOrganization method, of class Controller.
     */
    @Test
    public void testCreateOrganization() {
        System.out.println("CreateOrganization");
        String Name = "";
        String Location = "";
        String Address = "";
        Controller instance = new Controller();
        instance.CreateOrganization(Name, Location, Address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateOrganization method, of class Controller.
     */
    @Test
    public void testUpdateOrganization() {
        System.out.println("UpdateOrganization");
        String id = "";
        String Name = "";
        String Location = "";
        String Address = "";
        Controller instance = new Controller();
        instance.UpdateOrganization(id, Name, Location, Address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreateEnterPrises method, of class Controller.
     */
    @Test
    public void testCreateEnterPrises() {
        System.out.println("CreateEnterPrises");
        String Name = "";
        String Location = "";
        String country = "";
        String Vaccine = "";
        String Address = "";
        Controller instance = new Controller();
        instance.CreateEnterPrises(Name, Location, country, Vaccine, Address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateEnterPrises method, of class Controller.
     */
    @Test
    public void testUpdateEnterPrises() {
        System.out.println("UpdateEnterPrises");
        String Id = "";
        String Name = "";
        String Location = "";
        String country = "";
        String Vaccine = "";
        String Address = "";
        Controller instance = new Controller();
        instance.UpdateEnterPrises(Id, Name, Location, country, Vaccine, Address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Getschedule method, of class Controller.
     */
    @Test
    public void testGetschedule() {
        System.out.println("Getschedule");
        Controller instance = new Controller();
        Vector<schedule> expResult = null;
        Vector<schedule> result = instance.Getschedule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetJabs method, of class Controller.
     */
    @Test
    public void testGetJabs() {
        System.out.println("GetJabs");
        Controller instance = new Controller();
        Vector<JabDetails> expResult = null;
        Vector<JabDetails> result = instance.GetJabs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of users method, of class Controller.
     */
    @Test
    public void testUsers() {
        System.out.println("users");
        Controller instance = new Controller();
        Vector<User> expResult = null;
        Vector<User> result = instance.users();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetReuestJab method, of class Controller.
     */
    @Test
    public void testGetReuestJab() {
        System.out.println("GetReuestJab");
        Controller instance = new Controller();
        Vector<JabDetails> expResult = null;
        Vector<JabDetails> result = instance.GetReuestJab();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
