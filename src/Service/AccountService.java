package Service;

import Entity.Account;

public abstract class AccountService {
    private Account account;
    private double amount;

    public AccountService(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    public double getAmount() {
        return amount;
    }

    public abstract Account transaction();

    @Override
    public String toString(){
        return account.toString();
    }
}
