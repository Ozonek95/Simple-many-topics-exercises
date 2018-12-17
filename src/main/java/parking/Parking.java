package parking;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Parking {
    private List<ParkingSpot> newList = new ArrayList<>();
    List<ParkingSpot> parkingSpots = Collections.synchronizedList(newList);
    Thread t1;

    private int carsOnParking = 0;
    private int moneyEarned = 0;

    public Parking(int size) {
        t1 = new Thread(new ParkingChecker(this));

        for (int i = 0; i < size; i++) {
            parkingSpots.add(new ParkingSpot());
        }

        t1.start();
    }


    public  void rentSpot(Scanner scanner) {

        synchronized (ParkingSpot.class){
            System.out.println("To park Car: 1");
            System.out.println("To park Bus: 2");
            System.out.println("To park Motorbike: 3");
            Vehicle vehicle = null;
            int choice = Integer.parseInt(scanner.nextLine());
            System.out.println("Give Vehicle name");
            String name = scanner.nextLine();
            switch (choice) {
                case 1:
                    vehicle = new Car(name);
                    break;
                case 2:
                    vehicle = new Bus(name);
                    break;
                case 3:
                    vehicle = new Motorbike(name);
            }

            System.out.println("Give time in seconds U want to park");
            long seconds = scanner.nextLong();

            parkingSpots.get(carsOnParking).setVehicle(vehicle);
            parkingSpots.get(carsOnParking).setRented(LocalTime.now());
            parkingSpots.get(carsOnParking).setExpiredTime(LocalTime.now().plus(Duration.ofSeconds(seconds)));


            carsOnParking++;
            moneyEarned += vehicle.parkingCost();

       }



    }




    public int numberOfFreeSpots() {
        int result = 0;
        for (ParkingSpot p : parkingSpots) {
            if (p.getVehicle() == null) {
                result++;
            }
        }
        return result;
    }

    public int numberOfTakenSpots() {
        int result = 0;
        for (ParkingSpot p : parkingSpots) {
            if (p.getVehicle() != null) {
                result++;
            }
        }
        return result;
    }

    public int getMoneyEarned() {
        return moneyEarned;
    }

    public double howManyMinutesLeft(Scanner scanner) {
        System.out.println("Give car name");
        String name = scanner.nextLine();
        for (ParkingSpot p : parkingSpots) {
            if (p.getVehicle() != null) {
                if (p.getVehicle().getName().equals(name)) {
                    return Duration.between(LocalTime.now(), p.getExpiredTime()).getSeconds();
                }

            }
        }
        return 0;
    }

    public void driveOut() {

    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

//    public void startThread(){
//        t1.start();
//    }

    public int menu(Scanner scanner) {
        System.out.println("To park Vehicle: 1");
        System.out.println("To check number of taken spots :2");
        System.out.println("To check number of free spots: 3");
        System.out.println("To check remaining time: 4");
        System.out.println("To check earned money: 5");
        System.out.println("To exit parking: 6");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                rentSpot(scanner);
                return 1;

            case 2:
                System.out.println(numberOfTakenSpots());
                return 2;

            case 3:
                System.out.println(numberOfFreeSpots());
                return 3;

            case 4:
                System.out.println(howManyMinutesLeft(scanner));
                return 4;


            case 5:
                System.out.println(getMoneyEarned());
                return 5;

            case 6:


        }
        return 6;
    }
}
