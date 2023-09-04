package app.utils;

import java.util.Scanner;

public class AppView {
    Scanner scanner;

    public int chooseOption() {

        scanner = new Scanner(System.in);

        System.out.print("""
                --------------------------
                Choose a drink to prepare:
                1 - Espresso
                2 - Cappuccino
                3 - Latte
                0 - Exit
                """);

        return OptionValidator.validateOptionInput(scanner);
    }
}
