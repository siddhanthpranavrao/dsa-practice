public class LargestElement {

    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
        throw new IllegalArgumentException("Array must not be empty");
    }

        int max = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,3,8,4,7,11,3,9};
        System.out.println(findLargest(arr));
    }
    
}
