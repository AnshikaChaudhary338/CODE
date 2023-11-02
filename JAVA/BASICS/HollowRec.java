public class HollowRec {
    public static void hollow_rec(int totrow, int totcols) {
        // outer loop
        for (int i = 1; i <= totrow; i++) {
            // inner - column
            for (int j = 1; j <= totcols; j++) {
                // boundary cells
                if (i == 1 || i == totrow || j == 1 || j == totcols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        hollow_rec(4, 5);

    }

}
