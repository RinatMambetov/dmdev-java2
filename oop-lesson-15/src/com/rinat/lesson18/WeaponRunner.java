package com.rinat.lesson18;

import com.rinat.lesson15.Archer;
import com.rinat.lesson15.Hero;
import com.rinat.lesson15.Warrior;
import com.rinat.lesson18.weapon.Bow;
import com.rinat.lesson18.weapon.Sword;
import com.rinat.lesson18.weapon.Weapon;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer1 = new Archer<>("Petr", 10);
        archer1.setWeapon(new Bow());

        Warrior<Sword> warrior1 = new Warrior<>("Ivan", 15);
        warrior1.setWeapon(new Sword());

        printWeaponDamage(archer1);
        printWeaponDamage(warrior1);
        printWeaponDamage2(archer1);
        printWeaponDamage2(warrior1);
        printWeaponDamage3(warrior1);
    }

    private static <T extends Weapon> void printWeaponDamage(Hero<T> hero) {
        System.out.println(hero.getWeapon().damage());
    }

    private static void printWeaponDamage2(Hero<? extends Weapon> hero) {
//        producer
        System.out.println(hero.getWeapon().damage());
    }

    private static void printWeaponDamage3(Hero<? super Sword> hero) {
//        consumer
        System.out.println(hero.getWeapon().damage());
    }
}
