
public class SudokuSolver {

	private int[][] sudokuBoard;
	private static final int boardSize = 9;
	
	public SudokuSolver(){
		sudokuBoard = new int[boardSize][boardSize];
	}
	
	public boolean solve(){
		return solve(0,0);
	}
	
	private boolean solve(int row, int col){
		if(sudokuBoard[row][col] == 0){ //rutan är ej ifylld
			for(int i = 1; i <= 9;)
		}
	}
	
	private boolean legalNumber(int num, int row, int col){
		boolean legal = true;
		for(int i = 0; i < boardSize -1; i++){ //check row
			
		}
	}
}
