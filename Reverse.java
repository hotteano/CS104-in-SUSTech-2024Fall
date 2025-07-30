import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int j=k;
        int rv=0;
        while(k>0){
            rv=rv*10+k%10;
            k/=10;
        }
        System.out.println(rv==j?"YES":"NO");
    }
}