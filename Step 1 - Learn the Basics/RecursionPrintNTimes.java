public class RecursionPrintNTimes {

    public static void printNTimes(String s, int n) {
        if (n <= 0)
            return;

        System.out.println(s);
        printNTimes(s, n - 1);
    }

    public static void main(String[] args) {
        printNTimes("Hello Java!", 10);
    }
}
