//common element between two arrays
public class common_element_bw2_arrays {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        int b[] = { 2, 3, 5, 6 };
       int i=0,j=0;
       while(i<a.length && j<b.length){
        if(a[i] == b[j]){
            System.out.println(a[i]);
            i++;
            j++;
        }else if (a[i] < b[j]){
            i++;
        }else{
            j++;
        }
       }
    }
}