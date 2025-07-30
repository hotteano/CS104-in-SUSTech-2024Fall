import java.util.Arrays;

public class CallChain {
    public static void main(String[] args) {
        int a=1;
        int[] b={10,20,30};
        int c=multiply(a);
        int[] d=update(b,c);
        d[a]=c;
        System.out.println(Arrays.toString(b));
    }
    public static int multiply(int value){
        return value*2;
    }
    public static int mutiply(int value,int value2){
        return value*value2;
    }
    public static int[] update(int[] value,int x){
        value[x]=mutiply(x,x+1);
        return value;
    }
}
