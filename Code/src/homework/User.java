package homework;

import java.util.ArrayList;

public abstract class User {

    private String username;
    private String password;
    private String membership;

    public User(String username, String password, String membership) {
        this.username = username;
        this.password = password;
        this.membership = membership;
    }

    public User() {

    }
    
    public abstract void updateUsersTxt(ArrayList<User> user);

    public abstract void writeUsersTxt(User user);

    public abstract  ArrayList<User> read_txt();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

}
