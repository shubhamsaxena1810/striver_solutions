package striversA2Z.sortingTechniques;

public class Q2_bubbleSort {

	public static void bubbleSort(int arr[]) {
        for(int i=0;i<arr.length;i++) {
        	for(int j=i+1;j<arr.length;j++) {
        		if(arr[j]<arr[i]) {
        			int temp = arr[j];
        			arr[j] = arr[i];
        			arr[i] = temp;
        		}
        	}
        }
    }
	
	public static void main(String[] args) {
		int[] arr = {4, 1, 3, 9, 7};
		int n = arr.length;
		
		bubbleSort(arr);
		
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}
