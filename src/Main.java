import Entity.Account;
import Service.DepositThread;
import Service.GetBalanceThread;
import Service.WithdrawThread;

import java.io.IOError;


public class Main {
    public static void main(String[] args) {

        Account account = new Account(1, 100);
        double amount = 15;

        WithdrawThread withdrawThread = new WithdrawThread(account, amount);
        amount = 5;
        DepositThread depositThread = new DepositThread(account, amount);
        GetBalanceThread getBalanceThread = new GetBalanceThread(account, amount);

        Thread t1 = new Thread(withdrawThread);
        Thread t2 = new Thread(depositThread);
        Thread t3 = new Thread(getBalanceThread);

        System.out.println(t1.getState());
        System.out.println(t2.getState());

        t1.start();
        t2.start();
        t3.start();
//        System.out.println(t1.getState());
//        System.out.println(t2.getState());
        try {
            t1.join();
            t2.join();
        } catch (IOError | InterruptedException e) {
            System.out.println(e.getMessage());
        }
//        System.out.println(t1.getState());
//        System.out.println(t2.getState());
    }
}