public class MoveZeros {
    public static void moveZeros(int[] arr) {
        int left = 0, right = 0;
        int n = arr.length;
        while (right < n) {
            if (arr[right] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0 };
        moveZeros(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
