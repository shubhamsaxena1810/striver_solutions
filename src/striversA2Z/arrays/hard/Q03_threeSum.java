package striversA2Z.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q03_threeSum {

	public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        HashSet<List<Integer>> resultList = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k = nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                    resultList.add(list);
                    j++;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    k--;
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return new ArrayList<>(resultList);
    }
	
	public static void main(String[] args) {
		int[] arr = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(arr));
	}
}
