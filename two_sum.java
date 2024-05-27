package tcsdigital;

import java.util.Arrays;
import java.util.Scanner;

public class two_sum {
    public static void main(String[] args) {
        int n, target;
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // for (int j = 0; j < arr.length; j++) { //runs n times
        // for (int k = j + 1; k < arr.length; k++) { //runs n-1 times
        // if (arr[j] + arr[k] == target) {
        // System.out.println(j + " " +k );
        // }
        // }
        // }
        Arrays.sort(arr); //
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int currsum = arr[left] + arr[right];
            if (currsum == target) {
                System.out.println(left + " " + right);
                break;
            } else if (currsum < target) {
                left++;
            } else {
                right--;
            }
        }

    } // o(n logn)
}
// o(n^2)