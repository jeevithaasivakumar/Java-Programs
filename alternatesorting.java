import java.util.Arrays;

public class alternatesorting {
    static void alternatesort(int a[])
    {
        Arrays.sort(a);
        //1 2 3 4 5 6 7
        int i =0 ;
        int j =a.length -1;
        while(i<j){
            System.out.print(a[j--] + " ");
                        System.out.print(a[i++] + " ");

        }
    }
    //ip : 1 2 3 4 5 6 7
    //op : 7 1 6 2 5 3 4
    
   
    public static void main (String[] args){
        int a[] = {1,2,3,4,5,6,7};
        alternatesort(a);
    }
}
