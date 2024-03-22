package shop;

public record Order(TShirt tShirt, Cap cap) {
    public double getOrderTotal() {
        return tShirt.price() + cap.price();
    }
}
