package com.Mastermind;

public class Feedback {
    private final int correctNumbers;
    private final int correctPositions;

    public Feedback(int correctNumbers, int correctPositions) {
        this.correctNumbers = correctNumbers;
        this.correctPositions = correctPositions;
    }

    public int getCorrectNumbers() {
        return correctNumbers;
    }

    public int getCorrectPositions() {
        return correctPositions;
    }

    @Override
    public String toString() {
        return correctNumbers + " correct numbers and " + correctPositions + " correct positions";
    }
}
