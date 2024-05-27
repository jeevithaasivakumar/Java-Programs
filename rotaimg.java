import java.util.Scanner;

public class rotaimg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        // int[][] temp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int temp = mat[i][j];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < mat.length; i++){
            int left =0;
            int right = 
        for (int j = 0; j < n; j++) {
             

                System.out.println(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
