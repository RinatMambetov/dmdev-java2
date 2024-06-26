package com.rinat.oop.task;

public class TimeIntervalRunner {
    public static void main(String[] args) {

        TimeInterval timeInterval = createTimeInterval();

        TimeInterval timeInterval1 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval1.totalSeconds());
        timeInterval.print();
        timeInterval1.print();
        TimeInterval sumIntervals = timeInterval.sum(timeInterval1);
        sumIntervals.print();
    }

    private static TimeInterval createTimeInterval() {
        TimeInterval timeInterval = new TimeInterval(30, 2, 1);
        System.out.println(timeInterval.totalSeconds());
        return timeInterval;
    }
}
