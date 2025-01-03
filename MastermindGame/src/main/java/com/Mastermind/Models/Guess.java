package com.Mastermind.Models;

public class Guess {
    private final int[] guess;
    private final Feedback feedback;

    public Guess(int[] guess, Feedback feedback) {
        this.guess = guess;
        this.feedback = feedback;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public int[] getGuess() {
        return guess;
    }
}
