import java.util.Scanner;

public class GeometricShapeAreaCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Geometric Shape Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();

            double area = Math.PI * radius * radius;
            System.out.println("Area of Circle = " + area);

        } else if (choice == 2) {
            System.out.print("Enter side: ");
            double side = sc.nextDouble();

            double area = side * side;
            System.out.println("Area of Square = " + area);

        } else if (choice == 3) {
            System.out.print("Enter length: ");
            double length = sc.nextDouble();

            System.out.print("Enter width: ");
            double width = sc.nextDouble();

            double area = length * width;
            System.out.println("Area of Rectangle = " + area);

        } else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
