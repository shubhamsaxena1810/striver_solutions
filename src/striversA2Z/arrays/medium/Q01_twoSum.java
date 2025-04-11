package striversA2Z.arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class Q01_twoSum {

	public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
        	int rem = target - nums[i];
        	if(hm.containsKey(rem)) {
        		int[] arr = {hm.get(rem),i};
        		return arr;
        	}else {
        		hm.put(nums[i], i);
        	}
        }
        return null;
    }
	
	public static void main(String[] args) {
		int[] nums = {3,2,4};
		int[] result = twoSum(nums,6);
		System.out.println(result[0]+ "," + result[1]);
	}
}
