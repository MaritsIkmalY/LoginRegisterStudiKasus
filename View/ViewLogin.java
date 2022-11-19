package View;

import Controller.*;

public class ViewLogin extends View {
    public LoginController loginController;

    public ViewLogin() {
        dbController = new DbController();
        loginController = new LoginController();
    }

    public void inputData() {
        String username;
        String password;
        boolean accountIsExist;

        System.out.print("Masukkan Username : ");
        username = input.nextLine();
        System.out.print("Masukkan Password : ");
        password = input.nextLine();
        accountIsExist = loginController.checkUser(username, password, dbController.dbUser);
        if (accountIsExist) {
            new ViewMain(loginController.user);
        } else {
            System.out.println("Your Acconunt Doesn't Exist");
        }

    }

    public void alreadyRegistered() {
        char jawaban;

        System.out.print("Apakah kamu sudah memiliki akun ? (y/t) : ");
        jawaban = input.next().charAt(0);
        input.nextLine();

        switch (jawaban) {
            case 'y' -> this.inputData();
            case 't' -> {
                new ViewRegister(dbController);
                this.inputData();
            }
            default -> System.out.println("Input error");
        }

    }
}
