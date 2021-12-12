
package covidjabma;
import java.sql.*;  
import java.util.Vector;
class ConnectDb{ 
    
    private String jdbcURL = "jdbc:mysql://localhost:3306/covid19jabmis";
    private String dbUser = "root";
    private String dbPassword = "";
        
        public User Login(String username, String password) throws SQLException,
        ClassNotFoundException {

        User user;
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "SELECT * FROM users WHERE username =? AND password =? ";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, username);
                statement.setString(2, password);
                ResultSet result = statement.executeQuery();
                user = null;
                 
                while(result.next()) {
                   
                   user = new User();
                   user.setFirstName(result.getString("Fname"));
                   user.setusername(result.getString("username"));
                   user.setLastName(result.getString("Lname"));
                   user.setAge(result.getString("Age"));
                   user.setGender(result.getString("Gender"));
                   user.setResidence(result.getString("Resident"));
                   user.setrole(result.getString("role"));
                   user.setNationalId(result.getString("Nationalid"));
             
                }  
                 connection.close();
            }

        return user;
        
    }
 
        
 public Boolean SignUp(String NationalId,String Password,String username,String FirstName,String LastName,String Gender,String Residence,String Ages) throws SQLException,ClassNotFoundException {

            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "INSERT INTO users (Nationalid, Fname, Lname, username, password, Gender, Resident, role, Age) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?);";
                PreparedStatement statement = connection.prepareStatement(sql);
                 
                statement.setString(1, NationalId);
                statement.setString(2, FirstName);
                statement.setString(3, LastName);
                statement.setString(4, username);
                statement.setString(5, Password);
                statement.setString(6, Gender);
                statement.setString(7, Residence);
                statement.setString(8,"13");
                statement.setString(9, Ages);
                statement.execute();
               connection.close();
                   }

        return true;
        
    }     
 
 
 public Boolean ResetPassword(String NationalId,String Password) throws SQLException,ClassNotFoundException
         {
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "UPDATE  users SET  password=? WHERE Nationalid=?;";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(2, NationalId);
                statement.setString(1, Password);
              
                statement.execute();
               connection.close();
                   }

        return true;      
    }
 public Boolean UpdateUserRole(String NationalId,String role) throws SQLException,ClassNotFoundException
         {
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "UPDATE  users SET  role=? WHERE Nationalid=?;";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(2, NationalId);
                statement.setString(1, role);
              
                statement.execute();
               connection.close();
                   }

        return true;
        
    }
 //User Information
 //
 /* 
 -delete user->DELETE FROM table_name WHERE condition;
 -update user ->UPDATE table_name SET column1 = value1, column2 = value2 WHERE condition >>;
 -read all users-> SELECT * FROM users;
 */
 
 public Vector<User> GetUsers()throws SQLException,ClassNotFoundException{
       Vector<User> users =new Vector<User>();
       users.clear();
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "SELECT * FROM users";
                Statement  statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sql);
                
                while(result.next()) { 
                  
                    users.add(new User(result.getString("Nationalid"),"",result.getString("username"),result.getString("Fname"),result.getString("Lname"),result.getString("Gender"),result.getString("Resident"),result.getString("Age"))); 
                }
                connection.close();
                }  

        return users;
     
 }
 
 public boolean UpdateUser(String NationalId,String Password,String username,String FirstName,String LastName,String Gender,String Residence,String Ages,String role) throws SQLException,ClassNotFoundException {
            
    
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "UPDATE  users SET Nationalid=?, Fname=?, Lname=?, username=?, password=?, Gender=?, Resident=?, role=?, Age=? WHERE Nationalid=?;";
                PreparedStatement statement = connection.prepareStatement(sql);
                 
                statement.setString(1, NationalId);
                statement.setString(2, FirstName);
                statement.setString(3, LastName);
                statement.setString(4, username);
                statement.setString(5, Password);
                statement.setString(6, Gender);
                statement.setString(7, Residence);
                statement.setString(8,role);
                statement.setString(9, Ages);
                statement.setString(9, NationalId);
                statement.execute();
               connection.close();
                   }

        return true;
        
    }  
  public Boolean DeleteUser(String NationalId) throws SQLException,ClassNotFoundException
         {
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "DELETE FROM users  WHERE Nationalid=?;";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, NationalId);
                statement.execute();
               connection.close();
                   }

        return true;
        
    }
 //Packages
 /*
 -create package>>
 -delete Package->DELETE FROM table_name WHERE condition;>>>>
 -update package->UPDATE table_name SET column1 = value1, column2 = value2 WHERE condition;
 -read package-> SELECT * FROM users;>>>
 */
 
  public Boolean CreatePackage(String id,String Derivery,String EntId,String Name,String Cost,String Amount) throws SQLException,ClassNotFoundException {
 
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "INSERT INTO `package` ( `Name`, `Cost`, `Amount`, `Emptid`) VALUES ( ?, ?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                 
                statement.setString(1, Name);
                statement.setString(2, Cost);
                statement.setString(3, Amount);
                statement.setString(4, EntId);
                
                statement.execute();
               connection.close();
                   }

        return true;   
    }
  public Boolean UpdatePackage(String id,String Derivery,String EntId,String Name,String Cost,String Amount) throws SQLException,ClassNotFoundException {
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "UPDATE  `package` SET `Name`=?, `Cost`=?, `Amount`=?, `Emptid`=? WHERE id=?);";
                PreparedStatement statement = connection.prepareStatement(sql);
                 
                statement.setString(1, Name);
                statement.setString(2, Cost);
                statement.setString(3, Amount);
                statement.setString(4, EntId);
                statement.setString(5, id);
                
                statement.execute();
               connection.close();
                   }

        return true;
        
    } 
   public Vector<Derivery> GetPackage()throws SQLException,ClassNotFoundException{
       Vector<Derivery> Package =new Vector<Derivery>();
       Package.clear();
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "SELECT * FROM Package";
                Statement  statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sql);
                
                while(result.next()) { 
                 //(String id,String Derivery,String EntId,String Name,String Cost,String Amount)
                    Package.add(new Derivery(result.getString("id"),"",result.getString("Emptid"),result.getString("Name"),result.getString("Cost"),result.getString("Amount"))); 
                }
                connection.close();
                }  

        return Package;
     
 }
   public Boolean DeletePackage(String id) throws SQLException,ClassNotFoundException
         {
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "DELETE FROM users  WHERE id=?;";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, id);
                statement.execute();
               connection.close();
                   }

        return true;
        
    }
 //Organization
 /*
 -Create org>>>
 -update org->UPDATE table_name SET column1 = value1, column2 = value2 WHERE condition;>>>
 -read org-> SELECT * FROM users;>>>>
 -delete org->DELETE FROM table_name WHERE condition;>>>>>>>>>>>>>
 */
   
   public boolean UpdateOrganization(String id,String Name,String Location,String Address) throws SQLException,ClassNotFoundException {
            
    
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "UPDATE `organizations` SET `name`=?, `Location`=?, `Address`=? WHERE id=?";
                PreparedStatement statement = connection.prepareStatement(sql);
                 
                statement.setString(1, Name);
                statement.setString(2, Location);
                statement.setString(3, Address);
                  statement.setString(4, id);
                
                statement.execute();
               connection.close();
                   }

        return true;
        
    }
    public boolean CreateOrganization(String Name,String Location,String Address) throws SQLException,ClassNotFoundException {
            
    
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "INSERT INTO `organizations` ( `name`, `Location`, `Address`) VALUES (?, ?, ?);";
                PreparedStatement statement = connection.prepareStatement(sql);
               
                statement.setString(1, Name);
                statement.setString(2, Location);
                statement.setString(3, Address);
                
                statement.execute();
               connection.close();
                   }

        return true;
        
    } 
   public Boolean DeleteOrganizatione(String id) throws SQLException,ClassNotFoundException
         {
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "DELETE FROM organizations  WHERE id=?;";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, id);
                statement.execute();
               connection.close();
                   }

        return true;
        
    }
    public Vector<Organization> GetOrganization()throws SQLException,ClassNotFoundException{
       Vector<Organization> organization =new Vector<Organization>();
       organization.clear();
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "SELECT * FROM documentation";
                Statement  statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sql);
                
                if(result.next()) { 
                 //String id,String Text,String EntId)
                    organization.add(new Organization(result.getString("id"),result.getString("name"),result.getString("Location"),result.getString("Address"))); 
                }
                connection.close();
                }  

        return organization;
     
 }
 //Enterpise
 /*
 -Create >>>
 -delete->DELETE FROM table_name WHERE condition;>>
 -update->UPDATE table_name SET column1 = value1, column2 = value2 WHERE condition;>>>
 -read->SELECT * FROM users;>>>>>
 */
  public Boolean DeleteEnterPrises(String id) throws SQLException,ClassNotFoundException
         {
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "DELETE FROM enterprises  WHERE id=?;";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, id);
                statement.execute();
               connection.close();
                   }

        return true;
        
    }   
  public boolean CreateEnterPrises(String Name, String Location,String  country,String Vaccine,String Address) throws SQLException,ClassNotFoundException {
            
    
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "INSERT INTO `enterprises` (`name`, `Location`, `country`, `Vaccine`, `Address`) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);
               
                statement.setString(1, Name);
                statement.setString(2, Location);
                statement.setString(3, country);
                statement.setString(4, Vaccine);
                statement.setString(5, Address);
                statement.execute();
               connection.close();
                   }

        return true;
        
    } 
      
  public boolean UpdateEnterPrises(String Id,String Name, String Location,String  country,String Vaccine,String Address) throws SQLException,ClassNotFoundException {
           
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "UPDATE  `enterprises` SET `name`=?, `Location`=?, `country`=?, `Vaccine`=?, `Address`=? WHERE id=?";
                PreparedStatement statement = connection.prepareStatement(sql);
               
                statement.setString(1, Name);
                statement.setString(2, Location);
                statement.setString(3, country);
                statement.setString(4, Vaccine);
                statement.setString(5, Address);
                statement.setString(6,Id);
                statement.execute();
               connection.close();
                   }

        return true;
        
    } 
  public Vector<EnterPrises> GetEnterPrises()throws SQLException,ClassNotFoundException{
       Vector<EnterPrises> enterPrises =new Vector<EnterPrises>();
       enterPrises.clear();
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "SELECT * FROM organizations";
                Statement  statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sql);
                
                while(result.next()) { 
                 //(String id,String Name,String Location,String Address)
                    enterPrises.add(new EnterPrises(result.getString("id"),result.getString("name"),result.getString("Location"),result.getString("country"),result.getString("Vaccine"),result.getString("Address"))); 
                }
                connection.close();
                }  

        return enterPrises;
     
 }
   
   
 //Documentation
 /*
 -read->SELECT * FROM users->>>>;
 -update->UPDATE table_name SET column1 = value1, column2 = value2 WHERE condition;>>>
 -create>>
 */
    public Vector<String>GetDocumentation()throws SQLException,ClassNotFoundException{
       Vector<String> documentation =new Vector<String>();
       documentation.clear();
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "SELECT * FROM documentation";
                Statement  statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sql);
                
                while(result.next()) { 
                 //String id,String Text,String EntId)
                    documentation.add(result.getString("Details")); 
                }
                connection.close();
                }  

        return documentation;
     
 }
 
   public Boolean UpdateDocumentation(String id,String Text) throws SQLException,ClassNotFoundException {
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "UPDATE  `documentation` SET `Details`=? WHERE id=?);";
                PreparedStatement statement = connection.prepareStatement(sql);
                 

                statement.setString(1, Text);
                 statement.setString(2, id);

                statement.execute();
               connection.close();
                   }

        return true;
        
    }
     public Boolean CreateDocumentation(String EntId,String Text) throws SQLException,ClassNotFoundException {
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "INSERT INTO `documentation` (`id`,`Details`, `EntId`) VALUES (NULL,?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                 

                statement.setString(1, Text);
                 statement.setString(2, EntId);

                statement.execute();
               connection.close();
                   }

        return true;
        
    }
    public String[] GetOrganizationList() throws SQLException,ClassNotFoundException {
        String data[]={}; 
         try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "SELECT * FROM organizations";
                Statement  statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sql);
                int i=0;
                while(result.next()) { 
                //data[i]=result.getString("name");
                 i++;
                }
                connection.close();
                   }
         return data;
    }
    //Schedure
      public Boolean Createschedule(String Date,String Vaccine,String OrgId,String time) throws SQLException,ClassNotFoundException {
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "INSERT INTO `schedule` ( `Date`, `Vaccine`, `OrgId`,`Time`) VALUES ( ?, ?, ?,?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                 

                statement.setString(1, Date);
                 statement.setString(2, Vaccine);
                 statement.setString(3, OrgId);
                 statement.setString(4, time);
      
                statement.execute();
               connection.close();
                   }

        return true;
        
    }
