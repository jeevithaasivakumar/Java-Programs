public class spiralmatrix {
    public static void main(String[] args) {

        int[][] a = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int rs = 0;
        int re = a.length - 1;
        int cs = 0;
        int ce = a[0].length - 1;
        while (rs < re && cs < ce) {
            for (int i = cs; i <= ce; i++) {
                System.out.print(a[rs][i] + " ");
            }
            rs++;
            for (int i = rs; i <= re; i++) {
                System.out.print(a[i][ce] + " ");
            }
            ce--;
            if (rs <= re) {
                for (int i = ce ; i >= cs; i--) {
                    System.out.print(a[re][i] + " ");
                }
                re--;
            }
            if (cs <= ce) {
                for (int i = re ; i >= rs; i--) {
                    System.out.print(a[i][cs] + " ");
                }
                cs++;
            }
        }
    }
}
