class AreaCalculator {

    // Area of Circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of Rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Area of Triangle
    double area(double base, double height, String shape) {
        return 0.5 * base * height;
    }
}

public class AreaOverloading {
    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();

        // Circle
        double circleArea = obj.area(5.0);
        System.out.println("Area of Circle: " + circleArea);

        // Rectangle
        double rectangleArea = obj.area(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Triangle
        double triangleArea = obj.area(3.0, 4.0, "triangle");
        System.out.println("Area of Triangle: " + triangleArea);
    }
}