package Service;

import Entity.Account;

public abstract class AccountService {
    protected Account account;
    protected double amount;

    public AccountService(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }
    public abstract Account transaction(double amount);

    @Override
    public String toString(){
        return account.toString();
    }
}
