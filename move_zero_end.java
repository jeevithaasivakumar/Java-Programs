//move zero to end

import java.util.Arrays;

public class move_zero_end {
    public static void main(String[] args) {
        int a[] = { 4, 5, 0, 1, 9, 0, 5, 0 };
        int n = a.length;
        func(a, n);
        System.out.println(Arrays.toString(a));
    }

    static void func(int a[], int n) {
        int count = 0;
        for (int num : a) {
            if (num != 0) {
                a[count++] = num;
            }
        }
        while (count < n) {
            a[count++] = 0;
        }
    }

}