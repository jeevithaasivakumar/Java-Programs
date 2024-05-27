import java.util.ArrayList;
import java.util.Arrays;

public class array_sum_from_first {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        // int[] b = new int[a.length];
        // // a[0] = b[0];

        // int i = 0, j = 0;
        // while (i < a.length && j < b.length) {
        // // int prev = b[j];
        // b[0]=a[0];
        // b[j+1] = b[j] + a[i+1];
        // i++;
        // // prev++;
        // j++;
        // }
        System.out.println(Arrays.toString(nums));
    }
}
