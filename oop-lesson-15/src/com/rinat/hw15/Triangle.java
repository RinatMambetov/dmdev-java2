package com.rinat.hw15;

public class Triangle extends Figure implements WithPerimeter, WithHeight {

    final Point point1;
    final Point point2;
    final Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public double area() {
        double side1 = side(point1, point2);
        double side2 = side(point2, point3);
        double side3 = side(point3, point1);
        double semiPerimeter = semiPerimeter();
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }

    @Override
    public double height() {
        return 2 * area() / side(point1, point2);
    }

    @Override
    public double perimeter() {
        return point1.distance(point2) + point2.distance(point3) + point3.distance(point1);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                '}';
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }
}
