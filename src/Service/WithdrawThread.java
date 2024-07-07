package Service;

import Entity.Account;

public class WithdrawThread extends AccountService implements Runnable{

    public WithdrawThread(Account acc, double amount) {
        super(acc, amount);
    }

    @Override
    public Account transaction() {
        super.getAccount().setBalance(super.getAccount().getBalance() - super.getAmount());
        return super.getAccount();
    }

    @Override
    public void run() {
        transaction();
    }
}
