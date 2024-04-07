import geometry.Circle;
import geometry.Point;

public class zad2 {
    public static void main(String[] args) {
        Point center = new Point(0, 0);
        double radius = 5.0;
        Circle circle = new Circle(center, radius);

        System.out.println("Center: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Area: " + circle.getArea());
    }
}