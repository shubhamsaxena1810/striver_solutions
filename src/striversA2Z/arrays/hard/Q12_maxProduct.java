package striversA2Z.arrays.hard;

public class Q12_maxProduct {
	public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int prefix = 1;
        int suffix = 1;
        for(int i=0;i<nums.length;i++){
            if(prefix==0){
                prefix =1;
            }
            if(suffix==0){
                suffix =1;
            }

            prefix *= nums[i];
            suffix *= nums[nums.length- 1 -i];

            maxProduct = Math.max(maxProduct,Math.max(prefix,suffix));
        }

        return maxProduct;
    }
	
	public static void main(String[] args) {
		int[] nums = {2,3,-2,4};
		System.out.println(maxProduct(nums));
	}
}
