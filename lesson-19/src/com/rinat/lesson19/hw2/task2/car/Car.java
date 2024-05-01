package com.rinat.lesson19.hw2.task2.car;

import java.util.Objects;

public abstract class Car {
    private final Brand brand;
    private final Model model;
    private final Color color;
    private final int year;

    public Car(Brand brand, Model model, Color color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return year == car.year && brand == car.brand && model == car.model && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", model=" + model +
                ", color=" + color +
                ", year=" + year +
                '}';
    }

    public Brand getBrand() {
        return brand;
    }

    public Model getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
