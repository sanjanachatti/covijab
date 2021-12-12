/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidjabma;


public class Documentation {
    Documentation(){
        
    }
    Documentation(String id,String Text,String EntId){
        this.id=id;
         this.Text =Text;
          this.EntId=EntId;
       
    }
     private String id;
     private String Text;
     private String EntId;
   public void Setid(String id){
       this.id=id;
   }
    public void SetText(String Text){
       this.Text=Text;
   }
   public void SetEntId(String EntId){
       this.EntId=EntId;
   }
   public String Getid(){
          return this.id;
   }
   public String GetText(){
          return this.Text;
       }
  public String GetEntId(){
          return this.EntId;
       }
        
}
