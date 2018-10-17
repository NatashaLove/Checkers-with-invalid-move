package Checkers;
//no import because in the same package
public class Board{
	
	private Piece[][] board= new Piece[8][8];//array of spots for pieces (hypothetic)
	
	public void set (Piece p, int x, int y){
		//error if x or y are <7
		
		// try {
			// // Checks if a coordinate is on the grid
			// inRange(x, y);
			
		// }
		
		// catch (Exception e) {
			// System.out.println("Invalid move.");
		// }
		
		board[x][y] = p;
	}
	
	public boolean checkOccup (int x, int y){
		
		return (board[x][y] !=null);// true if occupied
		
	}
	
	//class-Piece.enum
	//use board to access pieces color
	public Piece.COLOR checkColor (int x, int y){
		return board[x][y].getColor();
	}
	
	public boolean inRange(int x, int y) {

		if(x < 8 && x >= 0 && y < 8 && y >= 0) return true;

		return false;

	}
	
}