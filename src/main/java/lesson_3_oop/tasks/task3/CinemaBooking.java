package lesson_3_oop.tasks.task3;

/*
    Реализовать класс для возможности бронирования мест в кинотеатре.
    Бронирование мест происходит по идентификатору пользователя. В данном случае идентификатором будет целое положительное число. Считаем, что
    у каждого пользователя уникальный идентификатор.
    Сами места хранятся в массиве int[][]. если значение равно 0, то значит место свободно. При бронировании в ячейку записывается
    идентификатор пользователя. Также один пользователь может забронировать больше одного места.
    При создании Кинотеатра передается два числа: количество рядов и количество мест в ряду
    Реализовать методы:
    1. Просмотр свободных мест. Выводит информацию в виде:

           1 2 3 4 5 6 7 8
       A   С С С З С С С С
       B   С С С С С С С С
       C   С З С С С С С С
       D   С С С С С З С С
       E   С С С З З С С С

       ряды нумеруются буквами, а места цифрами. для представления рядов использовать char
       Подсказка. Cимволы латиницы расположены по порядку в кодировке, которую использует char, т.е. 'b' - 'a' будет равно 1. соответственно,
       отображение ряда можно выводить так (char) ('a' + индекс ряда в массиве)
      2. Бронирование места. Принимает идентификатор пользователя, символ ряда, и номер места и записывает в ячейку значение идентификатора, если место свободно.
      3. Вывод всех забронированных мест по идентификатору пользователя.
      4. Снятие брони по идентификатору на конкретное место
      5. Снятие брони по идентификатору всех мест, забронированных пользователем

      Пример работы:
      CinemaBooking cinemaBooking = new CinemaBooking(5, 5);
      cinemaBooking.book(123, 'B', 4); // Место забронировано
      cinemaBooking.printInfo();
           1 2 3 4 5
       A   С С С С С
       B   С С С З С
       C   С С С С С
       D   С С С С С
       E   С С С С С
       cinemaBooking.book(123, 'B', 4); // Вывод в консоль: Место уже забронировано
       cinemaBooking.unBook(123, 'B', 4); // Бронь снята
       cinemaBooking.book(123, 'B', 3); // Место забронировано
       cinemaBooking.book(123, 'B', 2); // Место забронировано
       cinemaBooking.book(123, 'D', 4); // Место забронировано
       cinemaBooking.printInfo(123); // B3 B2 D4

 */
public class CinemaBooking {

}