import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        double[] credit= new double[N];
        double[] grade = new double[N];
        for(int i = 0; i < N; i++)grade[i] = sc.nextDouble();
        for(int i = 0; i < N; i++)credit[i] = sc.nextDouble();
        double[] gpa= new double[N];
        for(int i=0;i<N;i++)
        {
            if(grade[i]<=100 && grade[i]>=90){gpa[i]=4;}
            else if(grade[i]<90 && grade[i]>=80){gpa[i]=3;}
            else if(grade[i]<80 && grade[i]>=70){gpa[i]=2;}
            else if(grade[i]<70 && grade[i]>=60){gpa[i]=1;}
            else{gpa[i]=0;}
        }
        double GPA;
        double G=sc.nextDouble();
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                GPA=(credit[i]*gpa[i]+credit[j]*gpa[j])/(credit[i]+credit[j]);
                if(Math.abs(GPA-G)<0.01){System.out.printf("%d %d\n",Math.min(i,j),Math.max(i,j));}
            }
        }
    }
}
