package lesson_3_oop.tasks.task1;

/*
    Реализовать класс Парковка.
    При создании объекта в него передается размер парковки в виде количества мест.
    После создания объекта размер парковки не должен меняться.
    Реализовать следующие методы:
    1.  Завоз автомобиля на парковку. При вызове данного метода счетчик свободных мест уменьшается на один если кол-во > 0. Если
    свободных мест нет, то автомобиль встает в очередь(реализовать просто отдельной переменной количество автомобилей в очереди).
    Необходимо выводить в консоль информацию об удачном завозе автомобиля или о постановке автомобиля в очередь.
    2. Вывоз автомобиля с парковки. Увеличивает счетчик свободных мест на 1, но не более чем размер парковки.
        Когда место освобождается, то завозится автомобиль из очереди, если она не пуста.
    3. Получение текущего количества свободных мест
    4. Получение размера парковки
    5. Получение количества автомобилей в очереди
    6. Вывод информации в консоль о состоянии парковки: всего мест, кол-во свободных мест, кол-во автомобилей, кол-во
    автомобилей в очереди
    7. Метод проверки возможности завоза автомобиля на парковку

    Ограничить доступ к данным объекта, чтобы нельзя было "сломать" объект.
    Добавить проверки в случае ввода некорректных данных и выводить информацию об ошибке. Например, если при создании передать отрицательное число,
    вывести информацию об ошибке, и создать парковку с размером по умолчанию. Значение по умолчанию хранить в качестве константы

    Пример работы:
    Parking parking = new Parking(2, "A1");
    parking.addCar(); //Вывод в консоль: Автомобиль завезен! Свободных мест 1
    parking.dropCar(); //Вывод в консоль: Автомобиль Вывезен! Свободных мест 2
    parking.addCar(); //Вывод в консоль: Автомобиль завезен! Свободных мест 1
    parking.addCar(); //Вывод в консоль: Автомобиль завезен! Свободных мест 0
    parking.addCar(); //Вывод в консоль: Свободных мест 0. Автомобиль добавлен в очередь.
    parking.dropCar(); //Вывод в консоль: Автомобиль Вывезен! Завезен автомобиль с очереди. Свободных мест 0
    parking.addCar(); //Вывод в консоль: Нет свободных мест. Автомобиль добавлен в очередь.
    System.out.println(parking.size()); Вывод в консоль: 2
    System.out.println(parking.freeSpace()); Вывод в консоль: 0
    System.out.println(parking.queueSize()); Вывод в консоль: 1
    System.out.println(parking.isEnableToAddCar()); Вывод в консоль: false
    parking.printInfo(); Вывод в консоль: Всего мест: 2 Свободных мест: 0 Количество припаркованных автомобилей: 2 Количество автомобилей в очереди: 1
*/
public class Parking {

    final static int DEFAULT_SIZE = 2;
    private int queue;
    private int size;
    private int freeSpaces;

    public Parking(int size) {
        if (size > 0) this.size = size;
        else {
            System.out.println("Введены некорректные данные. Будет создана парковка с размером по умолчанию");
            this.size = DEFAULT_SIZE;
        }
        this.freeSpaces = this.size;
    }

    public int getFreeSpaces() {
        return freeSpaces;
    }

    public int getSize() {
        return size;
    }

    public int getQueue() {
        return queue;
    }

    public boolean isNewCarAvailable() {
        return freeSpaces > 0;
    }

    public void addCar() {
        if (freeSpaces > 0) {
            freeSpaces -= 1;
            System.out.println("Машина помещена на парковку; осталось " + freeSpaces + " мест.");
        } else {
            queue += 1;
            System.out.println("Свободных мест нет. Машин в очереди: " + queue);
        }
    }

    public boolean dropCar() {
        if (freeSpaces == size) {
            System.out.println("Выезд невозможен; нет машин на парковке");
            return false;
        } else if (queue == 0) {
            freeSpaces += 1;
            System.out.println("Машина выехала с парковки; осталось " + freeSpaces + " мест");
        } else {
            queue -= 1;
            System.out.println("Машина выехала с парковки; машина из очереди заехала на парковку. Машин в очереди: " + queue);
        }
        return true;
    }


    public void parkingInfo() {
        System.out.println("Размер парковки: " + size);
        System.out.println("Свободных мест: " + freeSpaces);
        System.out.println("Всего машин на парковке: " + (size - freeSpaces));
        System.out.println("Машин в очереди: " + queue);
    }


}
/*
    public static void main(String[] args) {
        // метод System.out.println после вывода выполняет перенос на другую строку
        // есть также метод System.out.print, который не выполняет переноса

        System.out.print(0);
        System.out.println(1);
        System.out.print(2);
        System.out.print(3);

        //для управления переносами можно использовать спец символ \n
        System.out.print("abc\nabc\nabc");

        //Также с версии Java SE 15 доступны текстовые блоки:
        System.out.println("""
                
                Какой то текст.
                Какой то текст.
                Какой то текст.
                
                """);
   */