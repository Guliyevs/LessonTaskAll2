package general_task_for_oop.task4;

class CheckingAccount extends BankAccount {

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        super.setBalance(super.getBalance() + amount);
    }

    @Override
    void withdraw(double amount) {
        if (amount > super.getBalance()) {
            System.out.println("CheckingAccount: Insufficient balance");
        } else {
            super.setBalance(super.getBalance() - amount);
        }
    }
}
