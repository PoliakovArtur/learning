package lesson_3_oop.animals.example;

public class ElectroBus extends Bus {

    static {
        System.out.println("Cal static init block 1 in ElectroBus");
    }

    static {
        System.out.println("Cal static init block 2 in ElectroBus");
    }

    {
        System.out.println("Cal init block 1 in ElectroBus");
    }

    {
        System.out.println("Cal init block 2 in ElectroBus");
    }

    public ElectroBus() {
        System.out.println("Call constructor in ElectroBus");
    }
}