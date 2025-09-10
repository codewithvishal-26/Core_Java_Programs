package Begineers;

import java.util.Scanner;

public class SumOfDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the matrix (n x n)");
        int n = sc.nextInt();

        int[][] matrix=new int[n][n];

        System.out.println("Enter element as per matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        int PrimarySum = 0, SecondarySum=0;

        for(int i =0;i<n;i++){
            PrimarySum += matrix[i][i];
            SecondarySum += matrix[i][n-i-1];
        }

        System.out.println("Diagonal of primary matrix: " + PrimarySum);
        System.out.println("Diagonal of secondary matrix:" + SecondarySum);
    }
}
