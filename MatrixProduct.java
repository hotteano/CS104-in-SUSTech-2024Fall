import java.util.Scanner;

public class MatrixProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column numbers: ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int[][] matrix1 = new int[row1][col1];
        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the row and column numbers: ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] matrix2 = new int[row2][col2];
        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        Matrixproduct(matrix1,row1,matrix2,col2,row2);
    }
    public static void Matrixproduct(int[][] matrix1, int row1, int[][] matrix2, int col2,int row2){
        int[][] matrix3=new int[row1][col2];
        for(int i=0; i<row1; i++){
            for(int j=0; j<col2; j++){
                matrix3[i][j]=0;
            }
        }
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for(int k=0;k<row2;k++)
                {
                    matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        for(int i=0; i<row1; i++){
            System.out.print("[");
            for(int j=0; j<col2; j++){
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println("]\n");
        }
    }
}