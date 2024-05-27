// prog to find duplicate values of an array of int values

import java.util.Arrays;

public class duplicates_array {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 0, 1, 9, 0, 5, 0 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int pe = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == pe) {

                System.out.println(arr[i]);
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            } else {
                pe = arr[i];
            }

        }

    }

}