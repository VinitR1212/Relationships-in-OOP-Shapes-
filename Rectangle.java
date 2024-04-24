class Rectangle extends Polygon {
    public Rectangle(double length, double width) {
        super(length, width, length, width);
    }

    @Override
    public double calculateArea() {
        return sides[0] * sides[1];
    }
}
