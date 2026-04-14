import java.util.Scanner;

interface Shape {
    double calculateArea();
}


class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Square implements Shape {
    double side;

    Square(double s) {
        side = s;
    }

    public double calculateArea() {
        return side * side;
    }
}


public class project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Shape:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Shape shape;

        if (choice == 1) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            shape = new Circle(r);

        } else if (choice == 2) {
            System.out.print("Enter side: ");
            double s = sc.nextDouble();
            shape = new Square(s);

        } else {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.println("Area = " + shape.calculateArea());
    }
}