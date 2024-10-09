package hexlet.code.utils;

import java.util.Random;

public class Utils {
    public static int getRandomInt(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min value must be less than or equal to max value");
        }
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static char getRandomOperator() {
        int operatorIndex = getRandomInt(0, 2);
        return switch (operatorIndex) {
            case 0 -> '+';
            case 1 -> '-';
            case 2 -> '*';
            default -> throw new IllegalStateException("Unexpected value: " + operatorIndex);
        };
    }

    public static int calculate(int number1, int number2, char operator) {
        return switch (operator) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }
}
