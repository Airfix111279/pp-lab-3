class Point {
    private double x;
    private double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    
    public double getX() {
        return x;
    }

    
    public double getY() {
        return y;
    }


    public void setX(double x) {
        this.x = x;
    }

    
    public void setY(double y) {
        this.y = y;
    }
}


public class zad1 {
    public static void main(String[] args) {
       
        Point point = new Point(3.5, 2.0);

        
        System.out.println("Współrzędne punktu:");
        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());
    }
}
