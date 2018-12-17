package pizzeria;

import java.util.ArrayList;
import java.util.List;

public class PizzeriaMain {
    public static void main(String[] args) {
        List<String> firstIngredientsList = new ArrayList<>();
        firstIngredientsList.add("Cheese");
        firstIngredientsList.add("Tomato sauce");
        List<String> secondIngredientsList = new ArrayList<>();
        secondIngredientsList.addAll(firstIngredientsList);
        secondIngredientsList.add("ananas");
        List<Pizza> pizzas = new ArrayList<>();
        AllAmericanThin allAmericanThin = new AllAmericanThin();
        GlutenFree glutenFree = new GlutenFree();
        ChessyBites chessyBites = new ChessyBites();
        pizzas.add(new Margherita(firstIngredientsList,glutenFree));
        pizzas.add(new Margherita(firstIngredientsList,chessyBites));
        pizzas.add(new Margherita(firstIngredientsList,allAmericanThin));
        pizzas.add(new Veggie(firstIngredientsList,glutenFree));
        pizzas.add(new Hawaiian(secondIngredientsList,allAmericanThin));

        for (Pizza p:pizzas) {
            p.preparePizza();
        }

    }
}
