package pizzeria;

import java.util.List;

public class Margherita implements Pizza,Ingredients{
    private List<String> properties;
    private PizzaDough pizzaDough;

    public Margherita(List<String> properties, PizzaDough pizzaDough) {
        this.properties = properties;
        this.pizzaDough = pizzaDough;
    }

    public Margherita(List<String> properties) {
        this.properties = properties;
    }

    public Margherita(){

    }

    @Override
    public void preparePizza() {
        pizzaDough.preparePizzaDough();
        System.out.println("Doing margaritta with");
        for (String s:properties) {
            System.out.print(" "+s);
        }
    }

    @Override
    public List<String> getIngredients() {
        return properties;
    }
}
