public class Stringcase {
    public static void main(String[] args) {
        String s = "pREp{}}&   ($#$%FFin) sd123f  DFF";
        String s2 = "";
        String s3 = "";
        StringBuffer sb = new StringBuffer();
        // s2 = s.replaceAll("[^a-zA-Z]", "");
                s2 = s.replaceAll("[() {}]", "");

    //    String[]  s2 = s.split("[\\s]");
    //     for (String string : s2) {
    //         sb.append(string);
    //     }
    //     System.out.println(sb);
        System.out.println("String after removing vowel:" + s2);
        for (int i = s.length() - 1; i >= 0; i--)
            s3 += s.charAt(i);
        System.out.println(s3);
        if (s.equals(s3)) {
            System.out.println("Palindrome");
        } else
            System.out.println("not aPalindrome");

        char[] c = s.toCharArray();
        int vowel = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u')
                vowel++;
        }
        System.out.println("vowels " + vowel);
        // for(int i=0; i<s.length(); i++){
        // if(Character.isUpperCase(s.charAt(i)))
        // s2 += Character.toLowerCase(s.charAt(i));
        // else
        // s2+= Character.toUpperCase(s.charAt(i));
        // }
        // System.out.print("Toggle String: " +s2);
    }
}
