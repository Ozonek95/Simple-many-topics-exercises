package hotel;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hotel {
    List<Floor> floors = new ArrayList<>();
    List<RoomNumber> roomNumbers = new ArrayList<>();

    public Hotel(int numberOfFloors, int numberOfRoomsOnFloor) {
        for (int i = 0; i < numberOfFloors; i++) {
            floors.add(new Floor(i+1,numberOfRoomsOnFloor));
        }

        for (Floor f:floors) {
            for (Room r:f.getRoomsOnFloor()) {
                roomNumbers.add(new RoomNumber(f,r));
            }
        }

    }

    public void rentRoom(int roomNumber, Person person){
        for (RoomNumber r:roomNumbers) {
            if(r.getRoomNumber()==roomNumber){
                if(r.getPerson()==null){
                    r.setPerson(person);
                    person.addRoom(r);
                }
                else System.out.println("Sorry, that room is taken.");
            }
        }
    }

    public void rentAnyFreeRoom(Person person){
        List<RoomNumber> freeRooms = new ArrayList<>();
        for (RoomNumber r:roomNumbers) {
            if(r.getPerson()==null){
                freeRooms.add(r);
            }
        }

       int room = new Random().nextInt(freeRooms.size());
        rentRoom(freeRooms.get(room).getRoomNumber(),person);

        System.out.println("Room number "+freeRooms.get(room).getRoomNumber()+" is rentet");
    }

    public void anyRoomIsFree(){
        boolean noFreeRoom = true;
        for (RoomNumber room:roomNumbers) {
            if(room.getPerson()==null){
                noFreeRoom=false;
                System.out.println("Room "+room.getRoomNumber()+" is free");
            }
        }
        if(noFreeRoom)
        System.out.println("No free rooms");
    }

    public int numberOfFreeRooms(){
        int result = 0;
        for (RoomNumber room:roomNumbers) {
            if(room.getPerson()==null){
                result++;
            }
        }

        return result;
    }

    public void ifClientExist(String name){
        boolean exist = false;
        for (RoomNumber r:roomNumbers) {
            if(r.getPerson()!=null){
                if(r.getPerson().getName().equals(name)){
                    exist=true;
                    System.out.println("Yes, we have that client and he is renting room number "+r.getRoomNumber());
                }
            }
        }
        if(!exist){
            System.out.println("We dont have that client");
        }
    }

    public void clearAllRoomsOfClient(String name){
        for (RoomNumber r:roomNumbers) {
            if(r.getPerson()!=null){
                if(r.getPerson().getName().equals(name)){
                    r.setPerson(null);
                }
            }
        }
    }

    public void timeToLeveRoom(String name){
        for (RoomNumber r:roomNumbers) {
            if(r.getPerson()!=null){
                if(r.getPerson().getName().equals(name)){
                    long secondsToLeve = Duration.between(LocalTime.now(),r.getPerson().getTimeToLeaveRoom()).getSeconds();
                    System.out.println(secondsToLeve);
                }
            }

        }
    }
}
