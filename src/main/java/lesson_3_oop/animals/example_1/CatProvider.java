package lesson_3_oop.animals.example_1;

import lesson_3_oop.animals.Cat;

public class CatProvider extends AnimalProvider {

    // При переопределении можно сузить тип возвращаемого значения в рамках наследования
    @Override
    public Cat nextAnimal() {
        return new Cat();
    }
}