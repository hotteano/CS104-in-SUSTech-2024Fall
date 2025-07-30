public class MyTriangle {
    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }
    public static boolean isValid(double side1, double side2, double side3) {
        return side1+side2>side3 && side2+side3>side1 && side1+side3>side2 && side1!=0 && side2!=0 && side3!=0;
    }
    public static double area(double a, double b, double c) {
        if(isValid(a,b,c))
        {
            double p=(a+b+c)/2;
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }
        else return -1.0;
    }
    public static double area(double bottom, double height) {
        return (bottom*height)/2;
    }
    public static double area(double a, double b, int angleOfAandB) {
        return a*b*Math.sin(Math.toRadians(angleOfAandB))/2;
    }
    public static void main(String[] args) {
        System.out.println(isValid(3.5, 4, -1));
        System.out.println(isValid(3, 4, 5));
        System.out.println(isValid(1, 2, 2));
        System.out.println(area(0, 4.5, 5.5));
        System.out.println(area(3.5, 4.5, 5.5));
        System.out.println(area(5, 6, 90));
        System.out.println(area(3,6));
    }
}
