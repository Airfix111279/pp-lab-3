import geometry.Square;

public class zad6 {
    public static void main(String[] args) {
        double sideLength = 5.0;
        Square square = new Square(sideLength);

        System.out.println("Side Length: " + sideLength);
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());
    }
}