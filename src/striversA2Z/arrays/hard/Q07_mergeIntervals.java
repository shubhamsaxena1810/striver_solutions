package striversA2Z.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;

public class Q07_mergeIntervals {
	public static int[][] merge(int[][] intervals) {
        int lower = 0;
        int higher = lower;
        // int[][] result = new int[intervals.length][2];
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> result = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            if(result.isEmpty() || result.get(result.size()-1)[1]<intervals[i][0]){
                result.add(intervals[i]);
            }else{
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1],intervals[i][1]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
	
	public static void main(String[] args) {
		int[][] nums = {{1,3},{2,6},{8,10},{15,18}};
		int[][] res = merge(nums);
		for(int i=0;i<res.length;i++) System.out.println(res[i][0]+ ","+ res[i][1]);
	}
}
