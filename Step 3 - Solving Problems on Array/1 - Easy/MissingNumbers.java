public class MissingNumbers {
    
    public static int missingNumbers(int[] arr) {
        int n = arr.length;
        int calcSum = n * (n+1) / 2;
        int totalSum = 0;

        for (int a : arr) {
            totalSum += a;
        }

        return calcSum - totalSum;
    }

    public static int missingNumbersXOR(int[] arr) {
        int xor1 = 0; int xor2 = 0;
        int n =  arr.length;
        
        for (int i = 0; i < n; i++) {
            xor1 = xor1 ^ arr[i];
            xor2 = xor2 ^ (i+1);
        }

        return xor1 ^ xor2;
    }
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumbers(arr));
    }
}
