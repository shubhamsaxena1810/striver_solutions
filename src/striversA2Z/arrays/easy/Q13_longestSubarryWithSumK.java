package striversA2Z.arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class Q13_longestSubarryWithSumK {
	public static int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer,Integer> hm = new HashMap<>();
        int maxLen=0;
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
        	sum+=arr[i];
        	if(sum==k) {
        		maxLen = Math.max(maxLen, i+1);
        	}
        	int rem = sum-k;
        	
        	if(hm.get(rem)!=null) {
        		maxLen = Math.max(maxLen, i-hm.get(rem));
        	}
        	
        	if(!hm.containsKey(sum)) {
        		hm.put(sum, i);
        	}
        }
        return maxLen;
    }
	
	public static void main(String[] args) {
		int[] arr = {-5, 8, -14, 2, 4, 12};
		System.out.println(longestSubarray(arr, -5));
	}
}
