package striversA2Z.sortingTechniques;

public class Q5_quickSort {

	static void quickSort(int arr[], int low, int high) {
        // code here
		if(low<high) {
			int pivot = partition(arr,low,high);
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}else return;
    }

    static int partition(int arr[], int low, int high) {
        // your code here
    	int i= low;
    	int j=high;
    	int pivot = arr[low];
    	while(i<j) {
    		while(arr[i]<=pivot && i<high) {
    			i++;
    		}
    		while(arr[j]>pivot && j>low){
    			j--;
    		}
    		
    		if(i<j) {
    			int temp = arr[i];
    			arr[i] = arr[j];
    			arr[j] = temp;
    		}
    	}
    	int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;
    	return j;
    }
    
    public static void main(String[] args) {
		int[] arr = {4, 1, 3, 9, 7};
		int n = arr.length;
		
		quickSort(arr,0, arr.length-1);
		
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}
