package booking.service;

import booking.entity.Client;
import booking.entity.Hotel;
import booking.entity.Room;

public class BookingSer {
    public void book(Hotel hotel, Client client,int peopleNumber) {
        Room[] rooms= hotel.getRooms();

        boolean isAvailableRooms = false;

        for(Room r : rooms) {
            if(r.isAvailable()){
                isAvailableRooms = true;
            }
        }
        if(!isAvailableRooms) {
            System.out.println("Room is not available" + "in Hotel"+
                    hotel.getHotelName());

        }
        bookRoom(client, peopleNumber, rooms);

    }

    private static void bookRoom(Client client, int peopleNumber, Room[] rooms) {
        for(Room r : rooms) {
            String clientName = client.getName();
            if(r.getPeopleNumber() == peopleNumber) {
                if(client.getBill().getAmount()>= r.getCost()  ) {
                    client.getBill().setAmount( client.getBill().getAmount()
                            - r.getCost());
                    System.out.println("Bill amount is "+
                            client.getBill().getAmount());
                    r.setAvailable(false);
                    System.out.println("Room has been booked!"+ clientName);
                }else  {
                    System.out.println("Not enough money");
                }
            }
        }
    }
}
