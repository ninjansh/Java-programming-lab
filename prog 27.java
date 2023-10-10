// 
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

  
    public double area() {
        return side * side; 
    }

  
    public double perimeter() {
        return 4 * side; 
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
    }
}
