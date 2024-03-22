package shop;


public record Cap(CapColor color, Manufacturer manufacturer, double price) {
    private Cap(Builder builder) {
        this(builder.color, builder.manufacturer, builder.price);
    }


    public static class Builder {
        private CapColor color;
        private Manufacturer manufacturer;
        private double price;

        public Builder color(CapColor color) {
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

        public Cap build() {
            return new Cap(this);
        }
    }
}