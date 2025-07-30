import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        for(int i = 0; i < N; i++)arr1[i] = sc.nextInt();
        boolean[] us = new boolean[N];
        for(int i=0;i<N;i++)us[i]=false;
        for (int i = 0; i < N; i++) arr2[i] = arr1[i];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr2[i] < arr2[j]) {
                    int tmp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = tmp;
                }
            }
        }
        //for (int i = 0; i < N; i++) {System.out.printf("%d", arr2[i]);}
        int h1 = 0;
        int h2 = 0;
        int cnt = 0;
        while (h2 < N) {
            if (h1 == N) {
                h1 = 0;
            }
            if(!us[h1]){cnt++;}
            if (arr1[h1] == arr2[h2] && !us[h1]) {
                us[h1] = true;
                h2++;
            }

            h1++;
        }
        System.out.println(cnt);
    }
}