public boolean DeriverPackage() throws SQLException,ClassNotFoundException {
    //Vector<Derivery> GetPackage()
    Vector<Derivery> data=new Vector<Derivery>();
    
    data=this.GetPackage();
    for(int i=0;i<data.size();i++){
        //INSERT INTO `inventrory` ( `name`, `EnterpriceId`, `Cost`, `Amount`) VALUES (?, ?, ?, ?)
        try (Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "INSERT INTO `inventrory` (id, `name`, `EnterpriceId`, `Cost`, `Amount`) VALUES (Null,?, ?, ?, ?);";
                PreparedStatement statement = connection.prepareStatement(sql);   
                statement.setString(1, data.get(i).GetName());
                statement.setString(2, data.get(i).Getid());
                statement.setString(3, data.get(i).GetCost());
                statement.setString(4, data.get(i).GetAmount());
                statement.execute();
               connection.close();
    }
    this.DeletePackage(data.get(i).Getid());
    
}  
return true;
}

///read schedule
public Vector<schedule> Getschedule() throws SQLException,ClassNotFoundException {
   Vector<schedule> schedules =new Vector<schedule>();
       schedules.clear();
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "SELECT * FROM schedule";
                Statement  statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sql);
                
                while(result.next()) { 
                  
                    schedules.add(new schedule( result.getString("id"), result.getString("Date"), result.getString("Vaccine"), result.getString("Time"))); 
                }
                connection.close();
                }  

        return schedules; 
}

