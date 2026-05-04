package bank.service;

import bank.entity.Account;
import bank.entity.Bill;

public class PaymentService {

    public int pay(int amount, Account account)
    {
        Bill bill = account.getBill();
        if (bill.getAmount() <= 0)
        {
            System.out.println("Amount is negative");
        }
        else {
            int currentsBillAmount = bill.getAmount();
            System.out.println("Current amount: "
                    + bill.getAmount());
            bill.setAmount(currentsBillAmount -  amount);
            System.out.println("Payment successful, current amount: "
                    + bill.getAmount());}



        return amount;
    }


}
