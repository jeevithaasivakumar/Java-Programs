public class largestContiguousSum {
    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3};
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int i=0;i<a.length; i++){
            curr += a[i];
            if(max < curr){
                max = curr;
            }
            if(curr < 0){
                curr = 0;
            }
        }
        System.out.println(max);
    }
}
