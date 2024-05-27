package tcsdigital;

import java.util.Scanner;

public class prime_nos_upto_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i < n / 2 + 1; i++) {

            System.out.println(i + " ,");
        }
    }
}
