package booking.entity;

public class Hotel {
    private String hotelName;
    private Room[] rooms;

    public Hotel(String hotelName, Room[] rooms) {
        this.hotelName = hotelName;
        this.rooms = rooms;
    }

    public String getHotelName() {
        return hotelName;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
