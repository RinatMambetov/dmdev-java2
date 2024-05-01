package com.rinat.lesson19.hw2.task2.car;

import java.util.Objects;

public class Bus extends Car {
    private final int passengersAmount;

    public Bus(Brand brand, Model model, Color color, int year, int passengersAmount) {
        super(brand, model, color, year);
        this.passengersAmount = passengersAmount;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Bus bus = (Bus) object;
        return passengersAmount == bus.passengersAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersAmount);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengersAmount=" + passengersAmount +
                '}' + super.toString();
    }

    public int getPassengersAmount() {
        return passengersAmount;
    }
}
