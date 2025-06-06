public class BubbleSort {

	public static void sort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n-1; i++) {
			boolean swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					
					swapped = true;
				}
			}

			if (!swapped) {
				break;
			}
		}
		
		
	}

	public static void main(String[] args) {
		int[] arr = {10,4,2,6,3,7,1,8,9,5};
		sort(arr);
		for (int a : arr) {
			System.out.println(a);
		}
		
	}

}