import java.util.Scanner;

public class solidrectpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = n * 2 - 1;
        int r = 0;
        int c = size - 1;
        int max = 100;
        int[][] a = new int[max][max];
        while (n != 0 && r <= c) {

            for (int i = r; i <= c; i++) {
                for (int j = r; j <= c; j++) {
                    if (i == r || j == c || i == c || j == r) {
                        a[i][j] = n;
                    }
                }
            }
            r++;
            c--;
            n--;

        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
