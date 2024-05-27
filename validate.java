
import java.util.*;

public class validate {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            cs += arr[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(ms,cs);
        }
        

        System.out.println(ms);

        
    }
}
