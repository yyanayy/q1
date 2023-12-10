package random;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = 2, c = 2;
        
        System.out.println("Negation of 2x2 matrices: ");
        System.out.println("Matrix A: ");
        int[][] matA = getMatrix(r, c);
        System.out.println("Matrix B: ");
        int[][] matB = getMatrix(r, c);

        int[][] add = addition( matA, matB, r, c);
        System.out.println("\nResultant Matrix:");
        display(add);

        display(matB);

        sc.close();
    }

    public static int[][] getMatrix(int r, int c){
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                mat[i][j] = sc.nextInt();
            }
        }
      
        return mat;
    }

    public static void display(int[][] mat){
        for(int[] row : mat){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addition(int[][] matA, int[][] matB, int r, int c){
        int[][] add = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                add[i][j] = matA[i][j] + matB[i][j];
            }
        }
        return add;
    }

}