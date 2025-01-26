package lesson_5_string.string_pipeline;

/*
    Написать обработчик строк, позволяющий применять различные фильтры к массиву строк, и затем осуществлять
    различные агрегирующие/преобразующие операции.

    Данный интерфейс имеет два типа операций: промежуточная и терминальная.
    При вызове промежуточной операции, обработчик запоминает ее, но не применяет. Такой оператор возвращает ссылку на этот же обработчик
    При применении терминальной операции, обработчик применяет все промежуточные операторы и терминальный оператор.
    Важно, чтобы обработчик был ленивым - не выполнял никакую обработку, пока мы не вызовем терминальный оператор.
    Обработчик не должен модифицировать переданный ему массив.
    Обработчик должен быть одноразовым - после того, как выполнился терминальный оператор, нельзя больше использовать этот объект.

    Пример использования:

    String[] strings = new String[] {null, null, "   ", "", "abc", "abc3", "abc2", "abc1","aaa"};

    SimpleStringPipeline pipeline = new
        .notNulls()
        .notBlanks()
        .startsWith("abc")
        .lengthGreaterThan(3)
        .reversed()
        .addPrefix("some_prefix_");

     for(int i = 0; i < strings.length; i++) {
           System.out.println(strings[i]);
     }
     Вот что должны получить в консоли

           null
           null


           abc
           abc3
           abc2
           abc1
           aaa

    String[] newArray = pipeline.toNewSortedArray();

     for(int i = 0; i < strings.length; i++) {
           System.out.println(strings[i]);
     }

     Вот что должны получить в консоли, т.е. наш изначальный массив никак не поменялся

           null
           null


           abc
           abcd
           abcdefg
           aaa


     for(int i = 0; i < newArray.length; i++) {
           System.out.println(newArray[i]);
     }

     Вот что должны получить в консоли
        some_prefix_1cba
        some_prefix_2cba
        some_prefix_3cba

 */
public interface StringPipeline {

    /**
     * Фильтрует все null строки.
     */
    StringPipeline notNulls();

    /**
     * Фильтрует все пустые строки.
     */
    StringPipeline notEmpties();

    /**
     * Фильтрует все строки из пробельных символов.
     */
    StringPipeline notBlanks();

    /**
     * Оставляет строки, у которых длина больше переданного значения.
     */
    StringPipeline lengthGreaterThan(int bound);

    /**
     * Оставляет строки, у которых длина меньше переданного значения.
     */
    StringPipeline lengthLowerThan(int bound);

    /**
     * Оставляет строки, начинающиеся на переданный префикс.
     */
    StringPipeline startsWith(String prefix);

    /**
     * Переводит все строки в верхний регистр.
     */
    StringPipeline toUpperCase();

    /**
     * Переводит все строки в нижний регистр.
     */
    StringPipeline toLowerCase();

    /**
     * Переворачивает строки.
     */
    StringPipeline reversed();

    /**
     * Добавляет префикс.
     */
    StringPipeline addPrefix(String prefix);

    /**
     * Добавляет постфикс.
     */
    StringPipeline addPostfix(String postfix);

    /**
     * Считает оставшееся количество элементов.
     */
    int count();

    /**
     * Создает новый массив, включающий все оставшиеся строки.
     */
    String[] toNewArray();

    /**
     * Создает новый массив, включающий все оставшиеся строки в отсортированном порядке.
     * Можно использовать простой алгоритм сортировку пузырьком.
     * Для сравнения строк, использовать метод compareTo, класса String
     */
    String[] toNewSortedArray();

    /**
     * Соединяет все строки в одну через разделитель
     */
    String concat(String delimiter);

    /**
     * Группирует строки по их длине.
     * наподобие такого
     * "3" - "abc", "def", "adf"
     * "4" - "aaaa"
     */
    String[][] groupByLength();
}