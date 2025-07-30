public class Circle {
    private static int count=0;
    private double radius;
    private double x_coordinate;
    private double y_coordinate;
    private int index;
    public double area(double radius) {
        return Math.PI * radius * radius;
    }
    public double perimeter(double radius) {
        return 2 * Math.PI * radius;
    }
    public Circle(double radius, double x_coordinate, double y_coordinate) {
        this.index=++count;
        this.radius = radius;
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double distanceToOrigin(double x, double y)
    {
        return Math.sqrt(x*x+y*y);
    }
    public double getX_coordinate() {
        return x_coordinate;
    }
    public double getY_coordinate() {
        return y_coordinate;
    }
    public double getRadius() {
        return radius;
    }
    public String toString()
    {
        return String.format("Circle #%d: radius:%.2f x =%.2f y =%.2f", index, radius, x_coordinate, y_coordinate);
    }
}