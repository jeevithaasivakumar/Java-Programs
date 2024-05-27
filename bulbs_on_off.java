import java.util.Scanner;

public class bulbs_on_off {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count  = (int)Math.sqrt(n);
        System.out.println(count);
    }
}
