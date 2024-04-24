public class Main {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(4, 6);
    System.out.println("Rectangle Area: " + rectangle.calculateArea());
    System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

    Parallelogram parallelogram = new Parallelogram(4, 5);
    System.out.println("\nParallelogram Area: " + parallelogram.calculateArea());
    System.out.println("Parallelogram Perimeter: " + parallelogram.calculatePerimeter());

    Square square = new Square(5);
    System.out.println("\nSquare Area: " + square.calculateArea());
    System.out.println("Square Perimeter: " + square.calculatePerimeter());

    Triangle triangle = new Triangle(6);
    System.out.println("\nEquilateral Triangle Area: " + triangle.calculateArea());
    System.out.println("Equilateral Triangle Perimeter: " + triangle.calculatePerimeter());
  }
}
