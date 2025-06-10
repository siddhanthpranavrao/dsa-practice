public class LongestSubArrayWithSumK {

    public static int longestSubArray(int[] arr, int n, int k) {

        int l = 0; int sum = 0;
        int p1 = 0; int p2 = 0;
        
        while (p2 < n) {
            sum += arr[p2];
            while (sum > k && p1 <= p2) {
                sum -= arr[p1];
                p1++;
            }
            if (sum == k) {
                if (l < p2 - p1 + 1) {
                    l = p2 - p1 + 1;
                }
            }
            p2++;
        }
        return l;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        int k = 10; int n = 5;
        System.out.println(longestSubArray(arr, n, k));
    }
}
