package general_task_for_oop.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount(3000));
        accounts.add(new CheckingAccount(2000));

        for (BankAccount acc : accounts) {
            acc.deposit(500);
            acc.withdraw(1200);

            System.out.println(
                    acc.getClass().getSimpleName() +
                            " balance: " + acc.getBalance()
            );

        }
    }
}
