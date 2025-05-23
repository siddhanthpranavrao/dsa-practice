public class GCF {

    public static void GCD(int n1, int n2) {

        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        System.out.println(gcd);
    }

    public static void main(String[] args) {
        GCD(20, 40);
    }
}
