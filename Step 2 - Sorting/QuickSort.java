public class QuickSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2)
            return;

        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int pIndex = pivot(arr, low, high);
        quickSort(arr, low, pIndex - 1);
        quickSort(arr, pIndex + 1, high);
    }

    public static int pivot(int[] arr, int low, int high) {
        int left = low;
        int right = high;
        int pivot = arr[low];

        while (left < right) {
            while (arr[left] <= pivot && left <= high - 1) {
                left++;
            }

            while (arr[right] > pivot && right >= low + 1) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[right];
        arr[right] = temp;

        return right;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 3, 2, 6, 5, 4, 7, 9, 8, 1 };
        sort(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
