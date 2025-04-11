package striversA2Z.arrays.medium;

import java.util.HashMap;

public class Q14_subarraySumEqualsK {
	
	public static int subarraySum(int[] nums, int k) {
        int currentSum=0;
        HashMap<Integer,Integer> prefixSum = new HashMap<>();
        int count=0;
        prefixSum.put(currentSum,1);
        for(int i=0;i<nums.length;i++){
            currentSum += nums[i];
            int rem = currentSum - k;
            if(prefixSum.containsKey(rem)){
                count+= prefixSum.get(rem);
            }
            if(prefixSum.containsKey(currentSum)){
                prefixSum.replace(currentSum,prefixSum.get(currentSum)+1);
            }else{
                prefixSum.put(currentSum,1);
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		int[] nums= {1,1,1};
		System.out.println(subarraySum(nums, 2));
	}
}
