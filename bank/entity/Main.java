package bank.entity;

import bank.service.DepositService;
import bank.service.PaymentService;
import bank.service.TransferService;

public class Main {
    public  static void main(String[] args) {
        Person pers1 = new Person("89053938822",
                "Ivanova", "Maria" );
        Bill pers1Bill = new Bill(40);
        Account pers1Acc = new Account(pers1, pers1Bill);

        Person pers2 = new Person("89023938345",
                "Lom", "Andre" );
        Bill pers2Bill = new Bill(110);
        Account pers2Acc = new Account(pers2, pers2Bill);
//        pers2Bill.setAmount(1000);

//       PaymentService paymentService = new PaymentService();
//       paymentService.pay(10, pers2Acc);
//        paymentService.pay(10, pers1Acc);
//
//        DepositService depositService = new DepositService();
//        depositService.deposit(140, pers1Acc);

        TransferService transferService = new TransferService();
        transferService.transfer(100, pers1Acc, pers2Acc);


//        System.out.println(pers1Acc.getBill().getAmount());
//        System.out.println(pers2Acc.getBill().getAmount());

    }
}
