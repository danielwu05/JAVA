package PizzaGame;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;



public class Pizza {
    ArrayList<String> order = new ArrayList<>();

    ArrayList<String> pizza = new ArrayList<>();
    Random random = new Random();
    Pizza() {


        pizza.add("Cheese");
        pizza.add("Pepperoni");
        pizza.add("Green Olives");
        pizza.add("Black Olives");
        pizza.add("Chicken");
        pizza.add("Mushrooms");
        pizza.add("Onions");
        pizza.add("Bacon");
        pizza.add("Oregano");
        pizza.add("Peppers");
        pizza.add("Pineapple");
        pizza.add("NULL");





        int rand;



        for (int i = 2; i < 7; i++) {
            rand = random.nextInt(0, pizza.size() - 1);
            if(!(order.contains(pizza.get(rand)))){

                order.add(pizza.get(rand));
            }

        }




    }
    public ArrayList<String> getOrder() {
        return order;
    }
}
