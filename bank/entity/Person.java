package bank.entity;

public class Person {
    private String name;
    private String surname;
    private String mobile;

    public Person(String mobile, String surname, String name) {
        this.mobile = mobile;
        this.surname = surname;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
