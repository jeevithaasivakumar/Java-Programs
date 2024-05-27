import java.util.Scanner;

public class matrix_upper {
    public static void main(String[] args) {
        // int arr[][]={
        //             {1,2,3},
        //              {4,5,6},
        //              {7,8,9}
        //              };
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+i + " " +j);
                arr[i][j] = sc.nextInt();
            }
        }

                    for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[0].length;j++){
                            if(i<j){
                                System.out.print('0');
                            }
                            else{
                                System.out.print(arr[i][j]+ " ");
                            }
                        }
                    System.out.println();

                    }

    }
}
