
package covidjabma;

import covidjabma.Ui.Login;
import covidjabma.ConnectDb;
import covidjabma.Controller;
import covidjabma.Ui.Admin;
import java.util.Vector;
import javax.swing.JOptionPane;
import covidjabma.Ui.Organization;
public class CovidJabMA {

    public static void main(String[] args) {
        
        
        ConnectDb dbcon=new ConnectDb();
        Controller controller=new Controller();
        Login login=new Login();
        login.show();
      
      
         
      
    }
    
}
