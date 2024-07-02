package Service;


import Entity.Account;

public class DepositThread extends AccountService{

    public DepositThread(Account account, double amount) {
        super(account, amount);
    }

    @Override
    public void run() {
        account.setBalance(account.getBalance() + amount);
    }
}
