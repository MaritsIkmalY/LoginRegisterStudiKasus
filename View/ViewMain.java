package View;

import Model.*;

public class ViewMain {

    ViewMain(User user) {
        this.showData(user);
    }

    public void showData(User user) {
        System.out.println("Nama : " + user.name);
        System.out.println("Phone : " + user.phone);
        System.out.println("Address : " + user.address);
    }
}
