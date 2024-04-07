import geometry.ColoredCircle;
import geometry.Point;

public class zad3 {
    public static void main(String[] args) {
        Point center = new Point(0, 0);
        double radius = 5.0;
        String color = "blue";
        ColoredCircle coloredCircle = new ColoredCircle(center, radius, color);

        System.out.println("Center: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Radius: " + coloredCircle.getRadius());
        System.out.println("Color: " + coloredCircle.getColor());
        System.out.println("Perimeter: " + coloredCircle.calculatePerimeter());
        System.out.println("Area: " + coloredCircle.getArea());
    }
}