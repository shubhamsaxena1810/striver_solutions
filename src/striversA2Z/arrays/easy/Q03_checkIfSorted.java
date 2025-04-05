package striversA2Z.arrays.easy;

public class Q03_checkIfSorted {

	public static boolean check(int[] nums) {
        boolean errorCheck = false;
        for(int i=0;i<nums.length;i++){
            int j=(i+1)%nums.length;
            if(nums[j]<nums[i] && !errorCheck){
                errorCheck = true;
            }else if(nums[j]<nums[i] && errorCheck){
                return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		int[] arr = {3,4,5,1,2};
		
		System.out.println(check(arr));
	}
}
