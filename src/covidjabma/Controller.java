/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidjabma;
import covidjabma.User;
import covidjabma.JabDetails;
import covidjabma.ConnectDb;
import covidjabma.Ui.Manager;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Manager
 */
public class Controller {
   
  public  Controller(){
         
    }
//data
  
    //the signal on where to go
 public   String login(String username,String password) throws SQLException, ClassNotFoundException{
  ConnectDb db=new ConnectDb();
  User user=new User();
  try{
  user=db.Login(username,password);
     System.out.print(user.getusername());
     String Data;
     Data=""+user.getNationalId()+"\t"+user.getFirstName()+"\t"+user.getusername()+"\t"+user.getrole();
  
    return (Data);
  }
  catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Wrong password or username");
        
       }
      
      return("Unknown");
    }
    void goToAdmin(){
         Manager admin=new Manager();
         admin.show();
    }
    void GoToHome(){
        
    }
    void Login(){
        
    }
  
  public  void UpdateJab(JabDetails data,String id){
       
    }
 public   void deleteJab(String name){
       
    }
  public  void deleteUser(String id){
         ConnectDb db=new ConnectDb();
      try {
          db.DeleteUser(id);
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  public  void closeApp(){
       
    }
 public   void CreateUser(String NationalId,String Password,String username,String FirstName,String LastName,String Gender,String Residence,String Ages){
    ConnectDb db=new ConnectDb();
      try {
          db.SignUp (NationalId, Password, username, FirstName, LastName, Gender, Residence,Ages);
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
 public void UpdateUserRole(String id,String Role){
     ConnectDb db=new ConnectDb();
      try {
          db.UpdateUserRole(id, Role);
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
 }
  public void Destructor(){
     
  }  
   public   void CreateJab(String name,String amount,String cost,String hospital,String location){
        JabDetails Jab=new JabDetails(location,amount,cost,hospital,name);
        
     
    }
   public void ResetPassword(String id,String password )
   {
      
   }
   
   public void GetUsers(){
     
   }
  public void CreateJabPackage(String id,String Derivery,String EntId,String Name,String Cost,String Amount){
     
       ConnectDb db=new ConnectDb();
      try {
          db.CreatePackage(id, Derivery, EntId, Name, Cost, Amount);
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
public void CreateDocumentation(String EntId,String Text) {
      ConnectDb db=new ConnectDb();
      try {
          System.out.println(EntId+Text);
          db.CreateDocumentation(EntId,Text);
          
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
}

public String[] GetOrganizationList(){
    ConnectDb db=new ConnectDb();
      try {
          return db.GetOrganizationList();
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
      return null;
}

public void Createschedule(String Date,String Vaccine,String OrgId,String time){
    ConnectDb db=new ConnectDb();
      try {
          db.Createschedule( Date, Vaccine, OrgId,time);
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
}
 public Vector<String> GetDocumentations(){
     Vector<String> data=new Vector<String>();
     ConnectDb db=new ConnectDb();
      try {
          data= db.GetDocumentation();
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
     return data;
 }
 
 public void DeriverPackage()
 {
     
      ConnectDb db=new ConnectDb();
      try {
          db.DeriverPackage();
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
 }
 public void RequesyJab(String Id,String name,String Date){
      try {
          ConnectDb db=new ConnectDb();
          db.CreateRequestJab( Id, name, Date);
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
 }
 public void CreateOrganization(String Name,String Location,String Address)
 {
      try {
          ConnectDb db=new ConnectDb();
          db.CreateOrganization(Name,Location,Address);
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
 }
 public void UpdateOrganization(String id,String Name,String Location,String Address)
 {
     ConnectDb db=new ConnectDb();
      try {
          db.UpdateOrganization(id,Name, Location,Address);
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
 }
public void CreateEnterPrises(String Name, String Location,String  country,String Vaccine,String Address){
    ConnectDb db=new ConnectDb();
      try {
          db.CreateEnterPrises(Name,Location,country, Vaccine, Address);
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
}
public void UpdateEnterPrises(String Id,String Name, String Location,String  country,String Vaccine,String Address)
{
      ConnectDb db=new ConnectDb();
      try {
          db.UpdateEnterPrises(Id,Name,Location,country, Vaccine, Address);
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
}
public  Vector<schedule> Getschedule() {
    ConnectDb db=new ConnectDb();
      try {
          return db.Getschedule();
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
      return null;
}
public  Vector<JabDetails> GetJabs()
{
      ConnectDb db=new ConnectDb();
      try {
          return db.GetJab();
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
      return null;
}
public  Vector<JabDetails> GetInventory()
{
      ConnectDb db=new ConnectDb();
      try {
          return db.GetInventory();
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
      return null;
}

public Vector<User> users(){
    ConnectDb db=new ConnectDb();
      try {
          return db.GetUsers();
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
      return null;
}
public  Vector<JabDetails> GetReuestJab()
{
      ConnectDb db=new ConnectDb();
      try {
          return db.GetReuestJab();
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
      return null;
}

  public void updateuser(String id,String firstname,String lastnametxt,String usernametxt,String gendercombo,int rolescombo,String passwordtxt){
      try {
          ConnectDb db=new ConnectDb();
          db.UpdateUsers( id, firstname, lastnametxt, usernametxt, gendercombo, rolescombo, passwordtxt);
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
}
