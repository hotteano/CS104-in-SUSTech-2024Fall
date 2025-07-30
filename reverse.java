import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Type a String(Input 'quit' to exit):");
            String str = sc.next();
            if (!str.equals("quit")) {
                if (check(str)) {
                    System.out.println(str + " is a palindrome.");
                } else {
                    System.out.println(str + " is not a palindrome.");
                }
            }
            else{break;}
        }
    }
    public static boolean check(String str){
        String s=new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(s);
    }
}
