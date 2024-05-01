package com.rinat.hw15;

public abstract class Figure {
    public boolean isAreaEqual(Figure figure) {
        return area() == figure.area();
    }

    public abstract double area();
}
