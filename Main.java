import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the subject:");
        int sub = sc.nextInt();
        System.out.println("Enter the number of students:");
        int st = sc.nextInt();
        int[][] students= new int[st][sub];
        for(int i=0;i<sub;i++) {
            for (int j = 0; j < st; j++) {
               students[j][i] = sc.nextInt();
            }
        }
        float[] avg1=new float[st];
        float[] avg2=new float[sub];
        for(int i=0;i<st;i++) {
            float sum=0;
            for(int j=0;j<sub;j++) {
                sum+=(float)students[i][j];
            }
            avg1[i]=sum/sub;
        }
        for(int i=0;i<sub;i++) {
            float sum=0;
            for(int j=0;j<st;j++) {
                sum+=(float)students[j][i];
            }
            avg2[i]=sum/st;
        }
        System.out.println("         Course1    Course2    Course3    Average");
        for(int i=0;i<st;i++) {
            System.out.printf("Student%d  ",i+1);
            for(int j=0;j<sub;j++) {
                System.out.printf("  %d       ",students[i][j]);
            }
            System.out.printf("%.2f\n",avg1[i]);
        }
        System.out.printf("Average   ");
        for(int i=0;i<sub;i++) {
            System.out.printf("%.2f      ",avg2[i]);
        }
    }
}
