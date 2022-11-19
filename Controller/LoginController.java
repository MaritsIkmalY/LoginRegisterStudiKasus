package Controller;

import java.util.Objects;

import Model.*;

public class LoginController {
    public User user;

    public boolean checkUser(String username, String password, DbUser db) {
        for (User user : db.DataUser) {
            if (Objects.equals(user.username, username) && Objects.equals(user.password, password)) {
                this.setUser(user);
                return true;
            }
        }
        return false;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
