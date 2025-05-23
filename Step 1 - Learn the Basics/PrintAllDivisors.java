import java.util.ArrayList;

public class PrintAllDivisors {

    public static void printAllDivisors(int n) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                arr.add(i);

                if (i != n / i)
                    arr.add(n / i);
            }
        }

        arr.sort(null);
        for (int divisor : arr) {
            System.out.print(divisor + " ");
        }

    }

    public static void main(String[] args) {
        printAllDivisors(36);
    }
}
