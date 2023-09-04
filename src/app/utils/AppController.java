package app.utils;

import app.coffeemaker.CoffeeMaker;
import app.drinks.Espresso;
import app.drinks.Cappuccino;
import app.drinks.Latte;

public class AppController {
    public static void filterChoice(int option) {

        switch (option) {
            case 1 -> {
                CoffeeMaker coffeeMaker = new CoffeeMaker();
                coffeeMaker.setDrink(new Espresso());
                coffeeMaker.startMakingDrink();
            }
            case 2 -> {
                CoffeeMaker coffeeMaker = new CoffeeMaker();
                coffeeMaker.setDrink(new Cappuccino());
                coffeeMaker.startMakingDrink();
            }
            case 3 -> {
                CoffeeMaker coffeeMaker = new CoffeeMaker();
                coffeeMaker.setDrink(new Latte());
                coffeeMaker.startMakingDrink();
            }
            case 0 -> {
                System.out.println("Coffee Maker is off.");
                System.exit(0);
            }
            default -> throw new IllegalStateException("Wrong option: " + option);
        }
    }
}
