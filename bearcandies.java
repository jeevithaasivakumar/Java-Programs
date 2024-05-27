import java.util.Scanner;

public class bearcandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(); // limak limit max
            int b = sc.nextInt(); // bob limit max
            int lc = 0;
            int bc = 0;
            int turn = 1;
            while (true) {
                if (turn % 2 == 1) {
                    lc += turn;
                    if (lc > a) {
                        System.out.println("bob");
                        break;
                    }
                } else {
                    bc += turn;
                    if (bc > b) {
                        System.out.println("limak");
                        break;
                    }
                }
                turn++;
            }
        }

        sc.close();

    }
}