package Service;

import Entity.Account;

public class GetBalanceThread extends AccountService{

    public GetBalanceThread(Account acc, double amount) {
        super(acc, amount);
    }

    @Override
    public void run() {
        System.out.println("Account: ID = "+ account.getId() + " Balance = " + account.getBalance());
    }
}
