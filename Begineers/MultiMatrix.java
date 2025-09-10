package Begineers;

import java.util.Scanner;

public class MultiMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get dimensions for first matrix
        System.out.println("Enter rows for first matrix:");
        int rows1 = sc.nextInt();
        System.out.println("Enter columns for first matrix:");
        int cols1 = sc.nextInt();

        // Get dimensions for second matrix
        System.out.println("Enter rows for second matrix:");
        int rows2 = sc.nextInt();
        System.out.println("Enter columns for second matrix:");
        int cols2 = sc.nextInt();

        // Matrix multiplication condition
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible. Columns of first must equal rows of second.");
            sc.close();
            return;
        }

        int[][] m1 = new int[rows1][cols1];
        int[][] m2 = new int[rows2][cols2];
        int[][] result = new int[rows1][cols2];

        // Input first matrix
        System.out.println("Enter elements for first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements for second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {  // or rows2
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        // Display result
        System.out.println("Multiplication of matrices:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
