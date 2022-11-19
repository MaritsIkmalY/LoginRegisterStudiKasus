package View;

import java.util.Scanner;
import Controller.*;

public abstract class View {
    public DbController dbController;
    public Scanner input = new Scanner(System.in);

    public abstract void inputData();
}
