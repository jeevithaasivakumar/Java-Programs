import java.util.Scanner;

public class stringfreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[str.length()]; //length equal to the length of the string str
    int i,j;

    char string[] = str.toCharArray();
    for(i=0; i<str.length() ; i++){
        freq[i] = 1;
        for(j= i+1; j<str.length(); j++){
            if(string[i] == string[j]){
                freq[i]++;
                string[j] ='0';
            }
        }
    }
    System.out.println("Char and frequency");
    for(i = 0; i<freq.length; i++){
        if(string[i] != ' ' && string[i] != '0')
        System.out.println(string[i] + "-" + freq[i]);
    }
    }
}
