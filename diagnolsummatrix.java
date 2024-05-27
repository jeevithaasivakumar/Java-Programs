// Given a matrix of size N x M, print diagnol sums line by line

// Input Format

// First line of input contains T - number of test cases. First line of each test case contains N - size of the matrix. Each of the next N lines contains N integers - the elements of the matrix.

// Constraints

// 1 <= T <= 100 1 <= N <= 100 -100 <= ar[i][j] <= 100

// Output Format

// For each test case, print the sum of the elements of all the diagonals, separated by newline. Refer samples for more clarity.

// Sample Input 0

// 1

// 3 3

// 1 2 3

// 4 5 6

// 7 8 9

// Sample Output 0

// 15 15

// Explanation 0

// 1+5+9 = 15 3+5+7 = 15

import java.util.Scanner;

public class diagnolsummatrix {
    public static void main(String[] args) {
        // int row, col;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int primarySum = 0; // sum of elements on the primary diagonal
        int secondarySum = 0; // sum of elements on the secondary diagonal

        for (int i = 0; i < n; i++) {
            primarySum += arr[i][i];
            secondarySum += arr[i][n - 1 - i];
        }
        System.out.println(primarySum + " " + secondarySum);
        sc.close();
    }
}
