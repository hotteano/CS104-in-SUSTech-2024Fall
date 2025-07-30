import java.awt.*;

public class Rectangle extends Shape {

    private int width;
    private int height;
    private int offset=0;
    private int originalEdge;

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
        originalEdge = height;

        if(width != height){
            this.color = Color.GREEN;
        }

    }

    @Override
    public int getSize(){
        return width;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fillRect(x-offset, y, width, height);
    }

    @Override
    public String getShapeName() {

        if(height==width)
        {
            return "Square";
        }
        else{
            return "Rectangle";
        }
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    @Override
    public void shift(){
        if(height==width)
        {
            width+=100;
            height+=100;
        }
        else {
            offset+=10;
            System.out.println("moving!");
        }
    }
    @Override
    public void reset()
    {
        offset=0;
    }
}