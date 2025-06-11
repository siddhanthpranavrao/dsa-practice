import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int diff = target - arr[i];
            if (map.get(diff) == null) {
                map.put(arr[i], i);
            } else {
                return new int[] {map.get(diff), i};
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] arr = {2,8,3,4,11,13,7,66,0};
        int target = 9;
        int[] result = twoSum(arr, target);
        for (int a : result) {
            System.out.println(a);
        }
    }
}
