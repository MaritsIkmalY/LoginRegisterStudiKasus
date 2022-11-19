package Controller;

import Model.*;

public class RegisterController {

    public User generateUser(String name, String username, String password, String phone, String address) {
        return new User(name, username, password, phone, address);
    }

    public void storeUser(User user, DbUser db) {
        db.DataUser.add(user);
    }
}
