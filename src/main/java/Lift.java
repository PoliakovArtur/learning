import java.util.Scanner;

public class Lift {
    //

    /*
    Реализовать программу лифт. Пользователь вводит номер этажа, например, он находится на 1 этаже
    и вводит 5, ему отображает 1 2 3 4 5 Вы приехали.

     */
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите начальный этаж");
            int startFloor = scan.nextInt();
            System.out.println("Введите конечный этаж");
            int desiredFloor = scan.nextInt();
            String Ending = "Приехали!";
            if (startFloor < desiredFloor) {
                while (startFloor != (desiredFloor + 1)) {
                    System.out.println(startFloor++);
                }
            } else {
                while (startFloor != (desiredFloor - 1)) {
                    System.out.println(startFloor--);
                }
            }
            System.out.println(Ending);
        }
    }
}