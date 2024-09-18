package hexlet.code.games;

import hexlet.code.Game;
import java.util.Random;

public class PrimeGame implements Game {
    private final Random random = new Random();
    private int number;

    @Override
    public String getDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String generateQuestion() {
        number = random.nextInt(100) + 1; // Генерация случайного числа от 1 до 100
        return String.valueOf(number);
    }

    @Override
    public String getCorrectAnswer() {
        return isPrime(number) ? "yes" : "no";
    }

    private boolean isPrime(int number) {
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
}
