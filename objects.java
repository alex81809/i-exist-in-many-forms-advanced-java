import java.util.Scanner;

// Abstract class
abstract class Objects {

    // Abstract methods
    abstract void showShape();
    abstract double calculateVolume();

    // Normal method
    public void shape() {
        System.out.println("I am from the abstract class.");
    }

    public void displayVolume() {
        System.out.println("Volume: " + calculateVolume());
    }
}

// Sphere class
class Sphere extends Objects {

    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }
    @Override
    void showShape() {
        System.out.println("Object type is Sphere");
    }
    @Override 
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }
}

// Cuboid class
class Cuboid extends Objects {
    double length;
    double width;
    double height;

    Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    @Override
    void showShape() {
        System.out.println("Object type is Cuboid");
    }
    @Override
    double calculateVolume() {
        return length * width * height;
    }

    public void displayDetails() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}


// Prism class
class Prism extends Objects {
    double baseArea;
    double height;

    Prism(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    @Override
    void showShape() {
        System.out.println("Object type is Prism");
    }

    @Override
    double calculateVolume() {
        return baseArea * height;
    }

    public void displayDetails() {
        System.out.println("Base Area: " + baseArea);
        System.out.println("Height: " + height);
    }
}

// Main class
public class objects {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== Shape Information System =====");
        System.out.println("1. Sphere");
        System.out.println("2. Cuboid");
        System.out.println("3. Prism");

        System.out.print("Choose a shape: ");
        int choice = input.nextInt();

        Objects obj;

        if (choice == 1) {
            System.out.print("Enter radius: ");
            double radius = input.nextDouble();

            obj = new Sphere(radius);
        } else if (choice == 2) {
            System.out.print("Enter length: ");
            double length = input.nextDouble();

            System.out.print("Enter width: ");
            double width = input.nextDouble();

            System.out.print("Enter height: ");
            double height = input.nextDouble();

            obj = new Cuboid(length, width, height);
        } else if (choice == 3) {

            System.out.print("Enter base area: ");
            double baseArea = input.nextDouble();

            System.out.print("Enter height: ");
            double height = input.nextDouble();

            obj = new Prism(baseArea, height);
        } else {
            System.out.println("Invalid choice!");
            input.close();
            return;
        }

        System.out.println("\n===== Shape Details =====");

        obj.showShape();
        obj.shape();
        obj.displayVolume();

        input.close();
    }
}
