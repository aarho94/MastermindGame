package com.Mastermind;

public class DifficultyLevel {
    private String level;
    private int numDigits;

    public DifficultyLevel(String level) {
        setDifficulty(level);
    }

    public void setDifficulty(String level) {
        this.level = level;
        switch (level.toLowerCase()) {
            case "easy":
                numDigits = 4;
                break;
            case "medium":
                numDigits = 5;
                break;
            case "hard":
                numDigits = 6;
                break;
            default:
                throw new IllegalArgumentException("Invalid difficulty level");
        }
    }

    public int getNumDigits() {
        return numDigits;
    }

    public String getDifficultyLevel() {
        return level;
    }
}