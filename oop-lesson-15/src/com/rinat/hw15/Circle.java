package com.rinat.hw15;

import static java.lang.Math.PI;

public class Circle extends Figure implements WithPerimeter {

    private final Point point;
    private final double radius;

    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", radius=" + radius +
                '}';
    }

    public Point getPoint() {
        return point;
    }

    public double getRadius() {
        return radius;
    }
}
