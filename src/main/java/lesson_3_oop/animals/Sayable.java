package lesson_3_oop.animals;

/**
 * Отличие интерфейса от абстрактного класса:
 * 1. не может быть полей кроме констант
 * 2. нельзя определить конструктор
 * 3. нельзя реализовывать методы, кроме default
 * 4. наследование класса от интерфейса происходит через ключевое слово implements, тк класс может имлементировать много интерфейсов
 * 5. один интерфейс может наследовать другой через extends, но также может наследовать много интерфейсов
 * 6. не может быть приватных абстрактных методов
 */
public interface Sayable {

    String s = "a"; //public final static

    static void sayDefault() {
        System.out.println(s);
    }

    void say(); //public abstract

    default void say(String voice) {
        System.out.println(voice);
    }
}