package striversA2Z.learnTheBasics;

import java.util.Arrays;

public class Q18_FrequencyOfMostFrequent {

	public static int maxFrequency(int[] nums, int k) {
		Arrays.sort(nums);
        int maxFreq = 0;
        long curSum = 0;
        int left = 0;

        for(int right=0; right<nums.length; right++){
            curSum += nums[right];

            while(curSum+k < (long) nums[right]*(right-left+1)){
                curSum -= nums[left];
                left++;
            }

            maxFreq = Math.max(maxFreq, right-left+1);
        }

        return maxFreq;
    }
	
	
	public static void main(String[] args) {
		int[] nums = {1,2,4};
		int k = 5;
		System.out.println(maxFrequency(nums, k));
	}
}
