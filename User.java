import java.util.Scanner;

public class User {
    private String account;
    private String Password;
    private double money;
    public void introduce()
    {
        System.out.println(account+"'s account has a balance of "+money+" dollar");
    }
    public boolean check(double money,double expense)
    {
        return money>=expense;
    }
    public void expense(double value,Scanner input)
    {
        //System.out.println("Enter the amount you plan to expense:");
        //value=input.nextDouble();
        if(check(money,value))
        {
            System.out.println("Plan to expense "+ value+ "dollar\n" + "Please input your password:");
            int cnt=1;
            while(cnt<=3)
            {
                String password=input.next();
                if(Password.equals(password)){
                    money-=value;
                    System.out.println("Expense "+value+" dollar and balance "+money+" dollar");
                    break;
                }
                else{
                    System.out.println("Password error,there are "+(3-cnt)+" times left");cnt++;
                }
            }
        }
        else{
            System.out.println("Plan to expense "+value+" but no sufficient money");
        }
    }
    public void income(double value,Scanner input)
    {
        //System.out.println("Enter the amount you plan to deposit:");
        //value=input.nextDouble();
        money+=value;
        System.out.println("Got "+value+" as income, balance is "+money+" dollar");
    }
    public void setPassword(Scanner input, String password)
    {
        System.out.println("Enter your previous password:");
        password=input.nextLine();
        if(this.Password.equals(password)){this.Password=password;}
        else{System.out.println("Password does not match.");}
    }
    public void setUser(String user)
    {
        this.account=user;
    }
    public void setPassword(String password)
    {
        this.Password=password;
    }
    public void setMoney(double money)
    {
        this.money=money;
    }
}
