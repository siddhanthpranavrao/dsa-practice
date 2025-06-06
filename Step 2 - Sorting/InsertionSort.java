public class InsertionSort {
	
	public static void sort(int[] arr) {
		
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;

				j--;
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {10,3,2,6,5,4,7,9,8,22};
		sort(arr);
		for (int a : arr) {
			System.out.println(a);
		}
		
	}
}