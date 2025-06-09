public class RemoveDuplicates {

    public static void removeDuplicates(int[] arr) {
        if (arr == null || arr.length < 2) return;

        int n = arr.length;
        int i = 0;
        int j= 1;

        while (i < n && j < n) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4,5,5,5,5,6};
        removeDuplicates(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }

}
