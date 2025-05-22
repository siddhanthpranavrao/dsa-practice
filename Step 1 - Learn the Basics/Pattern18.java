public class Pattern18 {
    
    public static void createPattern(int n) {
        
        for (int i = 1; i <= n; i++) {
            char l = (char)('A' + n - i);
            for (int j = 1; j <= i; j++) {
                System.out.print(l);
                l++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        createPattern(5);
    }
}
