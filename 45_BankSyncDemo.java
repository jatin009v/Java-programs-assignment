class Account {
    int balance = 1000;
    synchronized void withdraw(int amt) {
        if(balance >= amt) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt + " | Bal: " + balance);
        }
    }
}
public class BankSyncDemo {
    public static void main(String[] args) {
        Account acc = new Account();
        new Thread(() -> acc.withdraw(700)).start();
        new Thread(() -> acc.withdraw(700)).start();
    }
}
