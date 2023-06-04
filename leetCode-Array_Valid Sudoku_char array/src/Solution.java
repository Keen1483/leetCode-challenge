
public class Solution {

	public static void main(String[] args) {
		char[][] board = 
			{{'5','3','.','.','7','.','.','.','.'}
						,{'6','.','.','1','9','5','.','.','.'}
						,{'.','9','8','.','.','.','.','6','.'}
						,{'8','.','.','.','6','.','.','.','3'}
						,{'4','.','.','8','.','3','.','.','1'}
						,{'7','.','.','.','2','.','.','.','6'}
						,{'.','6','.','.','.','.','2','8','.'}
						,{'.','.','.','4','1','9','.','.','5'}
						,{'.','.','.','.','8','.','.','7','9'}};
		
		char[][] board2 = 
			{{'8','3','.','.','7','.','.','.','.'}
						,{'6','.','.','1','9','5','.','.','.'}
						,{'.','9','8','.','.','.','.','6','.'}
						,{'8','.','.','.','6','.','.','.','3'}
						,{'4','.','.','8','.','3','.','.','1'}
						,{'7','.','.','.','2','.','.','.','6'}
						,{'.','6','.','.','.','.','2','8','.'}
						,{'.','.','.','4','1','9','.','.','5'}
						,{'.','.','.','.','8','.','.','7','9'}};
		
		boolean valid = isValidSudoku(board);
		System.out.println(valid);
	}
	
    public static boolean isValidSudoku(char[][] board) {
    	int temp;
		char str, dot = '.';
        // check items
    	for (int i = 0; i < 9; i++) {
    		for (int j = 0; j < 9; j++) {
    			if (board[i][j] != dot) {
    				temp = Integer.parseInt(String.valueOf(board[i][j]));
    				if (temp < 1 || temp > 9) {
    					return false;
    				}
    			}
    		}
    	}
    	
    	// check rows
    	for (int i = 0; i < 9; i++) {
    		for (int j = 0; j < 9; j++) {
    			if (board[i][j] != dot) {
    				for (int k = j + 1; k < 9; k++) {
    					if (board[i][k] != dot && board[i][j] == board[i][k]) {
    						return false;
    					}
    				}
    			}
    		}
    	}
    	
    	// check columns
    	for (int j = 0; j < 9; j++) {
    		for (int i = 0; i < 9; i++) {
    			if (board[i][j] != dot) {
    				for (int k = i + 1; k < 9; k++) {
    					if (board[k][j] != dot && board[i][j] == board[k][j]) {
    						return false;
    					}
    				}
    			}
    		}
    	}
    	
    	// check 3 × 3
    	for (int i = 0, j = 1, k = 2; i < 7 && j < 8 && k < 9; i += 3, j += 3, k += 3) {
    		for (int l = 0, m = 1, n = 2; l < 7 && m < 8 && n < 9; l += 3, m += 3, n += 3) {
    			// i
    			if (board[i][l] != dot) {
    				str = board[i][l];
    				if ( (board[j][m] != dot && str == board[j][m]) ||
    						(board[j][n] != dot && str == board[j][n]) ||
    						(board[k][m] != dot && str == board[k][m]) ||
    						(board[k][n] != dot && str == board[k][n]) ) {
    					return false;
    				}
    			}
    			if (board[i][m] != dot) {
    				str = board[i][m];
    				if ( (board[j][l] !=dot && str == board[j][l]) ||
    						(board[j][n] != dot && str == board[j][n]) ||
    						(board[k][l] != dot && str == board[k][l]) ||
    						(board[k][n] != dot && str == board[k][n]) ) {
    					return false;
    				}
    			}
    			if (board[i][n] != dot) {
    				str = board[i][n];
    				if ( (board[j][l] != dot && str == board[j][l]) ||
    						(board[j][m] != dot && str == board[j][m]) ||
    						(board[k][l] != dot && str == board[k][l]) ||
    						(board[k][m] != dot && str == board[k][m]) ) {
    					return false;
    				}
    			}
    			
    			// j
    			if (board[j][l] != dot) {
    				str = board[j][l];
    				if ( (board[i][m] != dot && str == board[i][m]) ||
    						(board[i][n] != dot && str == board[i][n]) ||
    						(board[k][m] != dot && str == board[k][m]) ||
    						(board[k][n] != dot && str == board[k][n]) ) {
    					return false;
    				}
    			}
    			if (board[j][m] != dot) {
    				str = board[j][m];
    				if ( (board[i][l] != dot && str == board[i][l]) ||
    						(board[j][n] != dot && str == board[j][n]) ||
    						(board[k][l] != dot && str == board[k][l]) ||
    						(board[k][n] != dot && str == board[k][n]) ) {
    					return false;
    				}
    			}
    			if (board[j][n] != dot) {
    				str = board[j][n];
    				if ( (board[j][l] != dot && str == board[j][l]) ||
    						(board[j][m] != dot && str == board[j][m]) ||
    						(board[k][l] != dot && str == board[k][l]) ||
    						(board[k][m] != dot && str == board[k][m]) ) {
    					return false;
    				}
    			}
    			
    			// k
    			if (board[k][l] != dot) {
    				str = board[k][l];
    				if ( (board[j][m] != dot && str == board[j][m]) ||
    						(board[j][n] != dot && str == board[j][n]) ||
    						(board[i][m] != dot && str == board[i][m]) ||
    						(board[i][n] != dot && str == board[i][n]) ) {
    					return false;
    				}
    			}
    			if (board[k][m] != dot) {
    				str = board[k][m];
    				if ( (board[j][l] != dot && str == board[j][l]) ||
    						(board[j][n] != dot && str == board[j][n]) ||
    						(board[i][l] != dot && str == board[i][l]) ||
    						(board[i][n] != dot && str == board[i][n]) ) {
    					return false;
    				}
    			}
    			if (board[k][n] != dot) {
    				str = board[k][n];
    				if ( (board[j][l] != dot && str == board[j][l]) ||
    						(board[j][m] != dot && str == board[j][m]) ||
    						(board[i][l] != dot && str == board[i][l]) ||
    						(board[i][m] != dot && str == board[i][m]) ) {
    					return false;
    				}
    			}
    			
    		}
    	}
    	return true;
    }

}
