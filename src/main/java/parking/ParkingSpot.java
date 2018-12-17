package parking;

import java.time.LocalTime;

public class ParkingSpot {
    private Vehicle vehicle;
    private LocalTime rented;
    private LocalTime expiredTime;

    public  Vehicle getVehicle() {
        return vehicle;
    }

    public  void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public  void setRented(LocalTime rented) {
        this.rented = rented;
    }

    public  void setExpiredTime(LocalTime expiredTime) {
        this.expiredTime = expiredTime;
    }

    public  LocalTime getExpiredTime() {
        return expiredTime;
    }
}
