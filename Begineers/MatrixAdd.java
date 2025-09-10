package Begineers;

import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter no of column: ");
        int cols = sc.nextInt();

        int[][] m1 = new int[rows][cols];
        int[][] m2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        System.out.println("Enter the elements of first matrix:");
        for(int i = 0;i<rows; i++){
            for(int j=0;j<cols;j++){
                m1[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter the elements of second matrix:");
        for(int i =0; i<rows; i++){
            for(int j = 0;j<cols;j++){
                m2[i][j] = sc.nextInt();
            }
        }

        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum[i][j]= m1[i][j] + m2[i][j];
            }
        }

        System.out.println("Sum of matrices");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
            }

            System.out.println();
        }

        sc.close();
    }
}
