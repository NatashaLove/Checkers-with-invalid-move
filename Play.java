import java.util.*;
import Checkers.*;

public class Play {
	public static void main (String [] args) {
	
		//create board
		Board board = new Board();
		
		//create for-loop for creating black and red pieces 
		
		
		
		//create pieces
		Piece b1=new Piece();
		Piece r1=new Piece();
		r1.set(Piece.COLOR.RED);// class.enum.value
		b1.set(Piece.COLOR.BLACK);// class.enum.value
		//r1.color=Piece.COLOR.RED;
		
		//set pieces on the board
		
		board.set(r1,0,0);
		board.set(b1,7,7);
		
		//check the board- test
		
		System.out.println("Location 2x2 is occupied: " + board.checkOccup(2,2));
		System.out.println("Location 7x7 is occupied: " + board.checkOccup(7,7));
		System.out.println("Color of the piece 7x7 is : " + r1.getColor());
		System.out.println("Color of the piece 7x7 is : " + board.checkColor(7,7));
		
		try {
			// Checks if a coordinate is on the grid
			board.inRange(2, 2);
			System.out.println("Valid move.");
			
		}
		
		catch (Exception e) {
			System.out.println("Invalid move.");
		}
		

	}
}