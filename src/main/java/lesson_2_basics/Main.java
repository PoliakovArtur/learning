package lesson_2_basics;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.Float.NEGATIVE_INFINITY;
import static java.lang.Float.POSITIVE_INFINITY;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            System.out.println("iter");
        } while (i <= 0);

        //fori
        /*
            1. инициализация
            2. проверка условия
            3. итерация
            4. инкремент/декремент
            5. проверка условия
            6. итерация
            7. инкремент/декремент
            ...
         */

        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        //Тернарный оператор

        int k = 1;

        String s = k == 1 ? "k = 1" : "k не равно 1";

        //оператор switch

        switch (k) {
            case 1 -> System.out.println("k = 1");
            case 2 -> System.out.println("k = 2");
            default -> System.out.println("ошибка");
        }

        switch (k) {
            case 1: {
                System.out.println("abc");
                break;
            }
            case 2: {
                System.out.println("asfd");
                break;
            }
        }

        String message = switch (k) {
            case 1 -> {
                yield "k = 1";
            }
            case 2 -> "k = 2";
            default -> "ошибка";
        };

        //break и continue
        System.out.println("break");
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
            if (j == 5) {
                break;
            }
        }

        System.out.println("continue");
        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0) {
                continue;
            }
            System.out.println(j);
        }

        //labels
        System.out.println("label");
        LOOP:
        for (int j = 0; j < 10; j++) {
            for (int l = 0; l < 10; l++) {
                System.out.println(l);
                if (j == 1) {
                    continue LOOP;
                }
            }
        }
        System.out.println("labels 2");
        int abc = 5;

        System.out.println("start one");
        ONE:
        {
            System.out.println("start two");
            TWO:
            {
                System.out.println("start three");
                THREE:
                {
                    if (abc == 5) {
                        break ONE;
                    }
                }
                System.out.println("end three");
            }
            System.out.println("end two");
        }
        System.out.println("end one");

        // как устроены целочисленные типы

        /*
            byte -128 - +127
            0000 0000
            0 - плюс
            1 - минус
            1111 1111 - -1
            1111 1110 - -2
            1000 0000 - -128

            2 -1
            1111 1111 + 0000 0010 = 0000 0001
         */



        //Побитовые операторы

        /*
            | - побитовое или
            & - побитовое и
            ^ - исключающее или
            ~ - не
            >> - сдвиг вправо с учетом знака
            >>> - сдвиг вправо без учета знака
            << - сдвиг влево
         */
        int isDark = 0b1;
        int isNotifying= 0b10;

        System.out.println(isDark | isNotifying);

        //1110 1000 >> 1 = 1111 0100
        //0000 0010 >> 1 = 0000 0001

        System.out.println("bit operators");
        System.out.println(-12 >> 2);

        int i1 = 1_500_000_000;
        int i2 = 1_500_000_000;
        System.out.println((i1 + i2) >>> 1);

        System.out.println(Integer.toBinaryString(i1));
        System.out.println(Integer.toBinaryString((i1 + i2)));

        //операторы присваивания *= /= %= += -= &= |= ^=

        int k1 = 6;

        k1 *= 5; // тоже что и k1 = k1 * 5

        //выполняется справа налево
        int a = 2, b = 2, c = 2;
        a *= b *= c *= 5;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(~-1);
        System.out.println(-~1);

        //float и double

        /*
        float
        1 бит - знак
        8 бит - экспонента
        23 бит - мантисса
        5f
        Нормализованный вид - мантисса >= 1 и < 10

        101 =  1.01 * 10^10
        смещенная экспонента = 127 + степень
        0111 1111

        Результат
        знак  см эксп  мант
        0     10000001 01000000...

        double
        1 бит - знак
        11 бит - экспонента
        52 бита - мантисса

        отр бесконечность 1 1111 1111 00000000
        пол бесконечность 0 1111 1111 00000000
        NaN - Not a number 0/1 1111 1111 ......
         */

        System.out.println(Integer.toBinaryString(Float.floatToIntBits(Float.NaN)));
        System.out.println(NEGATIVE_INFINITY + POSITIVE_INFINITY);

        float f= 55555f;

        for (int j = 0; j < 1000000; j++) {
            f += f;
        }
        System.out.println(f);


   /*     float f1 = 4000f;
        float f2 = 0.00001f;

        while (f1 <= 4001f) {
            f1 += f2;
        }
        System.out.println(f1);*/

        /*
            0 1000 1001 0100000....
            0 0000 0001 0000001...

            0
            0.3 * 2 = 0.6 * 2 = 1.2 * 2 = 0.4
            0
         */

        System.out.println(0.3f);
        System.out.println(Integer.toBinaryString(Float.floatToIntBits(0.3f)));

        //Неявное преобразование
        /*
         byte -> short -> int -> long -> float -> double
                            ^
                            |
                           char
         */

        long l = 4000000000000000001L;
        float longToFloat = l;

        System.out.println(longToFloat);

        //явное преобразует один тип в любой другой
        long l2 = (long) 5.98989;

        System.out.println(l2);

        System.out.println((byte) 257);


    }
}
