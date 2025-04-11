package striversA2Z.arrays.medium;

import java.util.ArrayList;

public class Q09_leadersInAnArray {

	public static ArrayList<Integer> leaders(int[] nums) {
		int max = Integer.MIN_VALUE;
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=nums.length-1;i>=0;i--) {
			if(nums[i]>max) {
				result.add(0, nums[i]);
			}
			
			max= Math.max(max, nums[i]);
		}
		return result;
    }
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 5, 3, 1, 2};
		System.out.println(leaders(nums));
	}
}
