package lesson_3_oop;

import lesson_3_oop.model.User;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        //ctrl a  + ctrl alt l - форматирование
        var b = 3;
        byte b1 = 3;
        byte b2 = 4;
        byte b3 = (byte) (b1 + b2);


        //
        Employee user2 = new Employee(), user3 = null;

        Employee vasya = new Employee("Вася", "vasya@mail.ru", 30, 10000);
        System.out.println(vasya.age);

        user2.salary = 20000;

        System.out.println(vasya.calculateSalaryFromAllWorkingPeriod(2));
        System.out.println(user2.calculateSalaryFromAllWorkingPeriod(2));

        var name = vasya.getName();
        System.out.println(name);

        vasya.printInfo();

        vasya.addDocument("1101", "121232");
        Employee.Document document = vasya.getDocument();

        document.printOwnerInfo();

        User user = new User();

    }
}
