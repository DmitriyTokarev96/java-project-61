package hexlet.code.games;

import hexlet.code.Game;
import java.util.Random;

public class ProgressionGame implements Game {
    private final Random random = new Random();
    private int hiddenIndex;
    private int[] progression;

    @Override
    public String getDescription() {
        return "What number is missing in the progression?";
    }

    @Override
    public String generateQuestion() {
        int length = random.nextInt(6) + 5;
        int step = random.nextInt(10) + 1;
        int start = random.nextInt(100);

        progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }

        hiddenIndex = random.nextInt(length);
        return generateProgressionString();
    }

    @Override
    public String getCorrectAnswer() {
        return String.valueOf(progression[hiddenIndex]);
    }

    private String generateProgressionString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i == hiddenIndex) {
                sb.append(".. ");
            } else {
                sb.append(progression[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
