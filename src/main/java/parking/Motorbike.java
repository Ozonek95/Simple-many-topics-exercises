package parking;

public class Motorbike extends Vehicle {

    public Motorbike(String name) {
        super(name);

    }

    @Override
    public int parkingCost() {
        return 5;
    }

}
