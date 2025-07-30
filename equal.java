import java.util.Scanner;

public class equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:\n");
        int l=sc.nextInt();
        int[] score=new int[l];
        boolean flag=true;
        System.out.println("Please Enter Array1:\n");
        for(int i=0;i<l;i++)
        {
            score[i]=sc.nextInt();
        }
        System.out.println("Please Enter Array2:\n");
        for(int i=0;i<l;i++)
        {
            if(score[i]!=sc.nextInt()){
                flag=false;
            }
        }
        if(flag==true){System.out.println("The arrays are equal");}
        else{System.out.println("The arrays are not equal");}
    }
}
