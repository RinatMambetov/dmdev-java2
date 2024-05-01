package com.rinat.lesson19.hw2.task2.car;

import java.util.Objects;

public class Track extends Car {
    private final int liftingCapacity;

    public Track(Brand brand, Model model, Color color, int year, int liftingCapacity) {
        super(brand, model, color, year);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Track track = (Track) object;
        return liftingCapacity == track.liftingCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), liftingCapacity);
    }

    @Override
    public String toString() {
        return "Track{" +
                "liftingCapacity=" + liftingCapacity +
                '}' + super.toString();
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }
}
