class Parallelogram extends Polygon {
    public Parallelogram(double base, double height) {
        super(base, height, base, height);
    }

    @Override
    public double calculateArea() {
        return sides[0] * sides[1];
    }
}
