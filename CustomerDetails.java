package newatm;


public class CustomerDetails {
   private int Accountnumber;
   private String AccountHolder;
   private int AccountPin;
   private int Accountbalance;
public int getAccountnumber() {
    return Accountnumber;
}
public void setAccountnumber(int accountnumber) {
    Accountnumber = accountnumber;
}
public String getAccountHolder() {
    return AccountHolder;
}
public void setAccountHolder(String accountHolder) {
    AccountHolder = accountHolder;
}
public int getAccountPin() {
    return AccountPin;
}
public void setAccountPin(int accountPin) {
    AccountPin = accountPin;
}
public int getAccountbalance() {
    return Accountbalance;
}
public void setAccountbalance(int accountbalance) {
    Accountbalance = accountbalance;
}
public CustomerDetails(int accountnumber, String accountHolder, int accountPin, int accountbalance) {
    Accountnumber = accountnumber;
    AccountHolder = accountHolder;
    AccountPin = accountPin;
    Accountbalance = accountbalance;
}
@Override
public String toString() {
    return "CustomerDetails [Accountnumber=" + Accountnumber + ", AccountHolder=" + AccountHolder + ", AccountPin="
            + AccountPin + ", Accountbalance=" + Accountbalance + "]";
}
   
}
