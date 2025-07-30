import java.util.Scanner;


public class Bubblesort{
    public static void main(String[] args){
        System.out.println("Enter the size of the array\n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] sorted=new int[n];
        System.out.println("\nEnter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            sorted[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                if(sorted[j]>sorted[i])
                {
                    int tmp=sorted[j];
                    sorted[j]=sorted[i];
                    sorted[i]=tmp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(sorted[i]+" ");
        }
    }
}