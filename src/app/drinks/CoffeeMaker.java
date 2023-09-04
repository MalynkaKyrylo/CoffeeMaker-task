package app.drinks;

public class CoffeeMaker {
    private Drink drink;

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public void startMakingDrink() {
        drink.makeDrink();
    }
}
