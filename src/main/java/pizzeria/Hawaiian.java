package pizzeria;

import java.util.List;

public class Hawaiian implements Pizza,Ingredients {

    private List<String> properties;
    private PizzaDough pizzaDough;

    public Hawaiian(List<String> properties, PizzaDough pizzaDough) {
        this.properties = properties;
        this.pizzaDough = pizzaDough;
    }

    public Hawaiian(List<String> properties) {
        this.properties = properties;
    }

    public Hawaiian(){

    }
    @Override
    public void preparePizza() {

        pizzaDough.preparePizzaDough();
        System.out.println("Doing Hawaiian");
        for (String s:properties) {
            System.out.print(" "+s);
        }
    }

    @Override
    public List<String> getIngredients() {
        return properties;
    }
}
