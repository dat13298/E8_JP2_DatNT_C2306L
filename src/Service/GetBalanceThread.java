package Service;

import Entity.Account;

public class GetBalanceThread extends AccountService{

    public GetBalanceThread(Account account, double amount) {
        super(account, amount);
    }

    @Override
    public void run() {
        System.out.println("Account: ID = "+ account.getId() + " Balance = " + account.getBalance());
    }
}
