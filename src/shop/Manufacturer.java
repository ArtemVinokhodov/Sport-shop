package shop;

public enum Manufacturer {
    ACTIVE_SPORTS("active_sports"),
    SMART_CAPS("smart_caps");

    public final String nameOfManufacturer;

    Manufacturer(String nameOfManufacturer) {
        this.nameOfManufacturer = nameOfManufacturer;
    }
}

