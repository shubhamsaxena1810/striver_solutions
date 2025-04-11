package striversA2Z.arrays.medium;

public class Q08_nextPermutation {
	
	public static void reverseArraySection(int[] nums, int start, int end) {
        while (start < end) {
            // Swap elements at start and end
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            
            // Move the pointers towards each other
            start++;
            end--;
        }
    }
    public static void nextPermutation(int[] nums) {
    	int index = -1;
    	for(int i=nums.length-2;i>=0;i--) {
    		if(nums[i]<nums[i+1]) {
    			index = i;
    			break;
    		}
    	}
    	
    	if(index==-1) {
    		reverseArraySection(nums, 0, nums.length-1);
    		return;
    	}
    	
    	for(int i=nums.length-1;i>=0;i--) {
    		if(nums[i]>nums[index]) {
    			int temp = nums[i];
    			nums[i] = nums[index];
    			nums[index] = temp;
    			break;
    		}
    	}
    	
    	reverseArraySection(nums, index+1, nums.length-1);
    }
    
    public static void main(String[] args) {
		int[] nums = {1,1,5};
		nextPermutation(nums);
		for(int i=0;i<nums.length;i++) System.out.println(nums[i]);;
	}
}
