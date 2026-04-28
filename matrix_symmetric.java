import java.util.*;

public class matrix_symmetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix: ");
        int size = sc.nextInt();
        
        int[][] m1 = new int[size][size];
        System.out.println("Enter elements of matrix : ");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                m1[i][j]=sc.nextInt();
            }
        }
        int flag = 0;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(m1[i][j]!=m1[j][i]){
                    flag = 1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("The matrix is symmetric");
        }
        else{
            System.out.println("The matrix is not symmetric");


    }
    sc.close();
}
}
