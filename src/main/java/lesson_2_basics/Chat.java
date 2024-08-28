package lesson_2_basics;

import java.util.Scanner;

public class Chat {

    /*
        Реализовать чат бот.
        Человек вводит строку Привет.
        Ему отвечают Привет.
        Ввод: Как дела?
        Ответ: Хорошо как у тебя

        Если ввод не известен выводится Не понимаю :(
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String phrase = scanner.nextLine();
            switch (phrase) {
                case ("Привет.")  -> System.out.println("Привет.");
                case ("Как дела?") -> System.out.println("Хорошо как у тебя");
                default -> System.out.println("Не понимаю :(");
            }
        }
    }
}