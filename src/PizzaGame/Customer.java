package PizzaGame;

import java.util.ArrayList;


public class Customer {
    public static void main(String[] args) {

        Pizza pizza = new Pizza ();
        ArrayList<String> orderCustomer = new ArrayList<>();

        orderCustomer = pizza.getOrder();

        System.out.println(orderCustomer);
    }
}
