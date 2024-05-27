// Problem 3:

// An array is good, if it satisfies the following criteria:

// If array is of size N, then it should contain all elements from 1 to N.

// As a direct consequence of the above statement, the array does not contain duplicate elements.

// The array should not be sorted in ascending order.

// Given N and elements of the array, your task is to check if it is Good or Not.

// Input Format

// The first line contains N representing array size. The next line contains N space separated integers representing the elements of array.

// Constraints

// 2<=N<=100 1<=A<=100 where A represents an array element.

// Output Format

// The output contains a single line. If the array satisfies all the above conditions print "Good", otherwise print "Not Good"

// Sample Input 0

// 4

// 1 2 3 4

// Sample Output 0

// Not Good

// Explanation 0

// The array has all the elements from 1 to 4 and without duplicates. So criteria 1 and 2 are satisfied but the array is sorted. So criteria 3 is failed. So print Not Good.

import java.util.Scanner;

public class element {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        // a[i] = a.length - 1;
        // if (a[i] - a[i - 1] == 1) // array not sorted & no duplicate elements
        // f
        boolean isGood = true;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] < a[i + 1] && a[i] == a[i+1]) {
                isGood = false;
                break;
            }
        }
        if (isGood)

            System.out.println("Not good");
        else
            System.out.println("Good");

    }

}
