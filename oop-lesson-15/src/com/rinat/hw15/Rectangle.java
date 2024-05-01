package com.rinat.hw15;

public class Rectangle extends Figure implements WithDiagonal {
    private final Point leftTop;
    private final Point rightBottom;

    public Rectangle(Point leftTop, Point rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    public double diagonal() {
        return leftTop.distance(rightBottom);
    }

    public double area() {
        return (rightBottom.getX() - leftTop.getX()) * (leftTop.getY() - rightBottom.getY());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "leftTop=" + leftTop +
                ", rightBottom=" + rightBottom +
                '}';
    }

    public Point getLeftTop() {
        return leftTop;
    }

    public Point getRightBottom() {
        return rightBottom;
    }

}
