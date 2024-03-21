import java.util.ArrayList;
import java.util.Scanner;

public class App {


    public static void main(String[] args){

        BankAccount account1 = new BankAccount("Tudor", 111111111,2000.0);
        BankAccount account2 = new BankAccount("Mihai", 222222222, 5734.2);
        BankAccount account3 = new BankAccount("Andreea", 333333333, 1231.1);
        BankAccount account4 = new BankAccount("Radu", 444444444, 471.3);
        BankAccount account5 = new BankAccount("Mihaela", 555555555, 2111.9);

        ArrayList<BankAccount> bankDatabase = new ArrayList<>();
        bankDatabase.add(account1);
        bankDatabase.add(account2);
        bankDatabase.add(account3);
        bankDatabase.add(account4);
        bankDatabase.add(account5);

        System.out.println("Welcome to the Bank App!");
        System.out.print("Please enter your account number: ");

        Scanner s = new Scanner(System.in);
        long accountNo = s.nextLong();

        BankAccount userAccount = null;

        for (int i = 0; i < bankDatabase.size(); i++){
            if (bankDatabase.get(i).getAccountNo() == accountNo){
                userAccount = bankDatabase.get(i);
            }
        }

        if (userAccount == null){
            System.out.println("Error! Account number not found in database.");
            System.out.println("Exiting...");
        }
        else {
            while(true){
                System.out.print("Please enter an operation (balance/withdraw/deposit/exit): ");
                String operation = s.next();

                if(operation.equals("balance")){
                    System.out.println("Your current balance is: " + userAccount.getBalance());
                }
                else if(operation.equals("withdraw")){
                    System.out.print("Please enter an amount: ");
                    double amount = s.nextDouble();
                    userAccount.withdraw(amount);
                }
                else if(operation.equals("deposit")){
                    System.out.print("Please enter an amount: ");
                    double amount = s.nextDouble();
                    userAccount.deposit(amount);
                }
                else if(operation.equals("exit")){
                    System.out.println("Exiting...");
                    break;
                }
                else {
                    System.out.println("Invalid operation.");
                }

            }
        }
    }

}



















