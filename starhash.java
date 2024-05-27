import java.util.*;

public class starhash {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sh=0;
        int ss=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                ss++;
            } else {
                sh++;
            }
        }
        int ans = ss - sh;  
        System.out.println(ans);
    }
}
