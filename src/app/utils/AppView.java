package app.utils;

import java.util.Scanner;

public class AppView {

    public static int chooseOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                --------------------------
                Choose a drink to prepare:
                1 - Espresso
                2 - Cappuccino
                3 - Latte
                0 - Exit
                """);

        return Validator.validateOptionInput(scanner);
    }
}
