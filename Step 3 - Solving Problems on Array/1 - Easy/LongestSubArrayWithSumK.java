import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
    public static int longestSubArrayNegatives(int[] arr, int n, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = i + 1;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }
        }
        return maxLen;
    }

    public static int longestSubArray(int[] arr, int n, int k) {

        int l = 0;
        int sum = 0;
        int p1 = 0;
        int p2 = 0;

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
        int[] arr = { 2, 3, 5, 1, 9 };
        int k = 10;
        int n = 5;
        System.out.println(longestSubArray(arr, n, k));
    }
}
