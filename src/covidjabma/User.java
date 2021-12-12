
package covidjabma;
public class User {
    User(){
        
    }
    User(String NationalId,String Password,String username,String FirstName,String LastName,String Gender,String Residence,String Ages){
        this.NationalId=NationalId;
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Gender=Gender;
        this.Residence=Residence;
        this.Password=Password;
        this.username=username;
        this.role="13";
        this.Age=Ages;
    }
    private String NationalId;
    private String FirstName;
    private String LastName;
    private String username;
    private String Password;
    private String Gender;
    private String Residence;
    private String role;
    private String Age;
    
  public  void setNationalId(String NationalId){
        this.NationalId=NationalId;
    }
   public  void setPassword(String Password){
        this.Password=Password;
    }
   public void setFirstName(String FirstName){
        this.FirstName=FirstName;
    }
   public void setLastName(String LastName){
        this.LastName=LastName;
    }
  public  void setGender(String Gender){
        this.Gender=Gender;
    }
  public  void setResidence(String Residence){
        this.Residence=Residence;
    }
  public    void setAge(String Age){
        this.Age=Age;
    }
   public  void setrole(String role){
        this.role=role;
    }
   public void setusername(String username){
        this.username=username;
    }
   public String getNationalId(){
        return this.NationalId;
    }
   public  String getFirstName(){
        return this.FirstName;
    }
   public   String getLastName(){
        return this.LastName;
    }
   public    String getGender(){
        return this.Gender;
    }
     public   String getResidence(){
        return this.Residence;
    }
     public    String getrole(){
        return this.role;
    }
   public String getPassword(){
        return this.Password;
    }
   public  String getusername(){
        return this.username;
    }
   public  String getAge(){
        return this.Age;
    }
}
