package lesson_3_oop;

public class User {

    /*
        Значения по умолчанию для полей:
        числовые примитивы - 0
        boolean - false
        объект - null
        null - пустая ссылка
     */
    private int age;
    private String name;

    //alt + insert меню для генерации стандартных методов
    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //Перегрузка конструкторов
    public User(int age) {
        this.age = age;
        this.name = "default";
    }

    public User(String name) {
        this.age = 0;
        this.name = name;
    }

    //ключевое слово this - ссылка на себя
    public User method() {
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}