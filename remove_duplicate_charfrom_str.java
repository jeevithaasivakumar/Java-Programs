import java.util.LinkedHashSet;

public class remove_duplicate_charfrom_str {
    public static void main(String[] args) {
        String str ="aabbccddee";
    
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i=0;i<str.length();i++)

            set.add(str.charAt(i));

        for(Character ch : set)
            System.out.print(ch);
        
    }
}
// a b c d
// f f f f
// t t f f
