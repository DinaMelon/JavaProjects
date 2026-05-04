package bank.service;

import bank.entity.Account;
import bank.entity.Bill;

public class DepositService {
    public int deposit(int amount, Account account ) {
        Bill bill = account.getBill();
        System.out.println("Current amount: " +
                bill.getAmount());
        bill.setAmount(bill.getAmount() + amount);
        System.out.println("Deposit successful, current amount: " +
                bill.getAmount());
        return bill.getAmount();
    }
}
