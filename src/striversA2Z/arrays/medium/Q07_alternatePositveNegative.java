package striversA2Z.arrays.medium;

public class Q07_alternatePositveNegative {
	
	public static int[] rearrangeArray(int[] nums) {
		int pos = 0;
		int neg = 1;
		int[] res = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]> 0) {
				res[pos]=nums[i];
				pos+=2;
			}else {
				res[neg]=nums[i];
				neg+=2;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] nums = {3,1,-2,-5,2,-4};
		int[] res = rearrangeArray(nums);
		for(int i=0;i<res.length;i++) System.out.println(res[i]);
	}
}
