package lesson_3_oop.tasks.task2;

/*
    Реализовать класс Многоярусный паркинг. Каждый ярус представляет собой объект класса Parking, соответственно,
    данный класс должен хранить массив из объектов с Parking.
    Многоярусный паркинг контролирует доступ ко всем ярусам. При создании передается массив с размерами парковок.
    Считается, что этажность определяется индексом расположения объекта в массиве + 1.
    Реализовать следующие методы:
    1. Завоз автомобиля. Завозит автомобиль на самый нижний свободный ярус. Если мест нет, то автомобиль встает в очередь в самый последний ярус
    2. Завоз автомобиля на определенный ярус. Передается номер яруса. Если свободных мест нет, то автомобиль встает в очередь
    3. Вывоз автомобиля. Автомобиль вывозится с самого последнего яруса.
    4. Вывоз автомобиля с определенного яруса.
    5. Вывод общего количества свободных мест
    6. Вывод общей информации

    Необходимо ограничить доступ к внутреннему состоянию объекта, чтобы нельзя было отдельно получить Parking и что-то с ним делать
    вне MultiLevelParking.
    Добавить проверки в случае ввода некорректных данных и выводить информацию об ошибке. Например, при передаче отрицательного значения в качестве этажа

    Пример работы:
    MultiLevelParking multiLevelParking = new MultiLevelParking(new int[]{2,2,2});
    multiLevelParking.addCar(); // Этаж 1: Автомобиль завезен! Свободных мест 1. Всего свободных мест 5
    multiLevelParking.addCar(2); // Этаж 2: Автомобиль завезен! Свободных мест 1.
    multiLevelParking.addCar(2); // Этаж 2: Автомобиль завезен! Свободных мест 0
    multiLevelParking.addCar(2); // Этаж 2: Свободных мест 0. Автомобиль добавлен в очередь.
    multiLevelParking.addCar(); // Этаж 1: Автомобиль завезен! Свободных мест 0. Всего свободных мест 2
    multiLevelParking.addCar(); // Этаж 3: Автомобиль завезен! Свободных мест 1. Всего свободных мест 1
    multiLevelParking.addCar(); // Этаж 3: Автомобиль завезен! Свободных мест 0. Всего свободных мест 0
    multiLevelParking.dropCar(); // Этаж 3: Автомобиль Вывезен! Свободных мест 2. Всего свободных мест 1
    System.out.println(multiLevelParking.freeSpace()); 1
    multiLevelParking.printInfo();
    // Этаж 1: Всего мест: 2 Свободных мест: 0 Количество припаркованных автомобилей: 2 Количество автомобилей в очереди: 0
    // Этаж 2: Всего мест: 2 Свободных мест: 0 Количество припаркованных автомобилей: 2 Количество автомобилей в очереди: 1
    // Этаж 3: Всего мест: 2 Свободных мест: 1 Количество припаркованных автомобилей: 1 Количество автомобилей в очереди: 0

 */

import lesson_3_oop.tasks.task1.Parking;

import java.util.Scanner;

public class MultiLevelParking {
    Scanner scan = new Scanner(System.in);
    private int floor;
    private int freeSpaces;
    private Parking[] array;

    MultiLevelParking(int[] ints) {
        this.array = new Parking[ints.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Parking(scan.nextInt());
            freeSpaces += array[i].getSize();
        }
    }

    public void addCar() {
        for (int i = 0; i < array.length; i++) {
            if (array[i].isNewCarAvailable() || i == array.length - 1) {
                freeSpaces -= array[i].getFreeSpaces();
                System.out.println("Этаж " + (i + 1) + ":");
                array[i].addCar();
                freeSpaces += array[i].getFreeSpaces();
                break;
            }
        }


    }

    public void dropCar() {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].getFreeSpaces() != array[i].getSize() && array[i].dropCar()) {
                freeSpaces--;
                System.out.println("Этаж " + (i + 1) + ":");
                break;
            }
        }
    }

    public void addCar(int floor) {
        this.floor = floor;
        if (array[floor - 1].isNewCarAvailable()) {
            freeSpaces -= 1;
        }
        System.out.println("Этаж " + floor + ":");
        array[floor - 1].addCar();
    }

    public void dropCar(int floor) {
        this.floor = floor;
        if (!(array[floor - 1].getSize() == array[floor - 1].getFreeSpaces())) {
            freeSpaces += 1;
        }
        System.out.println("Этаж " + floor + ":");
        array[floor - 1].dropCar();
    }

    public int getFreeSpaces() {
        return freeSpaces;
    }

    public void getInfo() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Этаж " + i + ": ");
            array[i].parkingInfo();
        }
    }
    /*
    MultiLevelParking(int[] array) {
        this.array = array;
        for (int i = 0; i < array.length; i++) {
            Parking parking = new Parking(array[i]);
            if (array[i] <= 0) array[i] = 2;
            this.allSpaces += array[i];
        }
    }

    }
    public int getAllSpaces() {
        return allSpaces;
    }

    /*public void getInfo() {
        System.out.println(freeSpaces);
        System.out.println(array[0]);
    }*/

}