package com.example.semesterproject;

public class Shift {
    String day;
    Position position;
    int Hours;
    boolean isAvailable;

    public Shift(String day, Position position, int hours, boolean isAvailable) {
        this.day = day;
        this.position = position;
        Hours = hours;
        this.isAvailable = isAvailable;
    }
}
