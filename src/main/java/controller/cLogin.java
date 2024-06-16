
package controller;
import model.mLogin;

/**
 *
 * @author TAQI TALENTA
 */
public class cLogin {
    mLogin data = new mLogin();
    
    
    public cLogin() {
        data.setUser("user");
        data.setPassword("benar");
    }
    
    public boolean cekLogin (String user, String password) {
        if (data.getUser().equals(user)&&data.getPassword().equals(password))
            return true;
        else
            return false;
    }
    
}
