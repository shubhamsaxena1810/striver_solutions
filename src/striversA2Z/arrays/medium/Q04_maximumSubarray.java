package striversA2Z.arrays.medium;

public class Q04_maximumSubarray {
	
	public static int maxSubArray(int[] nums) {
		int sum = Integer.MIN_VALUE;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++) {
			if(sum<0) {
				sum=0;
			}
			
			sum+=nums[i];
			maxSum = Math.max(maxSum, sum);
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		int[] nums = {-1};
		System.out.println(maxSubArray(nums));
	}
}
