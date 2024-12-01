package lesson_3_oop.animals;

public class Dog extends Animal{

    // super ключевое слово для обращения к членам суперкласса
/*    public Dog() {
        super("гав");
    }*/

    @Override
    public void say() {
        System.out.println("гав");
    }
}
