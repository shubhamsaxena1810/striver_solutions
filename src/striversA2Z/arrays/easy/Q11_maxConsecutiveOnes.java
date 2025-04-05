package striversA2Z.arrays.easy;

public class Q11_maxConsecutiveOnes {

	public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]!=1) {
        		maxCount = Math.max(count, maxCount);
        		count=0;
        	}else count++;
        }
        maxCount = Math.max(count, maxCount);
        return maxCount;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,0,1,1,0,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
}
