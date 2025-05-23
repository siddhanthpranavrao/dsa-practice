public class RecursionPalindrome {

    public static boolean checkPalindrome(String s, int n) {
        if (n >= s.length() / 2)
            return true;

        if (s.charAt(n) != s.charAt(s.length() - n - 1))
            return false;

        return checkPalindrome(s, n + 1);
    }

    public static void main(String[] args) {
        System.out.print(checkPalindrome("HannaH", 0));
    }

}
