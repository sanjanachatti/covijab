/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidjabma;

/**
 *
 * @author Admin
 */
public class Organization {
    Organization(){
        
    }
    Organization(String id,String Name,String Location,String Address){
        this.Name=Name;
        this.id=id;
        this.Location=Location;
        this.Address=Address;
    }
    private String id;
   private String Name;
   private String Location;
   private String Address;
   
   
   public void Setid(String id){
       this.id=id;
   }
     public void SetName(String Name){
         this.Name=Name;
   }
      public void SetLocation(String Location){
         this.Location=Location;
   }
   public void SetAddress(String Address){
         this.Address=Address;
   }
      public String Getid(){
          return this.id;
       }
           public String GetName(){
          return this.Name;
       }
        public String GetLocation(){
          return this.Location;
       }
         public String GetAddress(){
          return this.Address;
       }
         
}
