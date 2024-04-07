import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

public class zad4{
    public static void main(String[] args) {
        // Tworzenie tablicy obiektów Circle i ColoredCircle
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(0, 0), 5.0);
        circles[1] = new ColoredCircle(new Point(2, 2), 3.0, "red");
        circles[2] = new ColoredCircle(new Point(-3, 1), 4.0, "green");

        // Iteracja przez tablicę i wywoływanie metody calculateArea()
        for (Circle circle : circles) {
            double area = circle.getArea();
            System.out.println("Area: " + area);

            // Jeśli element jest instancją ColoredCircle, wywołaj metodę getColor()
            if (circle instanceof ColoredCircle) {
                String color = ((ColoredCircle) circle).getColor();
                System.out.println("Color: " + color);
            }
        }
    }
}