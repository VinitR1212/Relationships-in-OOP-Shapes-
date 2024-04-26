import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Select a shape to calculate:");
    System.out.println("1. Rectangle");
    System.out.println("2. Parallelogram");
    System.out.println("3. Square");
    System.out.println("4. Equilateral Triangle");
    int choice = scanner.nextInt();

    double[] dimensions;
    switch (choice) {
      case 1:
        dimensions = getDimensions("length", "width");
        Rectangle rectangle = new Rectangle(dimensions[0], dimensions[1]);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        break;
      case 2:
        dimensions = getDimensions("base", "height");
        Parallelogram parallelogram = new Parallelogram(dimensions[0], dimensions[1]);
        System.out.println("Parallelogram Area: " + parallelogram.calculateArea());
        System.out.println("Parallelogram Perimeter: " + parallelogram.calculatePerimeter());
        break;
      case 3:
        double side = getSingleDimension("side");
        Square square = new Square(side);
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());
        break;
      case 4:
        side = getSingleDimension("side");
        Triangle triangle = new Triangle(side);
        System.out.println("Equilateral Triangle Area: " + triangle.calculateArea());
        System.out.println("Equilateral Triangle Perimeter: " + triangle.calculatePerimeter());
        break;
      default:
        System.out.println("Invalid choice!");
    }

    scanner.close();
  }

  private static double[] getDimensions(String... dimensionNames) {
    Scanner scanner = new Scanner(System.in);
    double[] dimensions = new double[dimensionNames.length];
    for (int i = 0; i < dimensionNames.length; i++) {
      System.out.print("Enter " + dimensionNames[i] + ": ");
      dimensions[i] = scanner.nextDouble();
    }
    return dimensions;
  }

  private static double getSingleDimension(String dimensionName) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter " + dimensionName + ": ");
    return scanner.nextDouble();
  }
}
