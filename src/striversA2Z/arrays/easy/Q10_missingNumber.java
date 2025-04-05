package striversA2Z.arrays.easy;

public class Q10_missingNumber {

	public static int missingNumber(int[] nums) {
        long sum = 0;
        for(int i=0;i<nums.length;i++) {
        	sum+=nums[i];
        }
        
        long exSum = (nums.length * (nums.length+1))/2;
        
        return (int) (exSum-sum);
    }
	
	public static void main(String[] args) {
		int[] a = {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(a));
	}
}
