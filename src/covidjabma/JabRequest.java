/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidjabma;


public class JabRequest {
    JabRequest(){
        
    }
    JabRequest(String id,String Name,String Date,String Time,String UserId){
        this.id=id;
        this.Name=Name;
        this.Time=Time;
        this.Date=Date;
        this.UserId=UserId;
    }
    private String id;
   private String Name;
   private String Date;
   private String Time;
   private String UserId;
   
    public void Setid(String id){
       this.id=id;
   }
     public void SetName(String Name){
       this.Name=Name;
   }
      public void SetDate(String Date){
       this.Date=Date;
   }
       public void SetTime(String Time){
       this.Time=Time;
   }
        public void SetUserId(String UserId){
       this.UserId=UserId;
   }
   public String Getid(){
          return this.id;
       }
   public String GetName(){
          return this.Name;
       }
   public String GetDate(){
          return this.Date;
       }
   public String GetTime(){
          return this.Time;
       }
   public String GetUserId(){
          return this.UserId;
       }
}
