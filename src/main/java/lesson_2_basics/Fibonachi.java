package lesson_2_basics;

import java.util.Scanner;

public class Fibonachi {
    // вводится номер числа фибоначи. вывести это число
    /*
    1 2 3 4 5 6
    1 1 2 3 5 8
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер числа");
            int index = scan.nextInt();
            int fibNumber = 1;
            int lastNumber = 0;
            for (int i = 1; i <= index - 1; i++) {
                fibNumber += lastNumber;
                lastNumber = fibNumber - lastNumber;
            }
            if (index > 0) {
                System.out.println(fibNumber);
            }
        }
    }
}
