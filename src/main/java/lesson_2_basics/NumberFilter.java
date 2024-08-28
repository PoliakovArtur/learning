package lesson_2_basics;

import java.util.Scanner;

public class NumberFilter {
    /*
        Вводится число.
        Вывести все простые числа от 0 до введенного числа
     */
    public static void main(String[] args) {
        int value = 100;

        if(value >= 2) {
            System.out.println(2);
        }

        for (int i = 3; i < value; i+=2) {
            boolean isPrimary = true;
            for(int j = 3; j < i; j+=2) {
                if(i % j == 0) {
                    isPrimary = false;
                    break;
                }
            }
            if(isPrimary) {
                System.out.println(i);
            }
        }


        primary(100);

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число");
            int number = scan.nextInt();
            for (int j = 2; j <= number; j++) {
                if (j == 2) {
                    System.out.println(j);
                    continue;
                }
                for (int i = 2; i <= j; i++) {
                    if (j % i == 0) break;
                    if (i + 1 == j) System.out.println(j);
                }
            }
        }

               /* for (int j = 2; j < i; j++) {
                    if (number % j == 0) break;
                    if (j + 1 == i) {
                        System.out.println(number);
                    }
                }
*/


    }

    static void primary(int value) {

    }

}


