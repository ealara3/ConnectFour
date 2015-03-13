import java.awt.Point;

// this class is used by Move or Restore 
// uses Memory 
// strictly handles the GUI of placing a disk on the board
public class PlaceDisk {
	
	// display desired move disk on game board
	
	// function 
			// input: the column of the mouse click 
			// taking into account: gravity and memory 
	
	
	
	
	// the radius of each disc
	private static final int DISC_RADIUS = 100;
	
	// must keep track of positions of the discs
	static int[][] positions = new int[7][6];
	
	// places and draws a disc at the place the player clicked
	static void placeDisc(Point p, String player) {
		if (player == "Red")
			positions[(p.x - 140) / DISC_RADIUS][(p.y - 90) / DISC_RADIUS] = 1;
		else if (player == "Blue")
			positions[(p.x - 140) / DISC_RADIUS][(p.y - 90) / DISC_RADIUS] = 2;
		//System.out.println((p.x - 140) / DISC_RADIUS + "," + (p.y - 30)/ DISC_RADIUS);
	}
}
