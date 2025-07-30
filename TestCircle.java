import java.util.ArrayList;

public class TestCircle {
    public static void main(String[] args) {
        ArrayList<Circle> circleList =new ArrayList<>();
        Circle c1= new Circle(1,2,3);
        circleList.add(c1);
        System.out.println(circleList.getFirst().toString());
        for (int i = 1; i < 5; i++) {
            Circle c = new Circle(i, Math.random() * 5, Math.random() * 5);
            circleList.add(c);
        }
        System.out.println("---Begin to print the circle list---");
        for (Circle c: circleList) {
            System.out.printf("%s\n",c.toString());
        }
    }
}
