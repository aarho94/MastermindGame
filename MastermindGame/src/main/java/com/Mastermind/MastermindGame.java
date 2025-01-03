package com.Mastermind;

public class MastermindGame {
    private final UserInterface ui;
    private final Game game;

    public MastermindGame() {
        // Initialize User Interface
        ui = new UserInterface();

        // Set difficulty level
        DifficultyLevel difficulty = new DifficultyLevel("easy"); // Change to "medium" or "hard" as desired

        // Initialize Game with the chosen difficulty level
        game = new Game(difficulty);
    }

    public void play() {
        ui.displayWelcomeMessage();
        game.startTimer();

        while (!game.isGameOver()) {
            ui.displayAttemptsLeft(game.getAttemptsRemaining());

            // Get user guess
            int[] guess = ui.getUserGuess(game.getTargetCombination().length);

            // Make a guess and get feedback
            Feedback feedback = game.makeGuess(guess);
            ui.displayFeedback(feedback);

            // Check if the user has won
            if (feedback.getCorrectPositions() == game.getTargetCombination().length) {
                game.stopTimer();
                ui.displayWinMessage();
                System.out.println("Time taken: " + game.getElapsedTime());
                return; // Exit the game
            }
        }

        // Game over scenario
        game.stopTimer();
        ui.displayGameOver(game.getTargetCombination());
    }

    public static void main(String[] args) {
        MastermindGame mastermindGame = new MastermindGame();
        mastermindGame.play();
    }
}
