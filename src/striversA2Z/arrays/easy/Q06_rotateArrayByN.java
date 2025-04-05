package striversA2Z.arrays.easy;

public class Q06_rotateArrayByN {

	private static void reverse(int[] nums, int start, int end) {
		while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
	}

	public static void rotate(int[] nums, int k) {
		k = k%nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		rotate(nums,3);
		for(int i=0;i<nums.length;i++) System.out.println(nums[i]);
	}
}
