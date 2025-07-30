import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("please enter your array length:");
        int l=sc.nextInt();
        float[] arr1 = new float[l];
        float[] arr2 = new float[l];
        System.out.printf("please enter your array element:");
        for(int i=0;i<l;i++)
        {
            arr1[i]=sc.nextFloat();
        }
        for(int i=1;i<l;i++)
        {
            arr2[i]=arr1[i-1];
        }
        arr2[0]=arr1[l-1];
        System.out.println("List1:");
        for(int i=0;i<l;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println("\n");
        System.out.println("List2:");
        for(int i=0;i<l;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}