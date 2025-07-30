import java.util.Scanner;

public class Pa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        StringBuilder sub=new StringBuilder(sc.nextLine());
        findsub(sb,sub);
        remove(sb);
        System.out.println(sb.toString());
        StringBuilder sb1=new StringBuilder(sb.toString());
        if(sb.reverse().toString().equalsIgnoreCase(sb1.toString())&& sb.length()!=0){System.out.println("Yes");}
        else{System.out.println("No");}
    }
    public static void remove(StringBuilder sb) {
        int i=0;
        while(i<sb.length()) {
            if(!Character.isLetter(sb.charAt(i)))sb.deleteCharAt(i);
            else i++;
        }
    }
    public static void findsub(StringBuilder sb, StringBuilder sub) {
        for(int i=0;i<=sb.length()-sub.length();i++) {
            if(sub.toString().equals(sb.substring(i,i+sub.length()))) {
                sb.delete(i,i+sub.length());break;
            }
        }
    }
}
