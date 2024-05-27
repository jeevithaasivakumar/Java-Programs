import java.io.*;

public class string_palindrome {


public static boolean ispalindrome(String str){
    String rev ="";
    boolean ans = false;
    for(int i=str.length() -1; i >= 0; i--){
        rev = rev + str.charAt(i);
    }
    if(str.equals(rev)){
        ans = true;
    }
    return ans;
    

}
public static void main(String[] args) {
    String str = "manam";
    str = str.toLowerCase();
    boolean A = ispalindrome(str);
    System.out.println(A);
    
}
}