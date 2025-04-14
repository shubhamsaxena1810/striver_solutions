package striversA2Z.arrays.hard;

public class Q08_mergeSortedArray {
	public static void swapIfGreater(int[] arr1, int[] arr2, int ind1, int ind2) {
        if (arr1[ind1] > arr2[ind2]) {
            int temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }
    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        int len = n + m;

        // Initial gap:
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            // Place 2 pointers:
            int left = 0;
            int right = left + gap;
            while (right < len) {
                // case 1: left in arr1[]
                //and right in arr2[]:
                if (left < m && right >= m) {
                    swapIfGreater(arr1, arr2, left, right - m);
                }
                // case 2: both pointers in arr2[]:
                else if (left >= m) {
                    swapIfGreater(arr2, arr2, left - m, right - m);
                }
                // case 3: both pointers in arr1[]:
                else {
                    swapIfGreater(arr1, arr1, left, right);
                }
                left++; right++;
            }
            // break if iteration gap=1 is completed:
            if (gap == 1) break;

            // Otherwise, calculate new gap:
            gap = (gap / 2) + (gap % 2);
        }

        for(int k = 0;k<n;k++){
            arr1[k+m] = arr2[k];
        }
    }
    
    public static void main(String[] args) {
    	int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
    	int m = 3, n = 3;
    	merge(nums1, m, nums2, n);
    	for(int i:nums1) System.out.println(i);
	}
}
