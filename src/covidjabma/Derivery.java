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
public class Derivery {
    Derivery(){
        
    }
    Derivery(String id,String Derivery,String EntId,String Name,String Cost,String Amount){
        this.id=id;
        this.Derivery=Derivery;
        this.EntId=EntId;
        this.Name=Name;
        this.Cost=Cost;
        this.Amount=Amount;
    }
    
    private String id;
    private String Derivery;
    private String EntId;
    private String Name;
    private String Cost;
    private String Amount;
    
     public void Setid(String id){
       this.id=id;
   }
      public void SetCost(String Cost){
       this.Cost=Cost;
   }
   public void SetName(String Name){
       this.Name=Name;
   }
       public void SetAmount(String Amount){
       this.Amount=Amount;
   }
   public void SetDerivery(String Derivery){
       this.Derivery=Derivery;
   }
    public void SetEntId(String EntId){
       this.EntId=EntId;
   }
   public String Getid(){
          return this.id;
       } 
    public String GetDerivery(){
          return this.Derivery;
       } 
     public String GetName(){
          return this.Name;
       }
      public String GetCost(){
          return this.Cost;
       } 
       public String GetAmount(){
          return this.Amount;
       } 
}
