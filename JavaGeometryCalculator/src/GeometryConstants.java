public enum GeometryConstants {
    PI(3.14159265359);

    private final double value;

    GeometryConstants(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
