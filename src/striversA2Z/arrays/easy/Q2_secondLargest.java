package striversA2Z.arrays.easy;

public class Q2_secondLargest {

	public static int getSecondLargest(int[] arr) {
        // Code Here
		int second = Integer.MIN_VALUE;
		int first = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second = first;
				first = arr[i];
			}
			
			if(arr[i]>second && arr[i]<first) {
				second = arr[i];
			}
		}
		return second;
    }
	
	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34, 1};
		
		System.out.println(getSecondLargest(arr));
	}
}
