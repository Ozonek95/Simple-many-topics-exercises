package pizzeria;

public class ChessyBites implements PizzaDough {
    @Override
    public void preparePizzaDough() {
        System.out.println("Prepering "+this.getClass().getName()+" cake");
    }
}
