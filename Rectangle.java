import java.awt.*;

public class Rectangle extends Shape{
    public Rectangle()
    {
        super();
        this.color= Color.GREEN;
    }
    @Override
    public void draw(Graphics2D g2d)
    {
        g2d.setColor(color);
        int[] xpoints={x,x+75,x+75,x};
        int[] ypoints={y,y,y+45,y+45};
        g2d.fillPolygon(xpoints, ypoints, 4);
    }
    @Override
    public String getShapeName()
    {
        return "Rectangle";
    }
}
