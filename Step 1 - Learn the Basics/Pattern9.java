public class Pattern9 {

    public static void createPattern1(int n) {
        for (int i = 1; i <= n; i++) {
            // Space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // Star
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }

            // Space
            for (int j = 0; j <= n-i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    
    public static void createPattern2(int n) {

        for (int i = 1;  i <= n; i++) {
            // Space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // Star
            for (int j = 1; j <= 2*(n-i)+1; j++) {
                System.out.print("*");
            }

            // Space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void createPattern(int n) {
        createPattern1(n);
        createPattern2(n);
    }
    

    public static void main(String[] args) {
        createPattern(5);
    }
}
