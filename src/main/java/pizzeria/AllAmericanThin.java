package pizzeria;

public class AllAmericanThin implements PizzaDough {
    @Override
    public void preparePizzaDough() {
        System.out.println("Prepering "+this.getClass().getName()+" cake");
    }
}
