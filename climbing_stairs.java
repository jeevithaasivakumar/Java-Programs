package tcsdigital;

import java.util.Scanner;

public class climbing_stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 3)
            System.out.println(n);

        int a = 3, b = 2;

        for (int i = 0; i < n - 3; i++) {
            a = a + b;
            b = a - b;
        }
        System.out.println(a);
    }
}
