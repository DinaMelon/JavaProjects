package bank.entity;

public class Account {
    private Person person;
    private Bill bill;

    public Account(Person person, Bill bill) {
        this.person = person;
        this.bill = bill;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Bill getBill() {
        return bill;
    }

    public Person getPerson() {
        return person;
    }
}
