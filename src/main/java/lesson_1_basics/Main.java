package lesson_1_basics;

import java.util.Scanner;

public class Main {

    // Однострочный комментарий.
    /*
        многострочный комментарий
     */

    //Метод main - точка входа. psvm

    public static void main(String[] args) {
        /*
            = - оператор присваивания
            <Тип данных> <имя> = значение;
            <Тип данных> <имя>;
            Типы данных:
                - Примитивы - представляет из себя значение в ячейки
                - Классы (объекты)
            Литерал - безымянная константа
         */

        //Виды примитивов
        //Целочисленные типы
        byte b = 12; //8 бит -128 -  +127
        short s = 4; // 16 бит -35 тыс - +35 тыс
        int i = 5; // 32 бита -2,147 - +2,147 млрд
        long l = 2_100_000_0000L; // 64 бита
        //двоичная сс
        int binary = 0b10;
        // восьмеричная
        int octal = 017;
        // Шестнадцатеричная
        int hex = 0xFF;

        // Числа с плавающей точкой
        float f = 5f; // 32 бита От ±1,5 x 10−45 до ±3,4 x 1038
        double d = 5.0; // 64 бита
        //sout
        System.out.println(0.1 + 0.2);

        //boolean логический тип
        boolean bool = true;
        boolean bool2 = false;

        //char - код символа
        char c = 232; // беззнаковый целочисленный тип 16 бит 0 - 65535
        char cc = 'a' + 'b';

        // Операции с числами
        // Арифметические операции + - * / % ( )

        int sum = (2 + 3) * (6 + 5);
        System.out.println(sum);

        int k = 17 / 9;
        System.out.println(k);

        // Инкремент и декремент -- ++

        int j = 5;

        int fs = 5 + ++j;
        System.out.println(fs);
        System.out.println(j);

        // логические операторы

        /*
            & - И
            | - ИЛИ
            ^ - Исключающее ИЛИ
            > - больше
            < - Меньше
            >= - Меньше либо равно
            <= - Больше либо равно
            == - Эквивалентность
            && - Не проверяет второй операнд если первый false
            || - Не проверяет второй операнд если первый true
         */
            boolean b1 = 2 > 3;
            boolean b2 = true ^ false;

            String str = "abc" + 3;

            System.out.println(str);

            // Условный оператор

        if(octal > hex) {
            int is = 3;
        } else {

        }
        Scanner scanner = new Scanner(System.in);

        System.out.println(scanner.nextInt());

        while (true) {

        }
    }
}
