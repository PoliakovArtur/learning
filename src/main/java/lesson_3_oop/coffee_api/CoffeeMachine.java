package lesson_3_oop.coffee_api;

public class CoffeeMachine {

    static {
        System.out.println("Обратились к класс CoffeeMachine");
    }

    {
        System.out.println("Create coffee Machine");
    }

    private long version;

    public static final long SERIAL_NUMBER = 123123213;

    public CoffeeMachine(long version) {
        this.version = version;
    }

    public Coffee makeCoffee() {
        return new Coffee();
    }

    public Coffee makeCoffee(Syrop syrop) {
        return new Coffee(syrop);
    }
}