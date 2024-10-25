package lesson_3_oop.tasks.task1;

import java.util.Scanner;

public class ParkingTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Parking parking1 = new Parking();
        System.out.println("Введите размер парковки");
        parking1.size = scan.nextInt();
        if (parking1.size < 1) {
            System.out.println("Некорректно введен размер, будет создана парковка вместимостью 10 машин");
            parking1.size = parking1.defaultSize;
        }
        parking1.freeSpaces = parking1.size;
        int[] number = new int[0];
        parking1.carOut();
        parking1.carIn();
        parking1.carOut();
        parking1.carIn();
        parking1.carIn();
        parking1.carIn();
        parking1.carOut();
        parking1.carOut();
        parking1.getFreeSpaces();
        parking1.getQueue();
        parking1.newCarAvailable();
        parking1.getSize();
        parking1.parkingInfo();
}}
