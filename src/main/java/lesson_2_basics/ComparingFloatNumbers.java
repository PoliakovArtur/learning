package lesson_2_basics;

import java.util.Scanner;

public class ComparingFloatNumbers {

    /*
        Проверить соответствует ли помещение значению освещенности. Оно должно быть равно 5.0;

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        double coef = 0.2;

        System.out.println(value * coef == 5.0);

    }
}
