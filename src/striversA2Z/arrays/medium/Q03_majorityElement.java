package striversA2Z.arrays.medium;

public class Q03_majorityElement {
	
	public static int majorityElement(int[] nums) {
		
		int count=0;
		int curr=0;
		
		for(int i=0;i<nums.length;i++) {
			if(count==0) {
				curr = nums[i];
			}
			
			if(curr==nums[i]) {
				count++;
			}else {
				count--;
			}
		}
		return curr;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
	}
}
