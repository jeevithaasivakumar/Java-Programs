// Input: [2,1,0,-8,-9]
// Output: 0.4 , 0.2 , 0.4
// First, find the total number of elements in the array = 5
// Find the total number of positive numbers=2
// Find the total number of neutral numbers=1
// (0 is the only neutral number)
// Find the total number of negative numbers=2
// Output = [ (no of positive number/length of the array), (no of neutral numbers/length of the array), (no of negative numbers/length of the array) ]
// =[⅖, ⅕, ⅖]
// =[0.4, 0.2, 0.4]

class posnegneu {
    static void positivenegativezero(int[] arr) {
        int len = arr.length;
        float poscount = 0;
        float negcount = 0;
        float zerocount = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] > 0) {
                poscount++;
            }
            if (arr[i] < 0) {
                negcount++;
            }
            if (arr[i] == 0) {
                zerocount++;
            }
        }
        System.out.printf("%1.4f", poscount / len);
        System.out.printf("%1.4f", negcount / len);
        System.out.printf("%1.4f", zerocount / len);

    }

    public static void main(String args[]) {
        int[] a1 = { 2, -1, 5, 6, 0, -3 };
        positivenegativezero(a1);
        int[] a2 = { 2, 1, 0, -8, -9 };
        positivenegativezero(a2);

        int[] a3 = { 4, 0, -2, -9, -7, 1 };
        positivenegativezero(a3);
    }
}