package striversA2Z.arrays.easy;

public class Q8_sortedArraySearch {
	static int binarySearch(int arr[], int k){
        int low = 0;
        int high = arr.length -1;
        
        while(high>=low){
            int mid = (low+high)/2;
            
            if(arr[mid] == k){
                return mid;
            }else if(arr[mid]>k){
                high= mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        if(binarySearch(arr,k)!=-1){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
    	int[] nums = {1, 2, 3, 4, 6};
    	System.out.println(searchInSorted(nums, 6));
	}

}
