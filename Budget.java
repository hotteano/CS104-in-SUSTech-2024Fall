import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double B = sc.nextDouble();
        int N = sc.nextInt();
        double[] list = new double[N];
        int[] index = new int[N];
        for (int i = 0; i < N; i++) {index[i]=i;}
        for (int i = 0; i < N; i++) list[i] = sc.nextDouble();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(list[i] < list[j]){
                    double temp = list[i];
                    int tmp=index[i];
                    list[i] = list[j];
                    index[i] = index[j];
                    list[j] = temp;
                    index[j]=tmp;
                }
            }
        }
        int h1=-1;
        while(B>0 && h1<N-1)
        {
            h1++;
            B-=list[h1];
        }
        int[] output=new int[N-h1];
        if(B<0){
            B+=list[h1];
            System.out.printf("Budget insufficient, remaining %.2f,",B);
            for(int i=h1;i<N;i++)output[i-h1]=index[i];
            for(int i = 0; i < N-h1; i++){
                for(int j = 0; j < N-h1; j++){
                    if(output[i] < output[j]){
                        int tmp=output[i];
                        output[i] = output[j];
                        output[j] = tmp;
                    }
                }
            }
            for(int i=0;i<N-h1;i++){System.out.printf(" %d",output[i]);}
        }
        else{
            System.out.printf("Budget sufficient, remaining %.2f",B);
        }
    }
}
