package striversA2Z.arrays.medium;

public class Q05_printMaxSubarray {

	public static void maxSubArray(int[] nums) {
		int sum = Integer.MIN_VALUE;
		int maxSum = Integer.MIN_VALUE;
		int start = 0, end =0;
		
		for(int i=0;i<nums.length;i++) {
			if(sum<0) {
				sum=0;
				start = i;
			}
			
			sum+=nums[i];
			if(maxSum<sum) {
				maxSum = sum;
				end = i;
			}
		}
		for(int i=start;i<=end;i++) System.out.println(nums[i]);
	}
	
	public static void main(String[] args) {
		int[] nums = {5,4,-1,7,8};
		maxSubArray(nums);
	}
}
