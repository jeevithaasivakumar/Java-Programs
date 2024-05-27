public class nextgreaterelement {
    public static void main(String[] args) {
        int[] a = { 4, 5, 2, 25 };
        int next;
        for (int i = 0; i < a.length; i++) {
            next = -1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    next = a[j];
                    break;
                }
            }
            System.out.print(" " + next);
        }
    }
}