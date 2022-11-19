package View;

import Controller.*;

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

        registerController.generateUser(name, username, password, phone, address, dbController);
    }

}
