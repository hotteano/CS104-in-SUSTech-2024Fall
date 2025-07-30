import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        List<Circle> circleList = new ArrayList<>();
        Circle.setScreenSize(14);
        StdDraw.setScale(-Shape.getScreenSize(), Shape.getScreenSize());
        for (int i = 10; i > 0; i -= 2) {
            circleList.add(new Circle(i, 0, -Shape.getScreenSize()+i+17));
        }
        Collections.sort(circleList);
        for (int i = 0; i < circleList.size(); i++) {
            circleList.get(i).customizedColor(ColorScheme.SKY, i);
        }
    }
}
