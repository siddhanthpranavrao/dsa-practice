public class ArmstrongNum {
    
    public static void armstrongNumbers(int n) {
        int initialNum = n;
        int sum = 0;

        while (n != 0) {
            int remainder = n % 10;
            sum += Math.pow(remainder, 3);
            n = n / 10;
        }

        System.out.println(initialNum == sum);
    }

    public static void main(String[] ArmstrongNum) {
        armstrongNumbers(153);
    }
}
