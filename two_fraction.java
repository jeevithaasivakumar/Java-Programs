package tcsdigital;

import java.util.Scanner;

public class two_fraction {

    public static void main(String[] args) {
        int n1, d1, n2, d2, i, j, k, gcd = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st numerator: ");
        n1 = scanner.nextInt();

        System.out.print("Enter the 1st denominator: ");
        d1 = scanner.nextInt();

        System.out.print("Enter the 2nd numerator: ");
        n2 = scanner.nextInt();

        System.out.print("Enter the 2nd denominator: ");
        d2 = scanner.nextInt();

        i = n1 * d2 + n2 * d1;
        j = d1 * d2;

        for (k = 1; k <= i && k <= j; k++) {
            if (i % k == 0 && j % k == 0) {
                gcd = k;
            }
        }

        System.out.printf("Final fraction is %d / %d", i / gcd, j / gcd);

        scanner.close();
    }
}
