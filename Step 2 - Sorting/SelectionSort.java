public class SelectionSort {
	
	public static void sort(int[] arr) { 

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i; j < n; j++) {
				if (arr[min] > arr[j])
					min = j;
			}

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
	} 
	
	public static void main(String[] args) {
		int[] arr = {10,4,2,6,3,7,9,1};
		sort(arr);
		for (int a : arr) {
			System.out.println(a);
		}
		
	}
} 