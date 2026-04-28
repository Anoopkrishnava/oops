import graphics.*;

public class TestGraphics {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        Shape square = new Square(4);
        Shape triangle = new Triangle(6, 2);
        Shape circle = new Circle(3);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Circle Area: " + circle.getArea());
    }
}