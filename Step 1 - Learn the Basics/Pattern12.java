public class Pattern12 {
    
    public static void createPattern(int n) {

        for (int i = 1; i <= n; i++) {
            // Number #1
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Space
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }

            // Number #2
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        createPattern(4);
    }
}
