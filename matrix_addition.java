import java.util.*;

public class matrix_addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows & cols: ");
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int[][] m1 = new int[row][cols];
        int[][] m2 = new int[row][cols];
        int[][] m3 = new int[row][cols];
        System.out.println("Enter elements of first matrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                m2[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                m3[i][j]=m1[i][j]+m2[i][j];
            }
        }
        System.out.println("Sum of two matrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}

