import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
        int [][] Matrix = new int [rows][cols];
        int [][] RM=new int [cols][rows];
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                Matrix[i][j]=in.nextInt();


            }
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                RM[j][rows - 1 - i] = Matrix[i][j];
            }
        }

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(RM[i][j] + " ");
            }
        }
    }
}