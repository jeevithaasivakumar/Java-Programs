import java.util.Arrays;

public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int[] b = new int[a.length];
        int i, j = 0;
        for (i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                b[j++] = a[i];

            }

        }
        b[j++] = a[a.length - 1];

        // for(i=0;i<b.length;i++)
        // a[i]=b[i];
        System.out.println(Arrays.toString(b));
    }
}
