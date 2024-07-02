package Service;

import Entity.Account;

public class WithdrawThread extends AccountService{

    public WithdrawThread(Account account, double amount) {
        super(account, amount);
    }

    @Override
    public void run() {
        account.setBalance(account.getBalance() - amount);
    }
}
