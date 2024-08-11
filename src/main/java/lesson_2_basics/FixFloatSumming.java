package lesson_2_basics;

import java.util.Random;
import java.util.Scanner;

public class FixFloatSumming {

    /*
        Программа прибавляет к числу float 4000 число 0.00005 n * 2 кол-во раз
        где n - введенное пользователем число.
        Исправить программу таким образом, чтобы сложение производилось корректно, без погрешности.
        Нельзя использовать double
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float f = 4000f;

        for(int nextInt = scanner.nextInt() << 1; nextInt > 0; nextInt--) {
            f += 0.00005;
        }
        System.out.println(f);
    }
}
