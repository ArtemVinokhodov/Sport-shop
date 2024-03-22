package shop;


public record TShirt(TShortColor color, Manufacturer manufacturer, double price) {

    private TShirt(Builder builder) {
        this(builder.color, builder.manufacturer, builder.price);
    }

    public static class Builder {
        private TShortColor color;
        private Manufacturer manufacturer;
        private double price;

        public Builder color(TShortColor color) {
            this.color = color;
            return this;
        }

        public Builder manufacturer(Manufacturer manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public TShirt build() {
            return new TShirt(this);
        }
    }
}
