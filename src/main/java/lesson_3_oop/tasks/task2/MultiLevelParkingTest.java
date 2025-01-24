package lesson_3_oop.tasks.task2;

import lesson_3_oop.tasks.task1.Parking;

import java.util.Scanner;

public class MultiLevelParkingTest {
    public static void main(String[] args) {

        Scanner scan = null;
        while (true) {
            System.out.println(999);
            MultiLevelParking multiLevelParking = new MultiLevelParking(new int[]{2,2});

            for (int i = 0; i < 10; i++) {
                multiLevelParking.addCar();
            }

            for (int i = 0; i < 10; i++) {
                multiLevelParking.dropCar(1);
            }

            multiLevelParking.getInfo();
        }
    }
}

