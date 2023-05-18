package org.example;

public class Time {
    private int seconds;

    public Time(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void printTime() {
        System.out.println("Время: " + seconds + " сек.");
    }
}

