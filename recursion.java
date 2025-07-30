import java.util.Scanner;

public class recursion {
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
        boolean[][] visited=new boolean[matrix.length][matrix[0].length];
        for(int j = 0; j<= Math.min(N,M)/2; j++) {
            spiral(matrix, j,visited);
        }
    }
    public static void spiral(int[][] matrix,int j,boolean[][] visited) {
        for(int i=j;i<matrix.length-j;i++) {
            if(!visited[i][j]){visited[i][j]=true;System.out.printf("%d ",matrix[i][j]);}
        }
        for(int i=j+1;i<matrix[0].length-j;i++) {
            if(!visited[matrix.length-j-1][i]){visited[matrix.length-j-1][i]=true;System.out.printf("%d ",matrix[matrix.length-j-1][i]);}
        }
        for(int i=matrix.length-j-2;i>=j;i--) {
            if(!visited[i][matrix[0].length-j-1]){visited[i][matrix[0].length-j-1]=true;System.out.printf("%d ",matrix[i][matrix[0].length-j-1]);}
        }
        for(int i=matrix[0].length-j-2;i>j;i--) {
            if(!visited[j][i]){visited[j][i]=true;System.out.printf("%d ",matrix[j][i]);}
        }
    }
}
