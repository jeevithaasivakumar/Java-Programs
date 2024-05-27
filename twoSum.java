public class twoSum {
    public static void main(String[] args) {
        int[] a = {1, -2, 1, 0, 5};
        int sum = 0;
        int flag = 0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j] == sum){
                    flag =1;
                    break;
                }
            }
        }
        if(flag == 0)
        System.out.println("no");
        else
        System.out.println("yes");

    }
}
