import java.util.Scanner;

public class pattern1 {
    public static void main (String[] args){
        int n; //no of lines
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int star = n/2 +1;
        int space = 0;
        for(int i =1; i<=n; i++){
            for(int j=1; j<= star; j++)
            System.out.print("*");
            for(int j =1; j<= space; j++)
            System.out.print(" ");
            for(int j=1; j<=star; j++)
            System.out.print("*");
            System.out.println();
            if( i< n/2 +1){   // before the middle line
                star -= 1;
                space += 2;
            }
            if(i == n/2 +1)
            {
                star = 2;
                space = n +1 -4;
            }
            if (i > n/2 +1){
                star +=1;
                space -=2;
            }


        }

    }

}
// *******
// *** ***
// ** **
// * *
// ** **
// *** ***
// *******