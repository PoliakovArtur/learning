package lesson_3_oop.animals;

import lesson_3_oop.animals.Animal;

public class Cat extends Animal implements Mrmrable {

/*    public Cat() {
        super("мяу");
    }*/

    @Override
    public void mrmr() {
        System.out.println("mrmr");
    }

    @Override
    public void say() {
        System.out.println("мяу");
    }
}
