package striversA2Z.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class Q13_spiralMatrix {
	public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        boolean entry = false;
        while(top<=bottom && left<=right){            
            for(int i= left;i<=right;i++){
                entry = true;
                result.add(matrix[top][i]);
            }
            if(entry){
                entry = false;
                for(int i=top+1;i<=bottom;i++){
                    entry= true;
                    result.add(matrix[i][right]);
                }
            }
            if(entry){
                entry = false;
                for(int i=right-1;i>=left;i--){
                    entry = true;
                    result.add(matrix[bottom][i]);
                }
            }
            if(entry){
                entry = false;
                for(int i=bottom-1;i>top;i--){
                    result.add(matrix[i][left]);
                }
            }
            top++;
            left++;
            bottom--;
            right--;

        } 
        return result;
    }
	
	public static void main(String[] args) {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		List<Integer> arr = spiralOrder(mat);
		for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
	}
}
