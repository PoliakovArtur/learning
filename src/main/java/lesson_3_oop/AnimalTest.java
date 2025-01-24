package lesson_3_oop;

import lesson_3_oop.animals.Animal;
import lesson_3_oop.animals.Cat;
import lesson_3_oop.animals.Dog;
import lesson_3_oop.animals.Elephant;
import lesson_3_oop.animals.Sayable;
import lesson_3_oop.animals.Sphynx;

public class AnimalTest {

    public static void main(String[] args) {
   /*     Cat[] cats = new Cat[2];
        Animal[] animals = cats;

        animals[0] = new Dog();

        cats[0].say();*/

        Cat cat = new Cat();
        Animal animal = cat;

        getAnimal(cat);

     /*   String[] names = new String[]{"Cat", "Dog", "Elephant", "Sphynx"};

        Sayable[] animals = new Animal[] {
                new Cat(),
                new Dog(),
                new Elephant(),
                new Sphynx()
        };
        //Обращение к объектам через тип их суперкласса
        for(int i = 0; i <animals.length; i++) {
            System.out.println(names[i]);
            Sayable animal = animals[i];
            animal.say();
            if(animal instanceof Cat cat) {
               // Cat cat = (Cat) animal;
                cat.mrmr();
            }
        }*/

 /*       Sphynx sphynx = new Sphynx();

        System.out.println(sphynx instanceof Sphynx);
        System.out.println(sphynx instanceof Cat);
        System.out.println(sphynx instanceof Animal);*/
    }

    static void getAnimal(Animal animal) {
        System.out.println("animal");
    }

    static void getAnimal(Cat cat) {
        System.out.println("cat");
    }
}