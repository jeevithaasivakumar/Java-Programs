import java.util.Scanner;

public class Stringlength {
    public static void main(String[] args) {
        int length =0;
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        for(int i=0;i<str.length(); i++){   //length of string without length function
            length++;
        } 
        // String s = "prepinsta";
        // for(char c1 : str.toCharArray())
        // length++;
        System.out.print("length is" +length);
    }
}
