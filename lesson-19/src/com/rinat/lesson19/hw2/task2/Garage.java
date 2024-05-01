package com.rinat.lesson19.hw2.task2;

import com.rinat.lesson19.hw2.task2.car.Brand;
import com.rinat.lesson19.hw2.task2.car.Car;
import com.rinat.lesson19.hw2.task2.car.Color;
import com.rinat.lesson19.hw2.task2.car.Model;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private final Map<Car, Integer> cars = new HashMap<>();

    public void park(Car car) {
        int oldCount = cars.getOrDefault(car, 0);
        cars.put(car, oldCount + 1);
    }

    public void departure(Car car) {
        int oldCount = cars.getOrDefault(car, 0);
        int newCount = oldCount == 0 ? 0 : oldCount - 1;
        if (newCount == 0) {
            cars.remove(car);
        } else {
            cars.put(car, newCount);
        }
    }

    public int carCountByBrand(Brand brand) {
        int count = 0;
        for (Car car : cars.keySet()) {
            if (car.getBrand() == brand) {
                count++;
            }
        }
        return count;
    }

    public int carCountByModel(Model model) {
        int count = 0;
        for (Car car : cars.keySet()) {
            if (car.getModel() == model) {
                count++;
            }
        }
        return count;
    }

    public int carCountByColor(Color color) {
        int count = 0;
        for (Car car : cars.keySet()) {
            if (car.getColor() == color) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "cars=" + cars +
                '}';
    }

    public Map<Car, Integer> getCars() {
        return cars;
    }
}
