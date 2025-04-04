package striversA2Z.sortingTechniques;

public class Q4_mergeSort {

	static void mergeSort(int arr[], int l, int r) {
        // code here
		if(l>=r) return;
		int mid = (l+r)/2;
		mergeSort(arr,l,mid);
		mergeSort(arr,mid+1,r);
		merge(arr,l,mid,r);
    }
	
	static void merge(int arr[], int l, int mid, int r) {
		int[] temp = new int[r-l+1];
		int i=l;
		int j = mid+1;
		int k=0;
		while(i<=mid && j<=r) {
			if(arr[i]<=arr[j]) {
				temp[k] = arr[i];
				i++;
			}else {
				temp[k] = arr[j];
				j++;
			}
			k++;
		}
		
		if(i<=mid) {
			while(i<=mid) {
				temp[k] = arr[i];
				i++;
				k++;
			}
		}
		
		if(j<=r) {
			while(j<=r) {
				temp[k] = arr[j];
				j++;
				k++;
			}
		}
		
		for(int a=l;a<=r;a++) {
			arr[a] = temp[a-l];
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 1, 3, 9, 7};
		int n = arr.length;
		
		mergeSort(arr,0, arr.length-1);
		
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}
