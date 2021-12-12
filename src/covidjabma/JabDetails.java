/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidjabma;

public class JabDetails {
    private static int id=0;
    JabDetails(){
        
    }
     JabDetails(String location,String amount,String Cost,String Hosiptal,String jabname){
        this.id++;
        this.location=location;
        this.amount=amount;
        this.Cost=Cost;
        this.Hosiptal=Hosiptal;
        this.jabname=jabname;
    }
    private String jabname;
    private String location;
    private String amount;
    private String Cost;
    private String Hosiptal;
     
  public   void setjabname(String jabname){
        this.jabname=jabname;
    }
    public void setlocation(String location){
        this.location=location;
    }
    public void setamount(String amount){
        this.amount=amount;
    }
    public void setCost(String Cost){
        this.Cost=Cost;
    }
    public void setHosiptal(String Hosiptal){
        this.Hosiptal=Hosiptal;
    }
     
     
    public String getjabname(){
        return this.jabname;
    }
    public String getlocation(){
        return this.location;
    }
    public String getamount(){
        return this.amount;
    }
    public String getCost(){
        return this.Cost;
    }
    public String getHosiptal(){
        return this.Hosiptal;
    }
    public int getId(){
         return this.id;
     }
}
