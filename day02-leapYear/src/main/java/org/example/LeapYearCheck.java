package org.example;

public class LeapYearCheck {
    private final int year;

    public LeapYearCheck(int year) {
        this.year = year;
    }

    public boolean isLeap() {
        return isDivisibleBy(4) && !(isDivisibleBy(100) && notDivisibleBy(400));
    }

    private boolean notDivisibleBy(int divider) {
        return ! isDivisibleBy(divider);
    }

    private boolean isDivisibleBy(int divisor) {
        return this.year % divisor == 0;
    }

}
