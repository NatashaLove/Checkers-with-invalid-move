package Checkers;
//no import because in the same package
public class Board{
	
	private Piece[][] board= new Piece[8][8];//array of spots for pieces (hypothetic)
	
	public void set (Piece p, int x, int y){
				
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
	
	public void move(int x, int y, Piece p) throws IllegalArgumentException {
        if(!inRange(x,y))
            throw new IllegalArgumentException("Invalid move: cannot move out of board!");
		
        board[x][y] = p;
    }
	
}