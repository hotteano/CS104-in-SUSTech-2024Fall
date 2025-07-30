import java.util.Scanner;

public class IPV4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        int num=0;
        boolean times=false;
        boolean cnt=false;
        boolean flag=true;
        for(int i=0;i<sb.length();i++)
        {
            if(isNumber(sb.charAt(i))||sb.charAt(i)=='.')
            {
                if(sb.charAt(i)=='.'){
                    if(cnt){System.out.print("No");flag=false;break;}
                    num=0;cnt=true;times=false;
                }
                else{
                    num=num*10+(int)sb.charAt(i)-'0';

                    if(times){
                        if(sb.charAt(i)-'0'>=0){System.out.print("No");flag=false;break;}
                        else{times=false;}
                    }
                    if(cnt && sb.charAt(i)=='0'){times=true;}
                    cnt=false;
                    if(num>=256 || num<0){System.out.print("No");flag=false;break;}
                }
            }
            else{System.out.print("No");flag=false;break;}
        }
        if(flag){System.out.print("Yes");}
    }
    public static boolean isNumber(char str)
    {
        return str-'0'>=0&&str-'0'<=9;
    }
}
