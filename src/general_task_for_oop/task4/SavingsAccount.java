package general_task_for_oop.task4;

public class SavingsAccount extends BankAccount {

    private static final double LIMIT = 1000;

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        super.setBalance(super.getBalance() + amount);
    }

    @Override
    void withdraw(double amount) {
        if (amount > LIMIT) {
            System.out.println("SavingsAccount: Withdrawal limit exceeded");
        } else if (amount > super.getBalance()) {
            System.out.println("SavingsAccount: Insufficient balance");
        } else {
            super.setBalance(super.getBalance() - amount);
        }
    }
}
