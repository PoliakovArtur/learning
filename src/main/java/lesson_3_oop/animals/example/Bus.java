package lesson_3_oop.animals.example;

public class Bus extends Car {

    static {
        System.out.println("Cal static init block 1 in Bus");
    }

    static {
        System.out.println("Cal static init block 2 in Bus");
    }

    {
        System.out.println("Cal init block 1 in Bus");
    }

    {
        System.out.println("Cal init block 2 in Bus");
    }

    public Bus() {
        super(5);
        System.out.println("Call constructor in Bus");
    }
}
