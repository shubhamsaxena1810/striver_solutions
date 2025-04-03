package striversA2Z.learnTheBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q17_countingFrequencies {

	public static List<Integer> frequencyCount(int[] arr) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
        	hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        
        List<Integer> result = new ArrayList<>();
        for(int i=1;i<=arr.length;i++) {
        	result.add(hm.getOrDefault(i, 0));
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		
		int[] arr = {2, 3, 2, 3, 5};
		System.out.println(frequencyCount(arr));
	}
}
