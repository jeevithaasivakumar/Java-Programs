package tcsdigital;

import java.util.Arrays;

public class zero_to_end {
    public static void main(String[] args) {

        int arr[] = { 3, 0, 2, 1, 4, 5, 0, 0, 5, 8 };
        int n = arr.length;

        func(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    static void func(int arr[], int n) {
        int count = 0;
        for (int nums : arr) {
            if (nums != 0) {
                arr[count++] = nums;
            }
        }
        while (count < n) {
            arr[count++] = 0;
        }
    }
}
