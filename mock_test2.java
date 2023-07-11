abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class ShapeCalculator {
    public void printArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("The area of the shape is " + area);
    }
}

public class mock_test2 {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        // Creating instances of different subclasses
        Rectangle rectangle = new Rectangle(4, 6);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 8);

        // Passing instances to the printArea() method
        calculator.printArea(rectangle);
        calculator.printArea(circle);
        calculator.printArea(triangle);
    }
}
