package striversA2Z.arrays.easy;

public class Q01_largestElement {

	public static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]>max) max= arr[i];
        }
        return max;
    }
	
	public static void main(String[] args) {
		int[] arr = {4, 1, 3, 9, 7};
		
		System.out.println(largest(arr));
	}
}
