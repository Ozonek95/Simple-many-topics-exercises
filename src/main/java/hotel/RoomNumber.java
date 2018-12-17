package hotel;

public class RoomNumber {
    private  Floor floor;
    private  Room room;

    private int roomNumber;
    private Person person;

    public RoomNumber(Floor floor, Room room) {
        this.floor = floor;
        this.room = room;
        String roomNumber = String.valueOf(floor.getNumber())+String.valueOf(room.getNumber());
        this.roomNumber = Integer.parseInt(roomNumber);
    }

    public Floor getFloor() {
        return floor;
    }

    public Room getRoom() {
        return room;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}
