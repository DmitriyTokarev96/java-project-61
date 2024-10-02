package hexlet.code.games;

import hexlet.code.utils.Utils;

public class ProgressionGame {
    private static int hiddenIndex;
    private static int[] progression;

    public static String getDescription() {
        return "What number is missing in the progression?";
    }

    public static String generateQuestion() {
        int length = 10;
        int step = Utils.getRandomInt(1, 10);
        int start = Utils.getRandomInt(1, 50);

        progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }

        hiddenIndex = Utils.getRandomInt(0, length - 1);
        return generateProgressionString();
    }

    public static String getCorrectAnswer() {
        return String.valueOf(progression[hiddenIndex]);
    }

    private static String generateProgressionString() {
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
