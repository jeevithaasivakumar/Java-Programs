// You are given a structure of a water reservoir. The reservoir is a 2 dimensional structure of height N and width M. It can be thought of divided into M vertical sections, each of equal width. The reservoir height is of N blocks. Each block of the reservoir can contain either water, brick or air. We will denote the water by character 'W', brick by 'B' and air by 'A'.

// You are given representation of reservoir at a fixed instant. Can you tell whether the current state of reservoir is stable, i.e. it will remain on the same state forever or not?

// Input Format

// The first line of input contains an integer T denoting number of test cases. Description of T test cases follows.

// The first line of each test case, contains two integers N and M denoting the height and width of reservoir, respectively.

// Each of the next N lines a string of length M. The j-th character in the i-th of the line denotes content at block (i, j). The characters can be 'B' denoting brick, 'A' denoting air, 'W' denoting water.

// Constraints

// 1 ≤ T ≤ 50 1 ≤ N, M ≤ 1000

// Output Format

// For each test case, output a line containing "yes" or "no" (without quotes) corresponding to the situation whether the reservoir is stable or not?

// Sample Input 0

// 1

// 2 2

// WW

// BB

// Sample Output 0

// no

// Sample Input 1

// 1

// 2 3

// BWB

// BBB

// Sample Output 1

// yes

import java.util.Scanner;

public class WaterReservoir {
    public static boolean isReservoirStable(char[][] reservoir, int n, int m) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m; j++) {
                char currentBlock = reservoir[i][j];
                char blockBelow = reservoir[i + 1][j];
                if (currentBlock == 'W' && (blockBelow == 'A' || blockBelow == 'B')) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        for (int tc = 0; tc < t; tc++) {
            int n = sc.nextInt(); // height of reservoir
            int m = sc.nextInt(); // width of reservoir
            char[][] reservoir = new char[n][m];

            for (int i = 0; i < n; i++) {
                String row = sc.next();
                for (int j = 0; j < m; j++) {
                    reservoir[i][j] = row.charAt(j);
                }
            }

            boolean isStable = isReservoirStable(reservoir, n, m);
            System.out.println(isStable ? "yes" : "no");
        }

        sc.close();
    }
}
