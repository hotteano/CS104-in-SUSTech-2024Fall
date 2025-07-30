public class Rectangle {
    private double width;
    private double length;
    private Position position;
    private int id;
    public Rectangle(double width, double length, Position position,int id) {
        this.width = width;
        this.length = length;
        this.position = position;
        this.id = id;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public String toString() {
        return String.format("Rectangle #%d: width=%.2f, length=%.2f, position=%s",id,width,length,position.toString());
    }
}
