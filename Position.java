public class Position {
    private double x;
    private double y;
    public Position(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distanceToOrigin(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public String toString(){
        return String.format("(%.2f,%.2f)",x,y);
    }
}
