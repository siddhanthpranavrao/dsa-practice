public class GCFEuclidean {

    public static void GCDEuclidean(int n1, int n2) {

        while (n1 > 0 && n2 > 0) {
            if (n1 > n2)
                n1 = n1 % n2;
            else
                n2 = n2 % n1;
        }

        if (n1 == 0)
            System.out.println(n2);
        else
            System.out.println(n1);

    }

    public static void main(String[] args) {
        GCDEuclidean(52, 10);
    }
}
