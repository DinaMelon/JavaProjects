package booking;


import booking.entity.Bill;
import booking.entity.Client;
import booking.entity.Hotel;
import booking.entity.Room;
import booking.service.BookingSer;

public class Main {
    public static void main(String[] args) {
        Bill billPerson =  new Bill(10000);
        Client Person =  new Client("Max", "Vava",
                "vax455@gmail.com", "89056327165", billPerson);
        Bill billPerson2 =  new Bill(9000);
        Client Person2 =  new Client("Kira", "Lsae",
                "sdjfnk5655@gmail.com", "89078323465", billPerson2);

        Room[] hotel1Rooms= new Room[]{new Room(2,
                1000, true), new Room(3,
                2000,false)};
        Hotel hotel1 = new Hotel("Ararat", hotel1Rooms);

        Room[] hotel2Rooms= new Room[]{new Room(1,
                1500, false), new Room(4,
                6000,true)};
        Hotel hotel2 = new Hotel("Sochi", hotel2Rooms);

        BookingSer bookingSer = new BookingSer();
        bookingSer.book(hotel1, Person, 2);

        bookingSer.book(hotel1, Person, 1);
        System.out.println("\n");
        bookingSer.book(hotel2, Person2, 2);

        bookingSer.book(hotel2, Person2, 1);


    }

}
