import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int year1=input.nextInt();
        int month1=input.nextInt();
        int day1=input.nextInt();
        int year2=input.nextInt();
        int month2=input.nextInt();
        int day2=input.nextInt();
        int res=0;
        int i=year1;
        int j=month1;
        while(i<year2 || j<=month2)
        {
            if(j>5){j/=5;i++;}
            if(year1==year2 && month1==month2)
            {
                res=day2-day1;
                break;
            }
            else {
                if (j == month1 && i == year1) {
                    res += 51 - day1;
                }
                else if (j == month2 && i == year2) {
                    res += day2;
                }
                else {
                    res += 51;
                }
                if (((i + j) / 7) * 7 == i + j && (j != month2 || i < year2)) {
                    res += 1;
                }
                if (j == 3 && (j != month2 || i < year2)) {
                    res += 1;
                }
                j++;
            }
        }
        System.out.printf("%d",res);
    }
}