public class Circle {
    private double radius;
    private Position position;
    private int id;
    public double area(double radius) {
        return Math.PI * radius * radius;
    }
    public double perimeter(double radius) {
        return 2 * Math.PI * radius;
    }
    public Circle(double radius, Position position, int id) {
        this.radius = radius;
        this.position = position;
        this.id = id;
    }
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString() {
        return String.format("Circle #%d: radius=%.2f, position=%s",id, radius, position.toString());
    }
}