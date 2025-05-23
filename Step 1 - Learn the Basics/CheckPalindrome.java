public class CheckPalindrome {

    
    public static boolean checkPalindrome(int n) {
        int reverse = reverseNum(n);

        return n == reverse;
    }

    public static int reverseNum(int n) {
        
        int reverse = 0;

        while (n != 0) {
            int rem = n % 10;
            reverse = reverse*10 + rem;
            n = n / 10;
        }

        return reverse;
    }
    

    public static void main(String[] args) {
        System.out.println(checkPalindrome(1234321));
    }
}
