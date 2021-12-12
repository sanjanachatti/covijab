/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidjabma;

import java.util.Vector;

/**
 *
 * @author Admin
 */
public class schedule {
    schedule(){
       
    }
    schedule(String id,String Date,String JabName,String OrgId){
        this.id=id;
        this.Date=Date;
        this.JabName=JabName;
        this.OrgId=OrgId;
    }
    private String id;
    private String Date;
    private String JabName;
    private String OrgId;
    public void Setid(String id){
       this.id=id;
   }
   public void SetDate(String Date){
       this.Date=Date;
   }
   public void SetJabName(String JabName){
       this.JabName=JabName;
   }
   public void SetOrgId(String OrgId){
       this.OrgId=OrgId;
   }
   public String Getid(){
          return this.id;
   }
   public String GetDate(){
          return this.Date;
       }
   public String GetJabName(){
          return this.JabName;
       }
   public String GetOrgId(){
          return this.OrgId;
       }
}
