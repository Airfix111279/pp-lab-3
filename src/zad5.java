import geometry.Rectangle;

public class zad5 {
    public static void main(String[] args) {
        double length = 5.0;
        double width = 3.0;
        Rectangle rectangle = new Rectangle(length, width);

        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}