public class reverse_string {
    public static void main(String[] args) {
        String str = "abcde";
        StringBuffer rev = new StringBuffer(str);
        rev.reverse();
        System.out.println(rev);
    }
}
