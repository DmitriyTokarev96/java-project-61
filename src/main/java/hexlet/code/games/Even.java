package hexlet.code.games;

import hexlet.code.Game;
import java.util.Random;

public class Even implements Game {
    private final Random random = new Random();
    private String correctAnswer;

    @Override
    public String getDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String generateQuestion() {
        int number = random.nextInt(100) + 1;
        correctAnswer = number % 2 == 0 ? "yes" : "no";

        return String.valueOf(number);
    }

    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
