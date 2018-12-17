package hotel;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int number;

    private List<Room> roomsOnFloor = new ArrayList<>();

    public Floor(int number, int roomsOnFloorNumber) {
        this.number = number;
        for (int i = 0; i < roomsOnFloorNumber; i++) {
            roomsOnFloor.add(new Room(i+1));
        }
    }

    public int getNumber() {
        return number;
    }

    public List<Room> getRoomsOnFloor() {
        return roomsOnFloor;
    }
}
