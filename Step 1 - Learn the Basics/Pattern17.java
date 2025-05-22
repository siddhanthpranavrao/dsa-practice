public class Pattern17 {
    
    public static void createPattern(int n) {

        for (int i = 1; i <= n; i++) {
            // Space #1
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            char l = 'A';
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(l);
                
                if (j < i) l++;
                else l--;
            }


            // Space #2
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        createPattern(4);
    }
}
