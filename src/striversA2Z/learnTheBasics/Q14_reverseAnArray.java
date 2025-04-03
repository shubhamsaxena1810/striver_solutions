package striversA2Z.learnTheBasics;

public class Q14_reverseAnArray {
	
	public static void reverse(int arr[],int n) {
		if(n==-1) return;
		
		int l = arr.length - n -1;
		int temp = arr[n];
		arr[n] = arr[l];
		arr[l] = temp;
		
		reverse(arr,--n);
	}
	public static void reverseArray(int arr[]) {
		int n = (arr.length+1)/2;
		n--;
		reverse(arr,n);
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 4, 3, 2, 6, 5};
		reverseArray(arr);
		for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
	}
}