//read the packages

public Vector<JabDetails> GetJab() throws SQLException,ClassNotFoundException {
   Vector<JabDetails> jab =new Vector<JabDetails>();
       jab.clear();
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "SELECT * FROM jabrequest";
                Statement  statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sql);
                while(result.next()) { 
                   jab.add(new JabDetails(result.getString("id"), result.getString("NationalId"), result.getString("lname"), result.getString("Date"),result.getString("Time"))); 
                }
                connection.close();
                }  

        return jab; 
}

public Vector<JabDetails> GetInventory() throws SQLException,ClassNotFoundException {
   Vector<JabDetails> jab =new Vector<JabDetails>();
       jab.clear();
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "SELECT * FROM inventrory";
                Statement  statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sql);
                while(result.next()) { 
                    //JabDetails(String location,String amount,String Cost,String Hosiptal,String jabname){
                   jab.add(new JabDetails(result.getString("id"), result.getString("Amount"), result.getString("Cost"), result.getString("Amount"),result.getString("name"))); 
                }
                connection.close();
                }  

        return jab; 
}
public Vector<JabDetails> GetReuestJab() throws SQLException,ClassNotFoundException {
   Vector<JabDetails> jab =new Vector<JabDetails>();
       jab.clear();
            try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "SELECT * FROM jabrequest";
                Statement  statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sql);
                while(result.next()) { 
                    jab.add(new JabDetails(result.getString("id"), result.getString("NationalId"), result.getString("lname"), result.getString("Date"),result.getString("lname"))); 
                }
                connection.close();
                }  

        return jab; 
}
public boolean CreateRequestJab(String Id,String name,String Date) throws SQLException,ClassNotFoundException {
     try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "INSERT INTO `jabrequest` (`NationalId`, `lname`, `Date`,Time) VALUES (?,?, ?,current_timestamp());";
                PreparedStatement statement = connection.prepareStatement(sql);
                 

                statement.setString(1, Id);
                 statement.setString(2, name);
                statement.setString(3, Date);
                statement.execute();
               connection.close();
                   }

        return true;
        
}
public boolean UpdateUsers(String id,String firstname,String lastname,String username,String gender,int roles,String password) throws SQLException,ClassNotFoundException {
     try ( 
                Connection connection = DriverManager.getConnection(this.jdbcURL, this.dbUser, this.dbPassword)) {
                String sql = "UPDATE `users` SET  `Fname` = ?, `Lname` = ?, `username` =?, `password` = ?, `Gender` = ?, `role` = ? WHERE `users`.`Nationalid` = ?;";
                PreparedStatement statement = connection.prepareStatement(sql);
                 

                
                 statement.setString(1, firstname);
                statement.setString(2, lastname);
                 statement.setString(3, username);
                 statement.setString(4, password);
                statement.setString(5, gender);
                
                statement.setInt(6, roles);
                statement.setString(7, id);
                statement.execute();
               connection.close();
                   }

        return true;
        
}
}




