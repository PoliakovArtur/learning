package lesson_3_oop.model;

import java.time.LocalDateTime;

public class User {

    private final static LocalDateTime CREATION_DATE = LocalDateTime.now();

    static {
        System.out.println("static init");
    }

    static {
        System.out.println("static init");
    }
    /*
        ctrl shift / - многострочный комментарий
        ctrl / - однострочный комментарий

        Модификаторы доступа - определяет доступ членов класса снаружи
        private - только внутри класса
        package-private - только внутри пакета
        protected
        public - доступен везде
     */

    static String name;
    String email;
    User friend;
    String fullName;

    public User() {

    }

    public User(String fullName) {
        this.fullName = fullName;
    }

    static String getName() {
        return name;
    }

    String getNameNoStatic() {
        return name;
    }

    static class Document {
        static LocalDateTime dateTime = CREATION_DATE;
    }

    public void printFriend() {
        System.out.println(friend.fullName);
    }

}
