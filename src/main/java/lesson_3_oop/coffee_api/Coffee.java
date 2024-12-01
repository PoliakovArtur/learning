package lesson_3_oop.coffee_api;

public class Coffee {

    //нестатические final поля инициализируются сразу либо через конструктор. final поле должно быть всегда инициализировано
    private final Syrop syrop;

    public Coffee(Syrop syrop) {
        this.syrop = syrop;
    }

    public Coffee() {
        this.syrop = new Syrop(Syrop.noneSyrop);
    }

    //Со статического контекста нельзя обращаться к нестатическому. наоборот можно
    public static void m() {
      //  syrop = new Syrop("");
    }
}
