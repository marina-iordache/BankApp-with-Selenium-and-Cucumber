public class BankAccount {
    /*
    This will be an object with 3 attributes also used to construct the object:
    - owner
    - account number
    - balance

    Moreover, the object should perform 4 actions (methods/functions):
    - withdraw money
    - deposit money
    - get the balance
    - get the account number
     */
    String owner;
    long accountNo;
    double balance;

    public BankAccount(String ownerParam, long accountNoParam, double balanceParam){
        owner = ownerParam;
        accountNo = accountNoParam;
        balance = balanceParam;
    }
    public void withdraw(double amount){
        //balance = balance - amount;
        balance -= amount;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public long getAccountNo(){
        return accountNo;
    }
    public double getBalance(){
        return balance;
    }

}
