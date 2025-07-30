import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder(n);
        for(int i=0;i<n;i++)
        {
            sb.append((char)(97+i));
            String s=sb.toString();
            System.out.println(s);
        }
    }
}
