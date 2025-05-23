public class ReverseNumber {

    public static void reverseNum(int n) {

        int revNum = 0;
        while (n != 0) {
            int remainder = n % 10;
            revNum = 10*revNum + remainder;
            n = n / 10;
        }

        System.out.println(revNum);
    }

    public static void main(String[] args) {
        reverseNum(12345678);
    }
    
}
