package lesson_4_object.tasks.house_builder;

/*
    Реализовать шаблон проектирования построитель.
    Данный шаблон служит для того, чтобы упростить создание сложных объектов.
    У нас есть класс дом, у которого много полей, и мы хотим, чтобы у нас была возможность
    создавать экземпляр дома, инициализируя только нужные нам поля, а не все сразу. Т.е. предполагается,
    что не все поля могут быть заполнены.

    Создать конструкторы на все возможные комбинации полей не вариант.

    Построитель - это обычно вложенный статический класс, который как раз решает данную проблему.
    Он содержит у себя копии всех полей класса, создается конструктором по умолчанию.
    Затем мы вызываем у него методы для установки нужных нам свойств, и в нужный момент вызываем метод build(),
    который создаст нам наш объект. Обычно, в конструируемом классе создается конструктор со всеми параметрами и
    построитель использует его при вызове build(). Также построитель возвращает всегда ссылку на себя, что позволяет
    сделать код более читаемым. Вот как выглядит использование построителя:

    House house = House.builder()
        .address("some address")
        .yearBuilt(1990)
        .ownerName("name")
        .build();

 */
public class House {

    private String address;
    private String ownerName;
    private int yearBuilt;
    private int numberOfRooms;
    private double squareFootage;
    private boolean hasGarage;
    private boolean hasGarden;
    private String roofType;
    private String exteriorColor;
    private int numberOfFloors;
    private boolean hasBasement;
    private boolean hasPool;
    private String heatingType;
    private String coolingType;
    private String flooringType;
    private boolean hasFireplace;
    private boolean hasAlarmSystem;
    private String foundationType;
    private boolean hasBalcony;
    private boolean isFurnished;
    private String buildingMaterial;
    private String zoningType;
    private boolean isForSale;
    private double salePrice;
    private String propertyTaxRate;

    public String getAddress() {
        return address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public String getRoofType() {
        return roofType;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isHasBasement() {
        return hasBasement;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public String getHeatingType() {
        return heatingType;
    }

    public String getCoolingType() {
        return coolingType;
    }

    public String getFlooringType() {
        return flooringType;
    }

    public boolean isHasFireplace() {
        return hasFireplace;
    }

    public boolean isHasAlarmSystem() {
        return hasAlarmSystem;
    }

    public String getFoundationType() {
        return foundationType;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public String getBuildingMaterial() {
        return buildingMaterial;
    }

    public String getZoningType() {
        return zoningType;
    }

    public boolean isForSale() {
        return isForSale;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public String getPropertyTaxRate() {
        return propertyTaxRate;
    }
}