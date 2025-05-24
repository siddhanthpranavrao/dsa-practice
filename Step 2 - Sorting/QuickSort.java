public class QuickSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int pIndex = partition(arr, low, high);
        quickSort(arr, low, pIndex - 1);
        quickSort(arr, pIndex + 1, high);
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int left = low + 1;
        int right = high;

        while (left <= right) {
            while (left <= high && arr[left] <= pivot) left++;
            while (right >= low && arr[right] > pivot) right--;

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        // swap pivot with arr[right]
        int temp = arr[low];
        arr[low] = arr[right];
        arr[right] = temp;

        return right;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 2, 6, 5, 4, 7, 9, 8, 1};
        sort(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
