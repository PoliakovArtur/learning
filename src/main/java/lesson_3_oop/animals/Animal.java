package lesson_3_oop.animals;

/**
 * Разница между абстрактным классом и обычным:
 * 1. может иметь абстрактные методы
 * 2. нельзя создать объект такого класса
 */

public abstract class Animal implements Sayable, SomeInterface {

    public Animal() {
    }
}