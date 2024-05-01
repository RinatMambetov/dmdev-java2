package com.rinat.oop.hw11;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point second) {
        double powX = Math.pow((x - second.getX()), 2);
        double powY = Math.pow((y - second.getY()), 2);
        return Math.sqrt(powX + powY);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
