package Service;

import Entity.Account;

public abstract class AccountService implements Runnable {
    protected Account account;
    protected double amount;

    public AccountService(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }
}
