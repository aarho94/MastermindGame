package com.pluralsight;

public class Timer {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public String getElapsedTimeString() {
        long elapsed = getElapsedTime();
        long seconds = (elapsed / 1000) % 60;
        long minutes = (elapsed / (1000 * 60)) % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}
