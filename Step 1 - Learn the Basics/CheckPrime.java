public class CheckPrime {

    public static void checkPrime(int n) {

        int counter = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                counter++;

                if (i != n / i)
                    counter++;
            }
        }

        System.out.println(counter == 2);

    }

    public static void main(String[] args) {
        checkPrime(13);
    }
}
