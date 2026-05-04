package bank.service;

import bank.entity.Account;
import bank.entity.Bill;

public class TransferService {
    public void transfer(int amount, Account fromAccount , Account toAccount ) {
        Bill billFromAcc = fromAccount.getBill();
        Bill billToAcc = toAccount.getBill();
        if ( billFromAcc.getAmount() > amount) {
            billFromAcc.setAmount(billFromAcc.getAmount() - amount);
            System.out.println("Current from account " + billFromAcc.getAmount());
            billToAcc.setAmount(billToAcc.getAmount() + amount);
            System.out.println("Current to account " + billToAcc.getAmount());
        } else  {
            System.out.println("Insufficient funds");
        }
    }
}
