
public class Solution {
	public static void main(String[] args) {
		int[][] matrix0 = {{1,2},{3,4}};
		int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrix2 = {{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}};
		int[][] matrix3 = {{5,1,9,11,21,26},{2,4,8,10,22,27},{13,3,6,7,23,28},{15,14,12,16,24,29},{17,18,19,20,25,30},{31,32,33,34,35,36}};
		System.out.println(displayMatrix(matrix2));
		rotate(matrix2);
	}
	
    public static void rotate(int[][] matrix) {
        int lastIndex = matrix.length - 1, temp1, temp2, k;
        k = lastIndex - 1;
        for (int i = 0; i <= (int) Math.floor(k/2); i++) {
        	for (int j = i; j <= k - i; j++) {
        		temp1 = matrix[j][lastIndex - i];
        		matrix[j][lastIndex - i] = matrix[i][j];
        		temp2 = matrix[lastIndex - i][lastIndex - j];
        		matrix[lastIndex - i][lastIndex - j] = temp1;
        		temp1 = matrix[lastIndex - j][i];
        		matrix[lastIndex - j][i] = temp2;
        		matrix[i][j] = temp1;
        	}
        }
        System.out.println(displayMatrix(matrix));
    }
    
    public static String displayMatrix(int[][] matrix) {
    	String str = "";
    	for (int i = 0; i < matrix.length; i++) {
    		for (int j = 0; j < matrix.length; j++) {
    			str += " " + matrix[i][j];
    		}
    		str += "\n";
    	}
    	return str;
    }

}
