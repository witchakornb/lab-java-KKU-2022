// 653380024-8 วิชชากร บุญประคม sec 2
public class Account {
    private int accountID;
    private String accountName;
    private double balanceAmount;

    public Account(){
        this.accountID = 0;
        this.accountName = "";
        this.balanceAmount = 0.0;
    }
    public Account(int accountID,String accountName,double balanceAmount){
        open(accountID,accountName,balanceAmount);
    }
    public int getAccountID(){
        return this.accountID;
    }
    public String getAccountName(){
        return this.accountName;
    }
    public double getBalanceAmount(){
        return this.balanceAmount;
    }
    public void setAccountID(int accountID){
        this.accountID = accountID;
    }
    public void setAccountName(String accountName){
        this.accountName = accountName;
    }
    public void setBalanceAmount(double balanceAmount){
        this.balanceAmount = balanceAmount;
    }
    public void open(int accountID,String accountName,double balanceAmount){
        this.accountID = accountID;
        this.accountName = accountName;
        this.balanceAmount = balanceAmount;
    }
    public void deposit(double amount){
        if (amount < 0){
            System.out.println("The input amount must be a positive number.");
        }else {
        this.balanceAmount += amount;
        }
    }
    public double withdraw(double amount){
        if (amount > this.balanceAmount){
            System.out.printf("Cannot withdraw because your input number is invalid or balance amount is less than %.1f, please try again.",amount);
        }else {
            this.balanceAmount -= amount;
        }
            return this.balanceAmount;
    }
}