public class IsArraySorted {


    public static boolean isArraySorted(int[] arr) {
        if (arr == null)
            throw new IllegalArgumentException("Array is null or empty");

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7, 8, 8 };
        System.out.println(isArraySorted(arr));
    }
}
