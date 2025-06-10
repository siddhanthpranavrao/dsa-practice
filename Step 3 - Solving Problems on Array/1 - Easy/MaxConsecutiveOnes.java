public class MaxConsecutiveOnes {

    public static int maxConsecutiveOnes(int[] arr) {
        if (arr == null)
            throw new IllegalArgumentException("Array cannot be null");

        int n = arr.length;
        int p1 = 0;
        int p2 = 0;
        int maxOnes = 0;

        while (p1 < n && p2 < n) {
            if (arr[p2] == 1)
                p2++;

            else if (arr[p2] == 0) {
                if (maxOnes < p2 - p1)
                    maxOnes = p2 - p1;
                p2++;
                p1 = p2;
            }
        }

        if (maxOnes < p2 - p1)
            maxOnes = p2 - p1;

        return maxOnes;
    }

    public static void main(String[] args) {
        int[] arr = {  };
        System.out.println(maxConsecutiveOnes(arr));
    }
}
