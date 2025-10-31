// \17.OOPs\Encapsulation.java

//Encapsulation - wrapping up of data and methods under a single unit.

class BankAccount {
    // Encapsulated (hidden) data
    private double balance;

    //Public methods to deposite money
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }

    //Public methods to withdraw money
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
    }

    //Public method to get balance
    public double getBalance(){
        return balance;
    }
}

// Usage
public class Encapsulation {
    public static void main(String args[]){
        BankAccount account = new BankAccount();

        account.deposit(5000);
        account.withdraw(2000);

        System.out.println("Current Balance: " + account.getBalance());
    }
}