// import java.util.Arrays;

// public class mergesortedarray {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int p1 = m - 1;
//         int p2 = n - 1;
//         int i = m + n - 1;

//         while (p2 >= 0) {
//             if (p1 >= 0 && nums1[p1] > nums2[p2]) {
//                 nums1[i--] = nums1[p1--];
//             } else {
//                 nums1[i--] = nums2[p2--];
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] nums1 = { 1, 2, 3, 0, 0, 0 };
//         int m = 3;
//         int[] nums2 = { 2, 5, 6 };
//         int n = 3;

//         MergeSortedArray merger = new MergeSortedArray();
//         merger.merge(nums1, m, nums2, n);

//         System.out.println(Arrays.toString(nums1));
//     }
// }
import java.util.Arrays;

public class mergesortedarray {
    public static void main(String[] args) {
        // Solution solution = new Solution();
        int[] a = { 1, 3, 4, 5 };
        int m = a.length;
        int[] b = { 2, 4, 6, 8 };
        int n = b.length;
        int[] c = new int[m + n];

        merge(a, b, m, n, c);

        System.out.println(Arrays.toString(c));
    }

    public static void merge(int[] a, int[] b, int m, int n, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < m) {
            c[k++] = a[i++];
        }
        while (j < n) {
            c[k++] = b[j++];
        }
        Arrays.sort(c);
    }
}
