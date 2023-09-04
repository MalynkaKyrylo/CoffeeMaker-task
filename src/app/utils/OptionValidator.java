package app.utils;

import java.util.Scanner;

public class OptionValidator {
    public static int validateOptionInput(Scanner scanner) {

        int[] options = {0, 1, 2, 3};

        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("There is no such option! Try again: ");
        }

        int inputData = scanner.nextInt();

        while (!contains(options, inputData)) {
            System.out.println("There is no such option! Try again: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - not a number!%nTry again: ");
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
