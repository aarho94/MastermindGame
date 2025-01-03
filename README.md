# MastermindGame
This is a game where a player tries to guess the number combinations. At the end of each attempt to guess the 4 number combinations, the computer will provide feedback whether the player had guess a number correctly, or/and a number and digit correctly. A player must guess the right number combinations within 10 attempts to win the game.
# Mastermind Game - README

## Overview

This repository contains a simple implementation of the *Mastermind* game, where the objective is to guess a secret pattern of numbers. The game features a user interface, a timer, and various levels of difficulty. The game also uses the random.org API to generate the target number pattern, adding an extra layer of randomness to the game.

### Features:
- **Target Number Generation**: The secret number combination is randomly generated using the random.org API, which ensures a high level of randomness.
- **Difficulty Levels**: Three difficulty levels are available:
  - Easy (4 digits)
  - Medium (5 digits)
  - Hard (6 digits)
- **Timer**: Tracks how long it takes to guess the correct combination.
- **Attempts**: Players are allowed a limited number of attempts to guess the correct combination.

---

## Prerequisites

1. **Java Development Kit (JDK)**:
   - You will need **JDK 8** or higher installed on your system to compile and run the game.

   To check if Java is installed, open a terminal and type:
   ```bash
   java -version
If Java is not installed, you can download it from Oracle's JDK page or use a package manager for your operating system.

2. **Internet Connection**:
The game uses the random.org API to generate random numbers, so an internet connection is required to run the game.

## Steps to Build and Run the Game

1. Clone the repository:

Clone this repository to your local machine using the following command:
git clone <repository-url>

Navigate to the project folder:
cd mastermind-game

2. Compile the Java classes:

Open a terminal in the project directory and compile the Java files:
javac com/Mastermind/*.java

This will compile all the classes in the com/Mastermind/ directory.

3. Run the Game:

Once the code is compiled, you can run the game using the following command:
java com.Mastermind.MastermindGame

## How to Play the Game
1. **Starting the Game**:

- The game will start by displaying a welcome message and explaining the rules.
- You will be given the option to choose a difficulty level: Easy, Medium, or Hard.

2. **Making Guesses**:

- In each round, you will be prompted to enter a guess for the secret number combination. The guess must consist of the same number of digits as the target pattern (4 for Easy, 5 for Medium, and 6 for Hard).
- The system will provide feedback after each guess, showing how many numbers are correct but in the wrong position and how many numbers are in the correct position.
  
3. **Game Over or Win**:

- The game will continue until you either guess the correct combination or exhaust all your attempts (10 attempts in total).
- If you guess the combination correctly, you win, and the game displays the time taken.
- If you fail to guess within 10 attempts, the game is over, and the correct combination will be displayed.

## Code Structure
**The project is organized into several classes, each with a specific responsibility**:

1. MastermindGame:

- The entry point for the game, this class orchestrates the game flow by interacting with other components (e.g., UI, Game, Timer).

2. UserInterface:

- Handles all user interactions, such as displaying messages, receiving input, and showing feedback. It is designed to be easy to update if additional UI features are needed.
  
3. Game:

- Contains the game logic, such as generating the secret number, checking guesses, tracking attempts, and managing the timer. It also determines when the game ends.

4. Feedback:

- Provides feedback about the accuracy of the player's guesses, including how many numbers are correct and how many are in the correct positions.

5. Guess:

- Stores individual guesses made by the player, along with the associated feedback.

6. DifficultyLevel:

- Manages the difficulty settings, determining the number of digits in the target combination.

7. RandomNumberGenerator:

- Generates a random combination of numbers by making a request to the random.org API. This provides a higher level of randomness compared to using simple pseudo-random number generation.

8. Timer:

- Tracks the time taken to guess the correct pattern, stopping when the game ends.

## Extensions and Improvements

**While the game is functional, here are some potential extensions that could be added in the future**:

1. Graphical User Interface (GUI):

- The current version is a text-based user interface. A GUI could be added using libraries like JavaFX or Swing for a more user-friendly experience.
  
2. Hints System:

- Provide a "hint" system where the player can get a random number from the secret pattern or some feedback on which digits are closest to the correct number.

3. Multiple Rounds:

- Implement a feature where players can play multiple rounds, keeping track of their high score and best times.

4. Difficulty Customization:

- Allow players to choose the number of digits and the number of attempts, making the game more flexible.

5. Multi-Player Mode:

- Enable a mode where two players can compete against each other to guess the target combination in the fewest attempts.

## Troubleshooting
- Internet Connectivity Issues: The game relies on the random.org API, which requires an internet connection. Ensure that you are connected to the internet.
- Java Version: Ensure you are using JDK 8 or higher. If you encounter any compilation issues, check your Java installation.
