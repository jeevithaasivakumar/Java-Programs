public class stringorconsonant {
    public static void main(String[] args) {
        char c = '9';
        if (isLowercaseVowel(c) || isUppercaseVowel(c)) {
            // if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            System.out.println(c + "is a vowel");
        } else {
            System.out.println(c + "is a consonant");

        } // 97 - 122 -> a-z digits 48-57 65 - 90 - > A-z
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.print(c + "is a alphabet");

        } else {
            System.out.print(c + "is not a alphabet");

        }
        int i = c;
        System.out.println("ASCII VALUE IS " + c + "IS " + i);
    }

    static boolean isLowercaseVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    static boolean isUppercaseVowel(char c) {
        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

}
