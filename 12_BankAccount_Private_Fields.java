// 12. Design a 'BankAccount' class with private fields and public methods for deposit/withdraw.

class BankAccount {
    private double balance = 1000; // Private field

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}
