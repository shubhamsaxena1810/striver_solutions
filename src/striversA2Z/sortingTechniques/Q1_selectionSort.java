package striversA2Z.sortingTechniques;

public class Q1_selectionSort {
	private static void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<n-1;i++){
	        int minIndex = i;
	        for(int j=i+1;j<n;j++){
	            if(arr[j]<arr[minIndex]){
	                minIndex = j;
	            }
	        }
	        int temp = arr[i];
	        arr[i] = arr[minIndex];
	        arr[minIndex] = temp;
	    }
	}

	public static void main(String[] args) {
		int[] arr = {4, 1, 3, 9, 7};
		int n = arr.length;
		
		selectionSort(arr, n);
		
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}
