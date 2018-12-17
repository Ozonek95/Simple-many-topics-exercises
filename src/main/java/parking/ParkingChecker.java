package parking;

import java.time.LocalTime;

public class ParkingChecker implements Runnable {

    private Parking parking;

    @Override
    public void run() {
        while (true) {
           synchronized (ParkingSpot.class) {
                try {
                    System.out.println("working");
                    Thread.sleep(10000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (ParkingSpot p : parking.getParkingSpots()) {

                    if (p.getVehicle() != null) {
                        // if (p.getExpiredTime() != null) {
                        LocalTime time = p.getExpiredTime();
                        LocalTime now = LocalTime.now();
                        if (now.isAfter(time)) {
                            System.out.println("Time Expired! on spot " + p + " Vehicle " + p.getVehicle());
                            p.setVehicle(null);
                        }


                    }
                }

            }
       }


   }


    public ParkingChecker(Parking parking) {
        this.parking = parking;
    }
}
