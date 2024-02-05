// BankAccount class
class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    // Get balance method
    public double getBalance() {
        return balance;
    }
}

// SavingsAccount class (subclass of BankAccount)
class SavingsAccount extends BankAccount {
    // Constructor
    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    // Override withdraw method to prevent withdrawals below one hundred
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed. Insufficient balance or below minimum limit.");
        }
    }
}

// Main class
public class BankAccountDemo {
    public static void main(String[] args) {
        // Create a BankAccount
        BankAccount account1 = new BankAccount("123456", 500);
        System.out.println("Initial Balance: $" + account1.getBalance());

        // Deposit and withdraw from BankAccount
        account1.deposit(200);
        account1.withdraw(100);
        System.out.println("Current Balance: $" + account1.getBalance());

        System.out.println("-------------------------");

        // Create a SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("789012", 150);
        System.out.println("Initial Savings Account Balance: $" + savingsAccount.getBalance());

        // Deposit and withdraw from SavingsAccount
        savingsAccount.deposit(50);
        savingsAccount.withdraw(60);  // Withdrawal below one hundred should not be allowed
        System.out.println("Current Savings Account Balance: $" + savingsAccount.getBalance());
    }
}
