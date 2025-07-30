import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int[][] matrix1=new int[M][N];
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                matrix1[i][j]=sc.nextInt();
            }
        }
        int[][] matrix2=transpose(matrix1);
        int[][] matrix3=symmetry(matrix2);
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.printf("\n");
        }
    }
    public static int[][] transpose(int[][] matrix){
        int[][] matrix1=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix[0].length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                matrix1[i][j]=matrix[j][i];
            }
        }
        return matrix1;
    }
    public static int[][] symmetry(int[][] matrix){
        int[][] matrix1=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix1[i][j]=matrix[i][matrix[0].length-j-1];
            }
        }
        return matrix1;
    }
}