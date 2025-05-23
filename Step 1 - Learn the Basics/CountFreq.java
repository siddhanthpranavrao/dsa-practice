import java.util.HashMap;

public class CountFreq {

    public static void frequency(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (freq.get(arr[i]) == null) {
                freq.put(arr[i], 1);
            } else {
                freq.put(arr[i], freq.get(arr[i]) + 1);
            }
        }

        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;

        for (HashMap.Entry<Integer, Integer> entry : freq.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > maxFreq) {
                maxFreq = value;
                maxEle = key;
            }
            if (value < minFreq) {
                minFreq = value;
                minEle = key;
            }
        }

        System.out.println("Element with max frequency: " + maxEle + " (Frequency: " + maxFreq + ")");
        System.out.println("Element with min frequency: " + minEle + " (Frequency: " + minFreq + ")");
    }
    
    

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,3,3,4,5,5,5,5,5,5,5};
        frequency(arr);
    }
}
