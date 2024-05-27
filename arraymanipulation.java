// Function Description

// Complete the function arrayManipulation in the editor below.

// arrayManipulation has the following parameters:

// int n - the number of elements in the array

// int queries[q][3] - a two dimensional array of queries where each queries[i] contains three integers, a, b, and k.

// Returns

// int - the maximum value in the resultant array

// Input Format

// The first line contains two space-separated integers n and m, the size of the array and the number of operations.

// Each of the next m lines contains three space-separated integers a,b and k , the left index, right index and summand.

// Constraints

// 3<=n<=107

// 1<=m<=2*105

// 1<=a<=b<=109

// Sample Input

// 5 3

// 1 2 100

// 2 5 100

// 3 4 100

// Sample Output

// 200

// Explanation

// After the first update the list is 100 100 0 0 0.

// After the second update list is 100 200 100 100 100.

// After the third update list is 100 200 200 200 100.

// The maximum value is 200

import java.util.Scanner;

public class arraymanipulation {
    public static long arrayManiputlate( int n, int[][]queries){
        long[] arr = new long[n];
        for(int[] query : queries){
            int a= query[0];
            int b= query[1];
            int k=query[2];
            for(int i = a-1; i <b ;i++){
                arr[i] +=k;
            }
        }
        long max =0;
        for(long num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }
    public static void main(String[] args) {
       
     int n = 5;
     int[][] queries ={
        {1,2,100},
        {1,3,100},
        {1,4,100}, 
    };
    long result =arrayManiputlate(n, queries);
    System.out.println(result);

    }
}