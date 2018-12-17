package hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(5,9);



        hotel.rentRoom(25,new Person("Kasia",10));
        try {
            hotel.timeToLeveRoom("Kasia");
            Thread.sleep(5000);
            hotel.timeToLeveRoom("Kasia");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
