package VIVA2;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row of matrices: ");
        int r = sc.nextInt();
        System.out.print("Enter column of matrices: ");
        int c = sc.nextInt();
        
        System.out.println("Addition of 2x2 matrices: ");
        System.out.println("Matrix A: ");
        int[][] matA = getMatrix(r, c);
        System.out.println("Matrix B: ");
        int[][] matB = getMatrix(r, c);

        int[][] add = addition( matA, matB, r, c);
        System.out.println("\nResultant Matrix:");
        display(add);

        int rD= 3, cD = 3;
        System.out.println("\nDeterminant of 3x3 matrices: ");
        System.out.println("Matrix A: ");
        int[][] matAD = getMatrix(rD, cD);

        System.out.println("Determinant of Matrix A: " + determinant(matAD, rD, cD));
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

    public static int determinant(int[][] matA, int r, int c){
        return (matA[0][0] * ((matA[1][1] * matA[2][2]) - (matA[1][2] * matA[2][1]))) - (matA[0][1] * ((matA[1][0] * matA[2][2]) - (matA[1][2] * matA[2][0]))) + (matA[0][2] * ((matA[1][0] * matA[2][1]) - (matA[1][1] * matA[2][0])));
    }
    
}
