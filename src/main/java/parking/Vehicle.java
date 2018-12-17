package parking;

public abstract class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public int parkingCost(){
        return 0;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
