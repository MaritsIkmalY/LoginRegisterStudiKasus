package Controller;

import Model.*;

public class RegisterController {
    public User user;

    public void generateUser(String name, String username, String password, String phone, String address,
            DbController dbController) {
        user = new User(name, username, password, phone, address);
        this.storeUser(user, dbController.dbUser);
    }

    public void storeUser(User user, DbUser db) {
        db.DataUser.add(user);
    }
}
