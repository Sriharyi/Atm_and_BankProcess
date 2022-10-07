package newatm;

import java.util.HashMap;
import java.util.Scanner;

public class Admin {
    private double Atmamount=0;
    Customer  customer = new Customer();
    public double getAtmamount() {
        return Atmamount;
    }
    public void setAtmamount(double atmamount) {
        Atmamount = atmamount;
    }
    Scanner admininput = new Scanner(System.in);
    HashMap<String, Integer> admin = new HashMap<String, Integer>();
    public Admin()
    {
        admin.put("admin", 1234);
    }
    public void getAdminLogin()
    {
        System.out.println("Enter Admin Name: ");
        String name = admininput.next();
        System.out.println("Enter Admin Pin: ");
        int pin = admininput.nextInt();
        if (admin.containsKey(name) && admin.containsValue(pin))
        {
            System.out.println("Welcome Admin");
            adminmenu();
        }else
        {
            System.out.println("Invalid Admin Name or Pin");
        }
    }
    public void adminmenu()
    {
        System.out.println("1. Deposit money");
        System.out.println("2. Display Amount in ATM");
        System.out.println("3. View Customer");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        int choice = admininput.nextInt();
        switch (choice) {
            case 1:
                 getdepositInAtm();
                 adminmenu();
                break;
            case 2:
                System.out.printf("Amount in ATM: $ %.2f \n", getAtmamount());
                adminmenu();
                break;
            case 3:
                System.out.println("Acc no            Name            Pin          Balance");
                for(int i=0; i<customer.data.size(); i++)
                {
                    
                    System.out.println(customer.data.get(i).getAccountnumber()+"\t\t\t"+customer.data.get(i).getAccountHolder()+"\t\t\t"+customer.data.get(i).getAccountPin()+"\t\t\t"+customer.data.get(i).getAccountbalance());
                }
                adminmenu();
                break;
            case 4:
                System.out.println("Thank you for using this ATM, bye.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    private void getdepositInAtm() {
        System.out.println("Enter amount to deposit in ATM: ");
        double amount = admininput.nextDouble();
        setAtmamount(amount);
        System.out.println("Amount deposited in ATM: "+getAtmamount());
    }
}
