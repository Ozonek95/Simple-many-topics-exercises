package pizzeria;

public class GlutenFree implements PizzaDough {
    @Override
    public void preparePizzaDough() {
        System.out.println("Prepering "+this.getClass().getName()+" cake");
    }
}
