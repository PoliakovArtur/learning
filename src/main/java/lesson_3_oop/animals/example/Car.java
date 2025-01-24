package lesson_3_oop.animals.example;

public class Car {

    protected String name;

    static {
        System.out.println("Cal static init block 1 in Car");
    }

    static {
        System.out.println("Cal static init block 2 in Car");
    }

    {
        System.out.println("Cal init block 1 in Car");
    }

    {
        System.out.println("Cal init block 2 in Car");
    }

    public Car(int i) {
        System.out.println("Call constructor in Car");
    }
}