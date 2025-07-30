import java.util.Scanner;

public class occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int[] key=new int[101];
        for(int i=0;i<101;i++)
        {
            key[i]=0;
        }
        int p=1;
        while(p!=0)
        {
            p=sc.nextInt();
            key[p]++;
        }
        for(int i=1;i<101;i++)
        {
           if(key[i]==0) {
               continue;
           } else{System.out.printf("%d occurs %d times\n",i,key[i]);}
        }
    }
}
