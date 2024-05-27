// // package Day 2;
// Sample Input 0

// 2

// 5

// 1 3 3 10 2

// 6

// 2 4 6 3 1 1

// Sample Output 0

// 180 60 60 18 90

// 72 36 24 48 144 144

// Explanation 0

// Test case 1: Product of elements except 1 = 3 * 3 * 10 * 2 = 180

// Product of elements except 3 = 1 * 3 * 10 * 2 = 60

// Product of elements except 3 = 1 * 3 * 10 * 2 = 60

// Product of elements except 10 = 1 * 3 * 3 * 2 = 18

// Product of elements except 2 = 1 * 3 * 3 * 10 = 90

// Test case 2: Product of elements except 2 = 4 * 6 * 3 * 1 * 1 = 72

// Product of elements except 4 = 2 * 6 * 3 * 1 * 1 = 36

// Product of elements except 6 = 2 * 4 * 3 * 1 * 1 = 24

// Product of elements except 3 = 2 * 4 * 6 * 1 * 1 = 48

// Product of elements except 1 = 2 * 4 * 6 * 1 * 1 = 144

// Product of elements except 1 = 2 * 4 * 6 * 3 * 1 = 144
public class productelements {
      public static int[] productExceptSelf(int[] nums) {
        if( nums == null || nums.length == 0)
        return new int[0];
        int[] result = new int[nums.length];
        int p =1;
        for(int i= 0; i<nums.length; i++){
            result[i] = p;
            p *= nums[i];
        }
        p = 1;
        for(int i = nums.length-1; i>=0; i--){
            result[i] *= p;
             p *=nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        // int n =4;
        int[] nums= {1,2,3,4};
        int[] result = productExceptSelf(nums);

        System.out.println("Product Except Self:");
        for (int num : result) {
            System.out.print(num + " ");
    }
}
}
