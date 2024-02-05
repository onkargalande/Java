class BankAccount {
    private double balance;

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid amount for deposit");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid amount for withdrawal");
        }
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }
}

public class EncapsulationExample3 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(1000);
        myAccount.withdraw(500);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
