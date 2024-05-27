import java.util.Scanner;
public class floydpattern {
 public static void main(String[] args) {
    int i,j,k=1;
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    for(i=0;i<n;i++){
        for(j=0;j<=i;j++){
            System.out.print(k+ " ");
            k++;
        }
        System.out.println();

    }
 }   
}
