import java.util.Scanner;

// Interface
interface Shape {
    void area();
    void perimeter();
}

// Circle class
class Circle implements Shape {
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    public void area() {
        float area = 3.14f * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public void perimeter() {
        float perimeter = 2 * 3.14f * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}

// Rectangle class
class Rectangle implements Shape {
    float length, breadth;

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        float area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void perimeter() {
        float perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

// Main class (menu-driven)
public class InterfaceShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    float r = sc.nextFloat();
                    Shape c = new Circle(r);
                    c.area();
                    c.perimeter();
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    float l = sc.nextFloat();
                    System.out.print("Enter breadth: ");
                    float b = sc.nextFloat();
                    Shape rect = new Rectangle(l, b);
                    rect.area();
                    rect.perimeter();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}