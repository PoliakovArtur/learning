package lesson_3_oop.coffee_api;

public class Syrop {

    //shift + f6 поменять нейминг везде где используется
    private String flavor;
    public static final String noneSyrop = "none";

    public Syrop(String flair) {
        this.flavor = flair;
    }

    public String getFlair() {
        return flavor;
    }

    public void setFlair(String flair) {
        this.flavor = flair;
    }
}
