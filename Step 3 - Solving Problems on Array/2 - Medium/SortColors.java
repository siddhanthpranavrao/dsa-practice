public class SortColors {

    public static void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }

    public static void sortColors(int[] arr) {
        int n = arr.length;
        int p1 = 0; int p2 = n - 1;

        // 2 & 0 Combo
        while (p1 < p2) {
            while (p1 < p2 && arr[p1] != 2)
                p1++;
            while (p1 < p2 && arr[p2] != 0)
                p2--;
            
            swap(arr, p1, p2);
        }

        // 2 & 1 Combo
        p1 = 0; p2 = n - 1;
        while (p1 < p2) {
            while (p1 < p2 && arr[p1] != 2)
                p1++;
            while (p1 < p2 && arr[p2] != 1)
                p2--;
            
            swap(arr, p1, p2);
        }

        // 0 & 1 Combo
        p1 = 0; p2 = n - 1;
        while (p1 < p2) {
            while (p1 < p2 && arr[p1] != 1)
                p1++;
            while (p1 < p2 && arr[p2] != 0)
                p2--;
            
            swap(arr, p1, p2);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,1,1};
        sortColors(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
