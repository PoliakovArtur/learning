package lesson_5_string.string_pipeline.simple_pipeline;

public class StringContainer {

    private final String value;
    private final boolean isExists;

    private static final StringContainer EMPTY_CONTAINER = emptyContainer();

    public StringContainer(String value) {
        this.value = value;
        this.isExists = true;
    }

    public StringContainer() {
        this.value = null;
        this.isExists = false;
    }

    public String getValue() {
        return value;
    }

    public boolean isExists() {
        return isExists;
    }

    public static StringContainer valueOf(String value) {
        return new StringContainer(value);
    }

    public static StringContainer emptyContainer() {
        return emptyContainer();
    }

}