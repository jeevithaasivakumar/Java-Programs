// A left rotation operation on an array of size shifts each of the array's elements unit to the left. Given an integer,d, rotate the array that many steps left and return the result.

// Example

// d=2

// arr=[1,2,3,4,5]

// After 2 rotations, arr=[3,4,5,1,2]

// Function Description

// Complete the rotateLeft function in the editor below.

// rotateLeft has the following parameters:

// int d: the amount to rotate by

// int arr[n]: the array to rotate

// Returns

// int[n]: the rotated array

// Input Format

// The first line contains two space-separated integers that denote n, the number of integers , and d, the number of left rotations to perform.

// The second line contains n space-separated integers that describe arr[] .

// Constraints

// 1<=n<=105

// 1<=d<=n

// 1<=a[i]<=106

// Sample Input

// 5 4

// 1 2 3 4 5

// Sample Output

// 5 1 2 3 4
import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int n = 3;
        int a[] = { 1, 2, 3, 4, 5 };
        int start = 0;
        int end = a.length - 1;
        int temp;

        for (start = 0; start < n; start++) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;

        }

        // System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
