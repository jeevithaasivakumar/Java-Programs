
import java.util.Scanner;

public class halfpyramidpattern {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(j+1 + " ");
                // j++;

            }

            System.out.println();

        }
    }
}