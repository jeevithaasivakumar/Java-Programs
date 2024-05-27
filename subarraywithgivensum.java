public class subarraywithgivensum {
    public static void main(String[] args) {
        int[] a = { 33, 4, 10, 3, 10, 5 };
        int sum = 4;
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            int curr = a[i];
            if (curr == sum) {
                System.out.println(" " + i);
                found = true;
            }
            // return;
            else {
                for (int j = i + 1; j < a.length; j++) {
                    curr += a[j];

                    if (curr == sum) {
                        System.out.println(i + " " + j + " ");
                                        found = true;

                    }
                }
            }

        }
        if(!found)
            System.out.println("no");

    }

}
