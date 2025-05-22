
public class Pattern2 {

    public static void createPattern(int n) {

        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        createPattern(5);

    }

    
}
