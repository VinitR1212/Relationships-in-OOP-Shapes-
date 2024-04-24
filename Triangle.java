class Triangle extends Polygon {
    public Triangle(double side) {
        super(side, side, side);
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]));
    }
}
