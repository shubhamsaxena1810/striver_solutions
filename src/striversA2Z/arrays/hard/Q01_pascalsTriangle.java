package striversA2Z.arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class Q01_pascalsTriangle {
	public static void generate(int numRows) {
//        List<List<Integer>> result = new ArrayList<>();

        for(int row=1;row<=numRows;row++){
            List<Integer> arr = new ArrayList<>();
            int ans = 1;
            arr.add(ans);
            for(int col=1;col<row;col++){
                ans = ans*(row-col);
                ans = ans/col;
                arr.add(ans);
            }
//            result.add(arr);
            System.out.println(arr);
        }
    }
	
	public static void main(String[] args) {
		generate(5);
	}
}
