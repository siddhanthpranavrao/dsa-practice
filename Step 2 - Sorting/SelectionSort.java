public class SelectionSort {
	
	public static void sort(int[] arr) {
		
		int n = arr.length;
		
		for (int i = 0; i < n; i++)	 {
			
			int minIndex = i;
			for (int j = i+1; j < n; j++) {
				
				if (arr[j] < arr[minIndex])
					minIndex = j;
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
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