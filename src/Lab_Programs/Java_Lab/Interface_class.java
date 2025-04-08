package Lab_Programs.Java_Lab;

// Interface for calculating area
interface IArea {
    double calculateArea();
}

// Interface for calculating perimeter
interface IPerimeter {
    double calculatePerimeter();
}

// Circle class implementing IArea and IPerimeter
class Circle implements IArea, IPerimeter {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Square class implementing IArea and IPerimeter
class Square implements IArea, IPerimeter {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

// Rectangle class implementing IArea and IPerimeter
class Rectangle implements IArea, IPerimeter {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Main class to test the implementation
public class Interface_class {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        Square square = new Square(4);
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());

        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}
