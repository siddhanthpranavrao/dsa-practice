public class Pattern19 {

    public static void createPattern(int n) {

        for (int i = 1; i <= 2 * n; i++) {

            int stars = n - i + 1;
            int spaces = 2 * i - 2;

            if (i > n) {
                stars = i - n;
                spaces = 4 * n - 2 * i;
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        createPattern(5);
    }
}
