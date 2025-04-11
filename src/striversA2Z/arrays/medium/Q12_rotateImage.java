package striversA2Z.arrays.medium;

public class Q12_rotateImage {
	
	public static void reverse(int[] mat) {
		int start = 0;
		int end = mat.length-1;
		while(start<end) {
			int temp = mat[start];
			mat[start] = mat[end];
			mat[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        }
    }
	
	public static void main(String[] args) {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(mat);
		for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j] + ",");
            }
            System.out.println();
        }
	}
}
