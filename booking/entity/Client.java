package booking.entity;

public class Client {
    private String name;
    private String surname;
    private String email;
    private String phone;
    private Bill bill;

    public Client(String name, String surname, String email, String phone, Bill bill) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.bill = bill;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Bill getBill() {
        return bill;
    }
}
