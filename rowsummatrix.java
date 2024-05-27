// Given a matrix of size N x M, print row-wise sum, separated by a newline. Note: Try to solve this without declaring/storing the matrix.

// Input Format

// First line of input contains N, M - the size of the matrix. Its followed by N lines each containing M integers - elements of the matrix.

// Constraints

// 1 <= N, M <= 100 -106 <= ar[i] <= 106

// Output Format

// Print row-wise sum of the matrix, separated by a newline.

// Sample Input 0

// 2 3

// 5 -1 3

// 19 8 -5

// Sample Output 0

// 7

// 22

import java.util.Scanner;

public class rowsummatrix {
    public static void main(String[] args) {
        int row, col;
        int arr[][] = new int[5][5];
        Scanner sc = new Scanner(System.in);
        System.out.print("row");
        row = sc.nextInt();
        System.out.print("col");
        col = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    //     for (int i = 0; i < row; i++) {
    //         int sum = 0;

    //         for (int j = 0; j < col; j++) {
    //             sum += arr[i][j];
    //         }
    //         System.out.println(sum);

    //     }

    // }
    for (int i = 0; i < col; i++) {
            int sum = 0;

            for (int j = 0; j < row; j++) {
                sum += arr[j][i];
            }
            System.out.print(sum);

        }

    }
}
