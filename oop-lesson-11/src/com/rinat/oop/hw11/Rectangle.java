package com.rinat.oop.hw11;

public class Rectangle {
    private Point leftTop;
    private Point rightBottom;

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

    public Point getLeftTop() {
        return leftTop;
    }

    public void setLeftTop(Point leftTop) {
        this.leftTop = leftTop;
    }

    public Point getRightBottom() {
        return rightBottom;
    }

    public void setRightBottom(Point rightBottom) {
        this.rightBottom = rightBottom;
    }
}
