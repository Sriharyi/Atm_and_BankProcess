package newatm;

import java.util.Scanner;

public class Account {
    Scanner accinput = new Scanner(System.in);
    private int customerNumber;
    private int pinNumber;
    private double savingBalance=0;
    public int getCustomerNumber() {
        return customerNumber;
    }
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
    public int getPinNumber() {
        return pinNumber;
    }
    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }
    public double getSavingBalance()
    {
        return savingBalance;
    }
    //to update saving balance after withdraw
    public double calculatesavingwithdraw(double amount) {
        savingBalance = savingBalance-amount;
        return savingBalance;
    }
    //to update saving balance after deposit
    public double calculatesavingdeposit(double amount)
    {
        savingBalance = savingBalance+amount;
        return savingBalance;
    }
    //user request for withdraw
    public void getsavingWithdrawInput()
    {
        System.out.printf("Saving Account Balance: $ %.2f \n", getSavingBalance());
        System.out.println("Amount you want to withdraw from Saving Account: ");
        double amount = accinput.nextDouble();
        if ((savingBalance - amount)>=0){
            calculatesavingwithdraw(amount);
            System.out.printf("withdrawn amount is : $ %.2f \n\n", amount);
            System.out.printf("New Account Balance: $ %.2f \n\n", getSavingBalance());
        }else
        {
            System.out.println("Balance cannot be negative.");
        }
    }
    //user request for deposit
    public void getsavingDepositInput()
    {
        System.out.printf("Saving Account Balance: $ %.2f \n", getSavingBalance());
        System.out.println("Amount you want to withdraw from Saving Account: ");
        double amount = accinput.nextDouble();
        calculatesavingdeposit(amount);
    }
    
}
