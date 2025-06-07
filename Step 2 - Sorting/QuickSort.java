public class QuickSort {


    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) return;

        quickSort(arr, 0, arr.length-1);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int pIndex = pivot(arr, low, high);
        quickSort(arr, low, pIndex-1);
        quickSort(arr, pIndex+1, high);
    }
    
    public static int pivot(int[] arr, int low, int high) {
        int pivot = arr[low];
        int l = low;
        int r = high;

        while(l < r) {
            while (l <= high - 1 && arr[l] <= pivot)
                l++;
            
            while (r >= low + 1 && arr[r] > pivot)
                r--;

            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }

        int temp = arr[r];
        arr[r] = arr[low];
        arr[low] = temp;

        return r;
    }


    public static void main(String[] args) {
        int[] arr = { 10, 3, 2, 6, 5, 4, 7, 9, 8, 1 };
        sort(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
