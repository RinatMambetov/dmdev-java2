package com.rinat.lesson15;

import com.rinat.lesson18.weapon.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T> {
    private Wolf wolf;
    private T weapon;

    public Archer(String name, int damage) {
        super(name, damage);
        wolf = new Wolf("Boris", 5);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
//        System.out.println(getName() + " attack with arrow " + enemy.getName());
//        enemy.takeDamage(getDamage());

        class Test {
        }
        Test test = new Test();

        wolf.attackEnemy(enemy);
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public static class Fox {
        private String name;
        private int damage;

        public Fox(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public String getName() {
            return name;
        }

        public int getDamage() {
            return damage;
        }
    }

    private class Wolf {
        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy) {
            System.out.println(getName() + " attack with " + Archer.this.getName() + " enemy " + enemy.getName());
            enemy.takeDamage(getDamage() + Archer.this.getDamage());
        }

        public String getName() {
            return name;
        }

        public int getDamage() {
            return damage;
        }

    }

    public class Eagle {
        private String name;
        private int damage;

        public Eagle(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public String getName() {
            return name;
        }

        public int getDamage() {
            return damage;
        }
    }
}
