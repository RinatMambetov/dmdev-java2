package com.rinat.lesson15;

import com.rinat.lesson18.weapon.Weapon;

public abstract class Hero<T extends Weapon> {
    private T weapon;
    private String name;
    private int damage;

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void attackEnemy(Enemy enemy);

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public T getWeapon() {
        return weapon;
    }
}
