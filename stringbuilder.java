import java.util.Scanner;

public class stringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        sb.append(str);
        if(sb.isEmpty()){System.out.println("Empty,exit……");}
        else{
            clearRepetition(sb);
        }
    }
    public static void clearRepetition(StringBuilder sb){
        boolean[] a=new boolean[1001];
        for(int i=0;i<sb.length();i++){
            if(!a[sb.charAt(i)]){a[sb.charAt(i)]=true;System.out.printf("%c",sb.charAt(i));}
        }
    }
}
