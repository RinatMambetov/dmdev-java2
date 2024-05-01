package com.rinat.lesson15;

import com.rinat.lesson18.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {
    private T weapon;

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " attack with sword " + enemy.getName());
        enemy.takeDamage(getDamage());
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
