public class SingleNumber {

    public static int singleNumber(int[] arr) {
        int result = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            result ^= arr[i];
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
}
