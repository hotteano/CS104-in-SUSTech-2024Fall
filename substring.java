import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int cnt=0;
        int l=s1.length();
        int m=s2.length();
        for(int i=0;i<l-m;i++)
        {
            if(s1.substring(i,i+m).equals(s2)) {
                System.out.println("Found at index: " + i);
                cnt++;
            }
        }
        System.out.println("Total Occurrence: "+cnt);
    }
}
