import java.awt.*;
import java.util.Random;

public class Circle extends Shape {

    private int radius = 30;
    private Random rand = new Random();
    public Circle() {
        super();
        this.color = Color.RED;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fillOval(x, y, radius * 2, radius * 2);
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public int getSize(){
        return radius * 2;
    }
    @Override
    public void shift()
    {
        this.color=Color.getHSBColor(rand.nextFloat(360),1, 1);
    }
    @Override
    public void reset()
    {
        this.color=Color.RED;
    }
}
