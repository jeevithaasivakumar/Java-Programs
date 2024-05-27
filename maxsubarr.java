

import java.util.Scanner;

public class maxsubarr{
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  = sc.nextLine();
    int i,j;
    int cs =0;
    int ch =0;

    // char string[] = str.toCharArray();
    for(char c: str.toCharArray()){
            if(c == '*'){
                cs++;
                }
                else{
                    ch++;
                }
        
    }
    int ans = Math.abs(cs-ch);
    System.out.println(ans);
    
    }
}
