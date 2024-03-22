package shop;

public class Main {
    public static void main(String[] args) {
        TShirt redTShirt = new TShirt.Builder()
                .color(TShortColor.T_SHORT_COLOR_RED)
                .manufacturer(Manufacturer.ACTIVE_SPORTS)
                .price(25.0)
                .build();
        Cap whiteCap = new Cap.Builder()
                .color(CapColor.CAP_COLOR_WHITE)
                .manufacturer(Manufacturer.SMART_CAPS)
                .price(15.0)
                .build();
        Order orderA = new Order(redTShirt, whiteCap);

        TShirt blueTShirt = new TShirt.Builder()
                .color(TShortColor.T_SHORT_COLOR_BLUE)
                .manufacturer(Manufacturer.ACTIVE_SPORTS)
                .price(30.0)
                .build();
        Cap blackCap = new Cap.Builder()
                .color(CapColor.CAP_COLOR_BLACK)
                .manufacturer(Manufacturer.SMART_CAPS)
                .price(20.0)
                .build();
        Order orderB = new Order(blueTShirt, blackCap);

        displayOrder(orderA, "Order A");
        displayOrder(orderB, "Order B");
    }

    private static void displayOrder(Order order, String orderName) {
        System.out.println(orderName);
        System.out.println("T-Shirt: " + order.tShirt().color().nameTSortColor +
                ", Manufacturer: " + order.tShirt().manufacturer().nameOfManufacturer +
                ", Price: " + order.tShirt().price());
        System.out.println("Cap: " + order.cap().color().nameCapColor +
                ", Manufacturer: " + order.cap().manufacturer().nameOfManufacturer +
                ", Price: " + order.cap().price());
        System.out.println("Total Price: " + order.getOrderTotal());
        System.out.println();
    }
}