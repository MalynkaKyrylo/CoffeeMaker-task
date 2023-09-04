package app.utils;

import java.util.Scanner;

public class Validator {
    public static int validateOptionInput(Scanner scanner) {

        int[] options = {0, 1, 2, 3};

        while (!scanner.hasNextInt()) {
            System.out.println("Not a number");
        }
        int inputData = scanner.nextInt();

        while (!contains(options, inputData)) {
            System.out.println("There is no such option! Enter a number option 1,2,3 or 0!");
            while (!scanner.hasNextInt()) {
                System.out.println("Not a number");
            }
            inputData = scanner.nextInt();
        }
        return inputData;
    }

    public static boolean contains(final int[] array, final int value) {
        boolean result = false;
        for (int i : array) {
            if (i == value) {
                result = true;
                break;
            }
        }
        return result;
    }
}
