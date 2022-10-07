package newatm;

import java.io.IOException;
import java.util.Scanner;

public class menu extends Account{
    Scanner menuinput = new Scanner(System.in);
    Customer customer = new Customer();
    public void getlogin() throws IOException
    {
        int x=1;
        int flag =0;
        do
        {
            try
            {
                System.out.println("Welcome to the Bank");
                System.out.println("Enter your customer number");
                setCustomerNumber(menuinput.nextInt());
                System.out.println("Enter your pin number: ");
                setPinNumber(menuinput.nextInt());
            }
            catch(Exception e)
            {
                System.out.println("Invalid character(s). Only numbers is valid.");
                break;
            }
           for(int i=0; i<customer.data.size(); i++)
           {
               if(customer.data.get(i).getAccountnumber()==getCustomerNumber() && customer.data.get(i).getAccountPin()==getPinNumber())
               {
                   getAccountType();
                   flag=1;
               }
           }
           if(flag==0)
           {
            System.out.println("wrong customer number or pin number");
           }
        }
        while(x==1);
    }
    private void getAccountType() {
        System.out.println("Select the account you want to access: ");
        System.out.println("PRESS 1 - Saving Account");
        System.out.println("PRESS 2 - Exit");
        System.out.println("Choice: ");
        int select = menuinput.nextInt();
        switch (select) {
            case 1:
                getsaving();
                break;
            case 2:
                System.out.println("Thank you for using this ATM, bye.");
                break;
            default:
                System.out.println("Invalid choice");
                getAccountType();
                break;
            }
        }
    private void getsaving() {
        System.out.println("Saving Account:");
        System.out.println("PRESS 1 -View Balance");
        System.out.println("PRESS 2 -Withdraw Funds");
        System.out.println("PRESS 3 -Deposit Funds");
        System.out.println("PRESS 4 -Exit");
        System.out.println("Choice: ");
        int select = menuinput.nextInt();
        switch (select) {
            case 1:
            System.out.println();
            System.out.printf("Saving Account Balance: $ %.2f \n", getSavingBalance());
            System.out.println();
            System.out.println("TO CONTINUE, PRESS 1");
            System.out.println("TO EXIT TO MAIN MENU, PRESS 2");
            int choice1 = menuinput.nextInt();
            if (choice1==1) {
                getsaving();
            }
            else if(choice1==2)
            {
                break;
            }
            break;
            case 2:
                getsavingWithdrawInput();
                System.out.println();
                System.out.println("TO CONTINUE, PRESS 1");
                System.out.println("TO EXIT TO MAIN MENU, PRESS 2");
                int choice2 = menuinput.nextInt();
                if (choice2==1) {
                    getsaving();
                }
                else if(choice2==2)
                {
                    break;
                }
                
                break;
            case 3:
                getsavingDepositInput();
                System.out.println();
                System.out.println("TO CONTINUE, PRESS 1");
                System.out.println("TO EXIT TO MAIN MENU, PRESS 2");
                int choice3 = menuinput.nextInt();
                if (choice3==1) {
                    getsaving();
                }
                else if(choice3==2)
                {
                    break;
                }
                break;
            case 4:
                System.out.println("Thank you for using this ATM, bye........");
                break;
            default:
                    System.out.println("Invalid choice");
                    getsaving();
                break;
        }
    }
    
}
