package View;

import Controller.*;
import Model.*;

public class ViewRegister extends View {
    public RegisterController registerController;

    public ViewRegister(DbController dbController) {
        this.dbController = dbController;
        registerController = new RegisterController();
        this.inputData();
    }

    public void inputData() {
        String name;
        String username;
        String password;
        String phone;
        String address;
        User user;

        System.out.print("Masukkan nama : ");
        name = input.nextLine();
        System.out.print("Masukkan username : ");
        username = input.nextLine();
        System.out.print("Masukkan password : ");
        password = input.nextLine();
        System.out.print("Masukkan phone : ");
        phone = input.nextLine();
        System.out.print("Masukkan address : ");
        address = input.nextLine();

        user = registerController.generateUser(name, username, password, phone, address);
        registerController.storeUser(user, dbController.dbUser);
    }

}
