import java.util.Scanner;

public class string_half_samevowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = str.toLowerCase();
        int half = str1.length() / 2;
        String f = str.substring(0, half);
        String s = str.substring(half);
        System.out.println(f);
        int count1 = 0;
        for (int i = 0; i < f.length(); i++) {
            if (f.charAt(i) == 'a' || f.charAt(i) == 'e' || f.charAt(i) == 'i' || f.charAt(i) == 'o'
                    || f.charAt(i) == 'u') {
                count1++;
            }
            int count2 = 0;

            for (int j = 0; i < s.length(); j++) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                        || s.charAt(i) == 'u') {
                    count2++;
                }
            }
            if (count1 == count2) {
                System.out.println("true");
            } else {
                System.out.println(false);
            }
        }
    }

}
// import java.util.Scanner;

// public class StringHalfSameVowels {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = sc.next().toLowerCase();

// int length = str.length();
// int half = length / 2;

// int count1 = countVowels(str.substring(0, half));
// int count2 = countVowels(str.substring(half));

// boolean result = (count1 == count2);

// System.out.println(result);
// }

// private static int countVowels(String s) {
// int count = 0;
// for (char ch : s.toCharArray()) {
// if ("aeiou".indexOf(ch) != -1) {
// count++;
// }
// }
// return count;
// }
// }
