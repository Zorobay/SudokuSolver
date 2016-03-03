
public class TestMain {

	public static void main(String[] args) {
		SudokuSolver ss = new SudokuSolver();
	//	System.out.println(ss.toString());
		//System.out.println(ss.solve());
		
		ss.put(2, 1, 2);
		ss.put(1, 1, 4);
		ss.put(7, 1, 5);
		ss.put(8, 1, 6);
		ss.put(3, 1, 8);
		ss.put(4, 2, 2);
		ss.put(3, 2, 4);
		ss.put(2, 2, 6);
		ss.put(9, 2, 8);
		ss.put(1, 3, 1);
		ss.put(6, 3, 9);
		ss.put(8, 4, 3);
		ss.put(6, 4, 4);
		ss.put(3, 4, 6);
		ss.put(5, 4, 7);
		ss.put(3, 5, 1);
		ss.put(4, 5, 9);
		ss.put(6, 6, 3);
		ss.put(7, 6, 4);
		ss.put(9, 6, 6);
		ss.put(2, 6, 7);
		ss.put(9, 7, 1);
		ss.put(2, 7, 9);
		ss.put(8, 8, 2);
		ss.put(9, 8, 4);
		ss.put(1, 8, 6);
		ss.put(6, 8, 8);
		ss.put(1, 9, 2);
		ss.put(4, 9, 4);
		ss.put(3, 9, 5);
		ss.put(6, 9, 6);
		ss.put(5, 9, 8);
		
		System.out.println(ss.toString());
		System.out.println(ss.solve());
		System.out.println(ss.toString());
	}
	
}
