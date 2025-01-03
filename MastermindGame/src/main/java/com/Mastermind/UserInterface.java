package com.Mastermind;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome to Mastermind!");
        System.out.println("You have 10 attempts to guess the 4-number pattern (0-7).");
    }

    public void displayAttemptsLeft(int attemptsLeft) {
        System.out.println("Attempts left: " + attemptsLeft);
    }

    public void displayFeedback(Feedback feedback) {
        System.out.println(feedback);
    }

    public void displayGameOver(int[] targetCombination) {
        System.out.print("Game Over! The correct pattern was: ");
        for (int num : targetCombination) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void displayWinMessage() {
        System.out.println("Congratulations! You've guessed the pattern!");
    }

    public int[] getUserGuess(int numDigits) {
        int[] guess = new int[numDigits];
        System.out.print("Enter your guess (" + numDigits + " numbers separated by spaces): ");
        String input = scanner.nextLine();
        String[] inputNumbers = input.split(" ");

        for (int i = 0; i < numDigits; i++) {
            guess[i] = Integer.parseInt(inputNumbers[i]);
        }
        return guess;
    }

    public void close() {
        scanner.close();
    }
}
