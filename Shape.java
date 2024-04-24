public abstract class Shape
  {
    protected double[] sides;

    public Shape(double... sides) {
        this.sides = sides;
    }

    public abstract double calculateArea();

    public double calculatePerimeter() {
        double perimeter = 0;
        for (double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }
}
