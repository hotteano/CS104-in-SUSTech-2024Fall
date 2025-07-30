import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        long current1=System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        double[] arr = new double[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextFloat();
        }
        double sum=0;
        for(int i=0;i<size;i++)
        {
            sum+=arr[i];
        }
        double avg=sum/size;
        int h1=0;
        int h2=size-1;
        int num1=0;
        while(h1<h2)
        {
            if((arr[h1]+arr[h2])/2<=avg){h1++;}
            else{num1+=h2-h1;h2--;}
        }
        System.out.println("Average: "+avg);
        System.out.printf("There are %d pair of Integers\n",num1);
        long current2=System.currentTimeMillis();
        System.out.printf("your program using %.3f second",(current2-current1)/1000.0d);
    }
}