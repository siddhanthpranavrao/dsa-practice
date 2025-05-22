import java.util.HashMap;

public class Pattern8 {
    
    public static void createPattern(int n) {

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


    public static void main(String[] args) {
        createPattern(5);

        
    }
}
