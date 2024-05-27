import java.util.*;

public class sealevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sl = 0;
        int valley = 0;
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            if (s[i].equals("U")) {
                sl += 1;
            } else {
                sl -= 1;
            }
            if (s[i].equals("U") && sl == 0) {
                valley += 1;
            }
        }
        System.out.println(valley);

    }
}
