package newatm;

import java.io.IOException;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) throws IOException {
        Scanner Atminput = new Scanner(System.in);
        System.out.println("Welcome to the ATM");
        do
        {
            System.out.println("Press-1 Admin login");
            System.out.println("press-2 Customer login");
            int select = Atminput.nextInt();
            switch(select)
            {
                case 1:
                    Admin admin = new Admin();
                    admin.getAdminLogin();
                    break;
                case 2:
                    menu menu = new menu();
                    menu.getlogin();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while(true);
    }
}
