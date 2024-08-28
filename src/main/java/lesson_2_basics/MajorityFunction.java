package lesson_2_basics;

import java.util.Scanner;

public class MajorityFunction {

    // реализовать функцию большинства
    /*
        b1 b2 b3 res
        0  0  0   0
        0  0  1   0
        0  1  0   0
        0  1  1   1
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите b1");
            boolean b1 = scanner.nextBoolean();
            System.out.println("Введите b2");
            boolean b2 = scanner.nextBoolean();
            System.out.println("Введите b3");
            boolean b3 = scanner.nextBoolean();
            boolean maj = b1 == b2 ? b1 : b3;
            System.out.println(maj);

        }
    }
}
