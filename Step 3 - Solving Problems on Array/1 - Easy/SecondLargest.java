public class SecondLargest {


    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2)
            throw new IllegalArgumentException("Array must have more than 1 element");
        
        int n = arr.length;
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        boolean found = false;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
                found = true;
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
                found = true;
            }
        }

        if (!found)
            throw new IllegalArgumentException("No second Largest Element Found");

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,3,9,5,2,77,2,11,88,87,3};
        System.out.println(findSecondLargest(arr));
        System.out.println(Integer.MIN_VALUE);
    }
}
