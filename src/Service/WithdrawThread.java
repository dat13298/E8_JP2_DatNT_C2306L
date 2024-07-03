package Service;

import Entity.Account;

public class WithdrawThread extends AccountService implements Runnable{

    public WithdrawThread(Account acc, double amount) {
        super(acc, amount);
    }

    @Override
    public Account transaction(double amount) {
        account.setBalance(account.getBalance() - amount);
        return account;
    }

    @Override
    public void run() {
        transaction(amount);
    }
}
