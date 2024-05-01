package com.rinat.hw15;

public interface WithPerimeter {
    double perimeter();

    default double side(Point point1, Point point2) {
        return point1.distance(point2);
    }

    default double semiPerimeter() {
        return perimeter() / 2;
    }
}
