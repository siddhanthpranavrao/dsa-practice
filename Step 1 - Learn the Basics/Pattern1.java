public class Pattern1 {

    public static void createPattern(int n) {
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        createPattern(5);
    }
}
