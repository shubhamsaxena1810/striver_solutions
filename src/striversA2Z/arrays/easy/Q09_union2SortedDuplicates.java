package striversA2Z.arrays.easy;

import java.util.ArrayList;

public class Q09_union2SortedDuplicates {
	
	public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
		ArrayList<Integer> result = new ArrayList<>();
		int i=0 , j=0;
		
		while(i<a.length && j<b.length) {
			int temp;
			if(a[i]<b[j]) {
				temp = a[i];
			}else {
				temp = b[j];
			}
			
			while(i<a.length && a[i]==temp) i++;
			while(j<b.length && b[j]==temp) j++;
			
			result.add(temp);
		}
		
		if(i<a.length) {
			while(i<a.length) {
				int temp = a[i];
				while(i<a.length && a[i]==temp) i++;
				result.add(temp);
			}
		}
		
		if(j<b.length) {
			while(j<b.length) {
				int temp = b[j];
				while(j<b.length && b[j]==temp) j++;
				result.add(temp);
			}
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		int[] a = {2, 2, 3, 4, 5};
		int[] b = {1, 1, 2, 3, 4};
		
		System.out.println(findUnion(a, b));
	}
}
