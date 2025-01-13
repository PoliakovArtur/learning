package lesson_3_oop.tasks.task2;

import lesson_3_oop.tasks.task1.Parking;

import java.util.Scanner;

public class MultiLevelParkingTest {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            MultiLevelParking multiLevelParking = new MultiLevelParking(new int[]{scan.nextInt(), scan.nextInt(), scan.nextInt()});
            System.out.println(multiLevelParking.getAllSpaces());
        }
    }
}