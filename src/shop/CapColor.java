package shop;

public enum CapColor {
    CAP_COLOR_BLACK("black"),
    CAP_COLOR_WHITE("white");

    CapColor(String nameCapColor) {
        this.nameCapColor = nameCapColor;
    }

    public final String nameCapColor;
}
