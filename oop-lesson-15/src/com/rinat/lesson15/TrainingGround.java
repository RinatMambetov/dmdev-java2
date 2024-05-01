package com.rinat.lesson15;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Ivan", 15);
        Hero mage = new Mage("Stepan", 20);
        Archer archer = new Archer("Dima", 10);

        Archer.Eagle eagle = archer.new Eagle("Kesha", 2);
        Archer.Fox fox = new Archer.Fox("Lena", 3);

        Enemy enemy = new Enemy("Vova", 100);
        attackEnemy(enemy, warrior, mage, archer);
    }

    private static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
