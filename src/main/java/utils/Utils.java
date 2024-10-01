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
}
