package lesson_4_object;

import java.lang.reflect.Field;
import java.util.Objects;

public class ObjectExamples {

    private int name;

    public int getName() {
        return name;
    }

    public static void main(String[] args) throws IllegalAccessException, CloneNotSupportedException, InterruptedException {
        Object object = new Object();
        ObjectExamples objectExamples = new ObjectExamples();

        Object o = objectExamples;

        //Метаинформация об объекте
        Class<?> clazz = o.getClass();

        System.out.println(clazz.getName());

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            field.set(o, 5);
            User user2 = new User("abc");
            System.out.println(user2);
        }

        Thread.sleep(10000);
        System.out.println(objectExamples.name);

        //ID объекта
        System.out.println(o.hashCode());

        User user = new User("Vasya");

        User user1 = new User("petya");

        System.out.println(user == user1);

        System.out.println(user.equals(user1));

        User user2 = user.clone();

        System.out.println(user2.getName());

        System.out.println(user2);

    }
}

class User implements Cloneable {

    private String name;
    private int age;
    private User friend;


    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friend=" + friend +
                '}';
    }

}