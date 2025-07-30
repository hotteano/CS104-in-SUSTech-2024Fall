import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random rand = new Random();
        int N=rand.nextInt(10);
        for(int i=1;i<N;i++)
        {
            Position position=new Position(rand.nextDouble(10),rand.nextDouble(10));
            Rectangle rec=new Rectangle(rand.nextDouble(10), rand.nextDouble(10), position, i);
            System.out.printf("%s\n",rec.toString());
        }
        int MAX_index=0;
        double MAX=0,MAX_radius=0;
        Position MAX_position=new Position(0,0);
        MAX=Double.MIN_VALUE;
        for(int i=1;i<N;i++)
        {
            Position position=new Position(rand.nextDouble(10),rand.nextDouble(10));
            Circle cir=new Circle(rand.nextDouble(10), position, i);
            System.out.printf("%s\n",cir.toString());
            if(MAX< position.distanceToOrigin()){
                MAX=position.distanceToOrigin();
                MAX_index= cir.getId();
                MAX_radius=cir.getRadius();
                MAX_position=cir.getPosition();
            }
        }
        System.out.printf("Furthest Circle #%d: radius=%.2f, position=%s",MAX_index,MAX_radius,MAX_position);
    }

}
