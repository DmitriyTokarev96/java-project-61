package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

public class Game {
    public static void main(String[] args) {
        // Вызов методов из класса Calc
        System.out.println(Calc.getDescription());
        String question = Calc.generateQuestion();
        String answer = Calc.getCorrectAnswer();

        System.out.println("Question: " + question);
        System.out.println("Answer: " + answer);

        // Вызов методов из других игр
        System.out.println(Even.getDescription());
        question = Even.generateQuestion();
        answer = Even.getCorrectAnswer();

        System.out.println("Question: " + question);
        System.out.println("Answer: " + answer);

        System.out.println(GCDGame.getDescription());
        question = GCDGame.generateQuestion();
        answer = GCDGame.getCorrectAnswer();

        System.out.println("Question: " + question);
        System.out.println("Answer: " + answer);

        System.out.println(PrimeGame.getDescription());
        question = PrimeGame.generateQuestion();
        answer = PrimeGame.getCorrectAnswer();

        System.out.println("Question: " + question);
        System.out.println("Answer: " + answer);

        System.out.println(ProgressionGame.getDescription());
        question = ProgressionGame.generateQuestion();
        answer = ProgressionGame.getCorrectAnswer();

        System.out.println("Question: " + question);
        System.out.println("Answer: " + answer);
    }
}
