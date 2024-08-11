import java.util.Scanner;

public class Palindrome {
    /*
        Вводится число, вывести на экран, является ли оно палиндромом.
        131 - палиндром
        132 - не палиндром
     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите число");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            int mod, div, invNumber = 0;
            div = number;
            while (div != 0) {
                mod = div % 10;
                div = div / 10;
                invNumber = invNumber * 10 + mod;
            }
            if (number == invNumber) {
                System.out.println("Число является палиндромом");
            } else {
                System.out.println("Число не является палиндромом");
            }
        }
    }
}