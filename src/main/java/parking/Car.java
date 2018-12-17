package parking;

public class Car extends Vehicle {


    public Car(String name) {
        super(name);
    }

    @Override
    public int parkingCost() {
        return 10;
    }


}
