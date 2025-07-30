import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Random rand = new Random();
        int N=rand.nextInt(5,10);
        int index1=0;
        int index2=0;
        double min_area=Double.MAX_VALUE;
        double max_distance=Double.MIN_VALUE;
        for(int i=1;i<=N;i++)
        {
            Circle c=new Circle(rand.nextDouble(1,3),rand.nextDouble(2,5),rand.nextDouble(2,5));
            double area=c.area(c.getRadius());
            double distance=c.distanceToOrigin(c.getX_coordinate(), c.getY_coordinate());
            if(distance>max_distance){
                max_distance=distance;
                index1=i;
            }
            if(area<min_area)
            {
                min_area=area;
                index2=i;
            }
            System.out.printf("Circle #%d: radius=%.2f x=%.2f y=%.2f\n",i,c.getRadius(),c.getX_coordinate(),c.getY_coordinate());
        }
        System.out.printf("Circle #%d is the smallest circle, area=%.2f\n",index1,max_distance);
        System.out.printf("Circle #%d is the farthest circle, distance=%.2f",index2,min_area);
    }
}
