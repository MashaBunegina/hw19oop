public enum Capacity {N1( 0D, 3.5),N2 (3.5, 12),N3( 12, 30);
    private double from;
    private double to;

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    Capacity(double from, double to) {
        this.from = from;
        this.to = to;
    }
}
