public class longestincreasingsubsequence {
    public static void main(String[] args) {
       int[] a = {4, 2, 1, 0,3};
       int count = 1;
       for(int i=0;i<a.length;i++){
                    // int count =1;

        for(int j=i+1;j<a.length;j++){
            if(a[i] < a[j] ){
                count++;
                i++;
                
                
            }
           
        }
       }
       System.out.println(count+" ");
    }
}
