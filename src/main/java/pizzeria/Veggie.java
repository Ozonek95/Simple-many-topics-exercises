package pizzeria;

import java.util.List;

public class Veggie implements Pizza,Ingredients {
    private List<String> properties;
    private PizzaDough pizzaDough;

    public Veggie(List<String> properties, PizzaDough pizzaDough) {
        this.properties = properties;
        this.pizzaDough = pizzaDough;
    }

    public Veggie(List<String> properties) {
        this.properties = properties;
    }

    public Veggie(){

    }

    @Override
    public void preparePizza() {

        pizzaDough.preparePizzaDough();
        System.out.println("Doing veggie");
        for (String s:properties) {
            System.out.print(" "+s);
        }
    }

    @Override
    public List<String> getIngredients() {
        return  properties;
    }
}
