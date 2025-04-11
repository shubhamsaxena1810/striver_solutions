package striversA2Z.arrays.medium;

public class Q11_setMatrixZero {

	public static void setZeroes(int[][] matrix) {
        // col record = matrix[0][..]
        // row record = matrix[..][0]

        int col1 = 1;
        int m = matrix[0].length;
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j!=0){
                       matrix[0][j] = 0;
                    }else{
                        col1 = 0;
                    }
                }
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int j=0;j<m;j++){
                matrix[0][j] = 0;
            }
        }
        if(col1 == 0){
            for(int i=0;i<n;i++){
                matrix[i][0] = 0;
            }
        }
    }
	
	public static void main(String[] args) {
		int[][] mat = {{1,1,1},{1,0,1},{1,1,1}};
		setZeroes(mat);
		for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j] + ",");
            }
            System.out.println();
        }
	}
}
