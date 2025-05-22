public class Pattern14 {
    
    public static void createPattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j <= 'A' + i - 1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        createPattern(5);
    }
}
