/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidjabma;

public class EnterPrises {
    EnterPrises(){    
    }
     EnterPrises(String Name){
          this.Name=Name;
    }
    EnterPrises(String id,String Name, String Location,String  country,String Vaccine,String Address){
 
   this.id=id;
   this.Name=Name;
   this.Location=Location;
   this.country=country;
   this.Vaccine=Vaccine;
   this.Address=Address;
    }
    
   private String id;
   private String Name;
   private String Location;
   private String  country;
   private String Vaccine;
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
       public void Setcountry(String country){
         this.country=country;
   }
       public void SetVaccine(String Vaccine){
         this.Vaccine=Vaccine;
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
        public String Getcountry(){
          return this.country;
       }
        public String GetVaccine(){
          return this.Vaccine;
       }
         public String GetAddress(){
          return this.Address;
       }
}
