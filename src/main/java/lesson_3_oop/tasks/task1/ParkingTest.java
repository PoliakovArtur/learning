package lesson_3_oop.tasks.task1;

import java.util.Scanner;

public class ParkingTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            Parking parking = new Parking(scan.nextInt());
            System.out.println(parking.getSize());
            System.out.println(parking.getQueue());
            System.out.println(parking.getFreeSpaces());
            parking.addCar();
            parking.addCar();
            System.out.println(parking.newCarAvailable());
            parking.addCar();
            parking.parkingInfo();
            parking.dropCar();
        }
    }
}
