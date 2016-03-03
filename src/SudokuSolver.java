
public class SudokuSolver {

	public int[][] sudokuBoard;
	private static final int boardSize = 9;
	
	public SudokuSolver(){
		sudokuBoard = new int[boardSize][boardSize];
	}
	
	public boolean put(int num, int row, int col){
		row = row - 1;
		col = col - 1;
		if(num < 1 || num > 9 || row < 0 || row > 8 || col < 0 || col > 8){
			return false;
		}
		
		sudokuBoard[row][col] = num;
		return true;
	}
	public boolean solve(){
		return solve(0,0);
	}
	
	private boolean solve(int row, int col){
		if(col > boardSize -1){
			col = 0;
			row++;
		}
		if(row > boardSize - 1){
			return true;
		}
		
		if(sudokuBoard[row][col] == 0){ //rutan är ej ifylld
			boolean canSolve = true;
			for(int i = 1; i <= 9; i++){
				if(legalNumber(i, row, col)){
					sudokuBoard[row][col] = i;
					canSolve = solve(row, col+1);
				}
			}
			if(sudokuBoard[row][col] == 0 || !canSolve){
				sudokuBoard[row][col] = 0;
				return false;
			}
			return true;	
		}
		else{
			if(!legalNumber(sudokuBoard[row][col], row, col)){
				return false;
			}
			return solve(row, col+1);
		}
	}
	
	public boolean legalNumber(int num, int row, int col){
		for(int c = 0; c < boardSize; c++){ //check row
			if(sudokuBoard[row][c] == num && c != col){ //already exists, return false;
				return false;
			}
		}
		for(int r = 0; r < boardSize; r++){
			if(sudokuBoard[r][col] == num && r != row){
				return false;
			}
		}
		int startRow = row; int startCol = col;
		while(startRow % 3 != 0){
			startRow--;
		}
		while(startCol % 3 != 0){
			startCol--;
		}
		
		for (int c = startCol; c < startCol + 3; c++) {
			for (int r = startRow; r < startRow + 3; r++) {
				if(sudokuBoard[r][c] == num && c != col && r != row){
					return false;
				}
			}

		}
		return true;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(int[] row : sudokuBoard){
			for(int num : row){
				sb.append(num + " ");
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
}
