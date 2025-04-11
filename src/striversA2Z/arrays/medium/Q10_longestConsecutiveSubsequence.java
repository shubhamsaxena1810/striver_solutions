package striversA2Z.arrays.medium;

import java.util.HashSet;

public class Q10_longestConsecutiveSubsequence {

	public static int longestConsecutive(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		int maxLen = 0;
		int len = 0;
		
		for(int element: nums) {
			set.add(element);
		}
		
		for(Integer i: set){
            len = 1;
            if(!set.contains(i-1)){
                int j = i;
                while(set.contains(j+1)){
                    j++;
                    len++;
                }
            }
            maxLen = Math.max(maxLen,len);
        }
		return maxLen;
	}
	
	public static void main(String[] args) {
		int[] nums = {100,4,200,1,3,2};
		System.out.println(longestConsecutive(nums));
	}
}
