package parking;

public class Bus extends Vehicle {

    public Bus(String name) {
        super(name);
    }

    @Override
    public int parkingCost() {
        return 10;
    }


}
