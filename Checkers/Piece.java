package Checkers;

public class Piece {
	
	public static enum COLOR {RED, BLACK};// enum limits options of values
	
	private static int totalNumberOfPieces=0;// to initialize pieces
	private int id;
	private COLOR c;
	
	public Piece(){
		id=totalNumberOfPieces;
		totalNumberOfPieces++;
		//to access the total number of pieces
	}
	
	public void set(COLOR color){
		c=color;
	}
	
	public COLOR getColor() {
		return c;
	}
	
	// Checks if a move is valid.
    public boolean isMove() {

        return true;
	}
	
	  
	
}