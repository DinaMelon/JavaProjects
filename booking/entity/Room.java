package booking.entity;

public class Room {
    private int peopleNumber;
    private int cost;
    private boolean available;

    public Room(int peopleNumber, int cost, boolean available) {
        this.peopleNumber = peopleNumber;
        this.cost = cost;
        this.available = available;
    }

    public void setPeopleNumber(int peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getPeopleNumber() {
        return peopleNumber;
    }

    public int getCost() {
        return cost;
    }

    public boolean isAvailable() {
        return available;
    }
}
