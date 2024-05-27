/*
 * Write a program to take two numbers as input and print their difference if
 * the first number is greater than the second number otherwise print their sum.
 * Input Format
 * First line will contain the first number (N1)
 * Second line will contain the second number (N2)
 * Output Format
 * Output a single line containing the difference of 2 numbers (N1−N2) if the
 * first number is greater than the second number otherwise output their sum
 * (N1+N2).
 * Constraints
 * −1000 ≤ N1 ≤ 1000
 * −1000 ≤ N2 ≤ 1000
 * Sample Input
 * 82
 * 28
 * Sample Output
 * 54
 */

import java.util.Scanner;

public class greaterOrSmaller {
    public static void main(String[] args) {
        System.out.println("Enter 2 nos");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int ans;
        if (a > b) {
            ans = a - b;
        } else
            ans = a + b;
        System.out.println(ans);

    }
}
