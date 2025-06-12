public class MajorityElement {

    public static int majorityElement(int[] arr) {
        int el = 0; int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                el = arr[i];
                count = 1;
            } else if (arr[i] == el) {
                count++;
            } else {
                count--;
            }
        }

        return el;
    }
    public static void main(String[] args) {
        int[] arr = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        System.out.println(majorityElement(arr));
    }
}
