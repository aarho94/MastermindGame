package com.Mastermind.Application;

import com.Mastermind.Models.DifficultyLevel;
import com.Mastermind.Models.Feedback;
import com.Mastermind.Models.Guess;
import com.Mastermind.Utilities.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final int[] targetCombination;
    private int attemptsRemaining;
    private final List<Guess> guessHistory;
    private final DifficultyLevel difficulty;
    private final Timer timer;

    public Game(DifficultyLevel difficulty) {
        this.difficulty = difficulty;
        this.targetCombination = new RandomNumberGenerator().generateRandomNumbers(difficulty.getNumDigits());
        this.attemptsRemaining = 10;
        this.guessHistory = new ArrayList<>();
        this.timer = new Timer();
    }

    public Feedback makeGuess(int[] guess) {
        Feedback feedback = checkGuess(guess);
        guessHistory.add(new Guess(guess, feedback));
        attemptsRemaining--;
        return feedback;
    }

    private Feedback checkGuess(int[] guess) {
        int correctPositions = 0;
        int correctNumbers = 0;
        boolean[] checkedSecret = new boolean[targetCombination.length];
        boolean[] checkedGuess = new boolean[guess.length];

        for (int i = 0; i < targetCombination.length; i++) {
            if (guess[i] == targetCombination[i]) {
                correctPositions++;
                checkedSecret[i] = true;
                checkedGuess[i] = true;
            }
        }

        for (int i = 0; i < guess.length; i++) {
            for (int j = 0; j < targetCombination.length; j++) {
                if (!checkedSecret[j] && !checkedGuess[i] && guess[i] == targetCombination[j]) {
                    correctNumbers++;
                    checkedSecret[j] = true;
                    break;
                }
            }
        }

        return new Feedback(correctNumbers, correctPositions);
    }

    public int getAttemptsRemaining() {
        return attemptsRemaining;
    }

    public boolean isGameOver() {
        return attemptsRemaining <= 0;
    }

    public List<Guess> getGuessHistory() {
        return guessHistory;
    }

    public int[] getTargetCombination() {
        return targetCombination;
    }

    public void startTimer() {
        timer.start();
    }

    public void stopTimer() {
        timer.stop();
    }

    public String getElapsedTime() {
        return timer.getElapsedTimeString();
    }
}

