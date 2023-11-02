public class Floyd_Triangle {
    public static void floydtriangle(int n) {
        // outer
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            // inner how many times counter will print
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floydtriangle(5);
    }

}
