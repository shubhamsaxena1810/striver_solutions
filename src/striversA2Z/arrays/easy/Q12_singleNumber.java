package striversA2Z.arrays.easy;

public class Q12_singleNumber {

	public static int singleNumber(int[] nums) {
		int xor = 0;
		for(int i=0;i<nums.length;i++) xor = xor^nums[i];
		return xor;
    }
	
	public static void main(String[] args) {
		int[] nums = {2,2,1};
		System.out.println(singleNumber(nums));
	}
}
