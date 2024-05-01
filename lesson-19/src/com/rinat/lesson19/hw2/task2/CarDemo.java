package com.rinat.lesson19.hw2.task2;

import com.rinat.lesson19.hw2.task2.car.*;

/**
 * 2. Создать абстрактный класс Car, представляющий собой
 * автомобиль.
 * Добавить в него поля: марка, модель, год выпуска + несколько
 * своих.
 * Создать 4 класса, являющихся наследниками Car.
 * Переопределить во всех 3-х классах методы equals(), hashCode() и
 * toString()
 * Создать класс Garage, хранящий в себе HashMap автомобилей,
 * в котором ключом является объект автомобиля, значением -
 * количество точно таких автомобилей в гараже.
 * Добавить в класс Garage методы для парковки, выезда авто, а также
 * для получения количества определенного вида автомобилей.
 * Продемонстрировать работу гаража.
 */
public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Bus(Brand.UAZ, Model.CROSSOVER, Color.BLACK, 2000, 20);
        Car car2 = new Track(Brand.LADA, Model.HATCHBACK, Color.RED, 2001, 200);
        Car car3 = new RacingCar(Brand.MOSKVICH, Model.SEDAN, Color.BLUE, 2002, 300);
        Car car4 = new Bus(Brand.ZIGULI, Model.UNIVERSAL, Color.GREEN, 2003, 30);
        Car car5 = new Track(Brand.UAZ, Model.CROSSOVER, Color.WHITE, 2004, 250);
        Car car6 = new RacingCar(Brand.LADA, Model.UNIVERSAL, Color.RED, 2005, 260);
        Car car7 = new RacingCar(Brand.ZIGULI, Model.HATCHBACK, Color.BLUE, 2006, 210);

        Garage garage = new Garage();
        garage.park(car1);
        garage.park(car2);
        garage.park(car3);
        garage.park(car4);
        garage.park(car5);
        garage.park(car6);
        garage.park(car7);

        System.out.println(garage.carCountByBrand(Brand.UAZ));
        garage.departure(car5);
        System.out.println(garage.carCountByBrand(Brand.UAZ));
        garage.departure(car1);
        System.out.println(garage.carCountByBrand(Brand.UAZ));

        System.out.println(garage.carCountByModel(Model.HATCHBACK));
        System.out.println(garage.carCountByColor(Color.BLUE));

        System.out.println(garage);
    }
}
