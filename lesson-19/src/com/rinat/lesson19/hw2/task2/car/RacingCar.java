package com.rinat.lesson19.hw2.task2.car;

import java.util.Objects;

public class RacingCar extends Car {
    private final int maxSpeed;

    public RacingCar(Brand brand, Model model, Color color, int year, int maxSpeed) {
        super(brand, model, color, year);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        RacingCar racingCar = (RacingCar) object;
        return maxSpeed == racingCar.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxSpeed);
    }

    @Override
    public String toString() {
        return "RacingCar{" +
                "maxSpeed=" + maxSpeed +
                '}' + super.toString();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
