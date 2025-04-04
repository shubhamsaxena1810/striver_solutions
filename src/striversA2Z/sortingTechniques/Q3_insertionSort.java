package striversA2Z.sortingTechniques;

public class Q3_insertionSort {

	public static void insertionSort(int arr[]) {
        for(int i=1;i<arr.length;i++) {
        	int j=i;
        	while(j>0 && arr[j-1]>arr[j]) {
        		int temp = arr[j];
    			arr[j] = arr[j-1];
    			arr[j-1] = temp;
    			j--;
        	}
        }
    }
	
	public static void main(String[] args) {
		int[] arr = {4, 1, 3, 9, 7};
		int n = arr.length;
		
		insertionSort(arr);
		
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}
