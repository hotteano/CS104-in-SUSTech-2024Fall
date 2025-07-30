import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] score=new float[10];
        int n=10;
        float min=101;
        float max=-1;
        for(int i=0;i<n;i++)
        {
            float ip=sc.nextFloat();
            max=Math.max(max,ip);
            min=Math.min(min,ip);
            score[i]=ip;
        }
        float sum=0;
        for(int i=0;i<n;i++)
        {
            if(score[i]==min || score[i]==max)
            {
                continue;
            }
            else{sum+=score[i];}
        }
        System.out.printf("%.2f",sum/8);
    }
}
