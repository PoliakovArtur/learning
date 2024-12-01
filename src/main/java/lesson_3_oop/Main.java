package lesson_3_oop;

public class Main {

    public static void main(String[] args) {
        //1. как создать объект Тип имя = new Тип();
        Main main = new Main();
        User user = new User(2, "John");

        //2. передача по ссылке и значению
        int i = 4;
        int j = i;
        i++;
        System.out.println(j);

        User john = new User(2, "John");
        User jane = john;
        setName(jane, "jane");

        System.out.println(john.getName());

        method(i);
        System.out.println(i);

        //3. сравнение объектов
        System.out.println(john == jane); //проверяем ссылки, т.е. ссылаются ли они на один и тот же объект
    }

    static void method(int i) {
        i++;
    }

    static void setName(User user, String name) {
        user.setName(name);
    }
}