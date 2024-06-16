
package model;

public class mLogin {

    private String user;
    private String password;

    public mLogin(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public mLogin() {
        //TODO Auto-generated constructor stub
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

