package lesson_3_oop;

//<Модификаторы> class <Имя класса>

//переименовать класс или переменную shift f6

class Employee {

    {
        System.out.println("init 1");
    }

    {
        System.out.println("init 2");
    }

    /*
    1. Поля
    2. Методы
    3. Конструкторы
    4. Блоки инициализации
    5. Вложенные классы

    <Модификаторы> <Тип> <Имя>;
     */

    private String name;
    String email;
    int age;
    int salary;
    Document document;

    Employee() {

    }

    Employee(String name, String email, int age, int salary) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;

        System.out.println("init 2");
    }


    /*
    Значения по умолчанию у полей:
        Объекты - null
        числовые примитивы - 0
        boolean - false
     */

    /*
        Метод
        <Модификаторы> <Тип возвращаемого значения> <Имя>(Аргументы) {}
     */

    //метод с аргументами

    int calculateSalaryFromAllWorkingPeriod(int monthCount) {
        return monthCount * salary;
    }

    //метод без аргументов

    String getName() {
        String name = "a";
        //ключевое слово this - ссылка на себя же
        return this.name;
    }

    //метод который ничего не возвращает

    void printInfo() {
        System.out.println(name + " " + email + " " + age + " " + salary);
    }

    void printInfo(String delimiter) {
        System.out.println(name + delimiter + email + delimiter + age + delimiter + salary);
    }

    void addDocument(String series, String number) {
        document = new Document(series, number);
    }

    Document getDocument() {
        return document;
    }

    // alt + insert

    class Document {
        String series;
        String number;

        public Document(String series, String number) {
            this.series = series;
            this.number = number;
        }

        void printOwnerInfo() {
            System.out.println(name + " " + email + " " + age + " " + salary);
        }
    }

}
