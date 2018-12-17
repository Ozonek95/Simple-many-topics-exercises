package hotel;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Person {
    List<RoomNumber> rooms = new ArrayList<>();
    private String name;
    int days;
    private LocalTime localTime = LocalTime.now();
    private LocalTime timeToLeaveRoom ;


    public Person(String name,int days) {
        this.days=days;
        this.name = name;
        this.timeToLeaveRoom = localTime.plusSeconds(days);

    }

    public void addRoom(RoomNumber roomNumber){
        rooms.add(roomNumber);
    }

    public void showRooms(){
        System.out.println(rooms);
    }

    public String getName() {
        return name;
    }

    public LocalTime getTimeToLeaveRoom() {
        return timeToLeaveRoom;
    }



}
