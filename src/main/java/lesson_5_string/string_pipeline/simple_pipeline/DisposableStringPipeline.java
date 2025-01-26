package lesson_5_string.string_pipeline.simple_pipeline;

import lesson_5_string.string_pipeline.StringPipeline;
import lesson_5_string.string_pipeline.simple_pipeline.operations.NotNullFilter;

public class SimpleStringPipeline implements StringPipeline {

    private final String[] source;
    //Список операций храним в массиве. Если массив заполнился, то создаем новый в полтора раза больше и перекладываем туда все элементы.
    //Чтобы переложить элементы использовать метод System.arraycopy или посмотреть более удобные методы класса Arrays.
    private StringOp[] operations;
    private int opIndex = -1;
    private int size;

    private boolean isClosed;

    private static final int DEFAULT_CAPACITY = 5;
    private static final float INCREASE_FACTOR = 1.5f;

    public SimpleStringPipeline(String[] source, int capacity) {
        this.source = source;
        this.operations = new StringOp[capacity];
        this.size = capacity;
    }

    public SimpleStringPipeline(String[] source) {
        this(source, DEFAULT_CAPACITY);
    }

    @Override
    public StringPipeline notNulls() {
        return addAction(new NotNullFilter());
    }

    @Override
    public StringPipeline notEmpties() {
        return null;
    }

    @Override
    public StringPipeline notBlanks() {
        return null;
    }

    @Override
    public StringPipeline lengthGreaterThan(int bound) {
        return null;
    }

    @Override
    public StringPipeline lengthLowerThan(int bound) {
        return null;
    }

    @Override
    public StringPipeline startsWith(String prefix) {
        return null;
    }

    @Override
    public StringPipeline toUpperCase() {
        return null;
    }

    @Override
    public StringPipeline toLowerCase() {
        return null;
    }

    @Override
    public StringPipeline reversed() {
        return null;
    }

    @Override
    public StringPipeline addPrefix(String prefix) {
        return null;
    }

    @Override
    public StringPipeline addPostfix(String postfix) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public String[] toNewArray() {
        return new String[0];
    }

    @Override
    public String[] toNewSortedArray() {
        return new String[0];
    }

    @Override
    public String concat(String delimiter) {
        return null;
    }

    @Override
    public String[][] groupByLength() {
        return new String[0][];
    }

    private StringPipeline addAction(StringOp op) {
        if (isClosed) {
            return this;
        }
        //логика по добавлению операции
        return null;
    }
}
