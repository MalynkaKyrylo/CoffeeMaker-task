package app.drinks;

public class Espresso implements Drink{
    @Override
    public void makeDrink() {
        System.out.println("Espresso is preparing... \n Your Espresso is ready. Enjoy :)");
    }
}
