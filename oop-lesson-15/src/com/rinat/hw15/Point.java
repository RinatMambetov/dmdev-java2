package com.rinat.hw15;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point second) {
        double powX = Math.pow((x - second.getX()), 2);
        double powY = Math.pow((y - second.getY()), 2);
        return Math.sqrt(powX + powY);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
