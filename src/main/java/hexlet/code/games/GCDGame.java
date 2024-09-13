package hexlet.code.games;

import hexlet.code.Game;
import java.util.Random;

public class GCDGame implements Game {
    private final Random random = new Random();
    private int number1;
    private int number2;

    @Override
    public String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String generateQuestion() {
        number1 = random.nextInt(100) + 1;
        number2 = random.nextInt(100) + 1;
        return String.format("%d %d", number1, number2);
    }

    @Override
    public String getCorrectAnswer() {
        return String.valueOf(gcd(number1, number2));
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
