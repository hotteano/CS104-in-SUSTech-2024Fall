import java.util.Scanner;

public class sadpoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int x,y;
        x=-1;y=-1;
        boolean[][] visited = new boolean[M][N];
        boolean flag = false;
        for (int i = 0; i < M; i++) {
            int min=Integer.MAX_VALUE;
            for (int j = 0; j < N; j++) {
                if(min>matrix[i][j]) {x=i;y=j;min=matrix[i][j];}
            }
            visited[x][y]=true;
        }
        for (int i = 0; i < N; i++) {
            int m=-1,n=-1;
            int max=Integer.MIN_VALUE;
            for (int j = 0; j < M; j++) {
                if(max<matrix[j][i]) {m=j;n=i;max=matrix[j][i];}
            }
            if(visited[m][n]){flag=true;x=m;y=n;}
        }
        if(flag){System.out.printf("%d %d %d",x,y,matrix[x][y]);}
        else{System.out.println("No Sad Point found");}
    }
}