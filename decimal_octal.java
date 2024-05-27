package tcsdigital;

public class decimal_octal {
    public static void main(String[] args) {
        int n = 33;
        int[] octalNum = new int[100];
        int i = 0;
        while (n != 0) {
            octalNum[i] = n % 8; // storing the rem
            // System.out.println(octalNum[i]);
            n = n / 8;  //diving it by 8
            // System.out.println(n);
            i++; //repeat
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(octalNum[j]);
    }
}

// o(log n)
// o(digits)
