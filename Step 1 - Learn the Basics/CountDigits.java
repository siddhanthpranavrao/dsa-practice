public class CountDigits {
    
    public static void countDigits(int n) {

        int counter = 0;

        while (n != 0) {
            counter++;
            n = n / 10;
        }

        System.out.println(counter);

    }

    public static void main(String[] args) {
        countDigits(12345678);
    }
}
