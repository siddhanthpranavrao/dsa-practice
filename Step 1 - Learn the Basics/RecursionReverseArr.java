public class RecursionReverseArr {

    public static void reverseArr(int[] arr) {
        if (arr == null || arr.length < 2) return;

        reverse(arr, 0, arr.length - 1);

    }
    
    public static void reverse(int[] arr, int left, int right) {
        if (left >= right) return;

        
        arr[left] = arr[left] ^ arr[right];
        arr[right] = arr[left] ^ arr[right];
        arr[left] = arr[left] ^ arr[right];
        
        reverse(arr, left+1, right-1);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseArr(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
