//Raika Roy Choudhury; P2 APCS Peterson
//
// This class describes the movement of the Frog critter, which pick a random direction to advance every 3 moves
import java.util.Random;

public class Frog implements Critter {
	int count = 3;
	int a = Direction();
	
	public char getChar() {
		return 'F';
	}
	
	// Direction randomly decides on a direction to move
	public static int Direction() {
		Random r = new Random();
		int a = r.nextInt(4) + 1;

		if (a == 1) {
			return NORTH; 
		} else if (a == 2) {
			return SOUTH; 
		} else if (a == 3) {
			return EAST; 
		} else {
			return WEST; 
		} 
	}
	
	// getMove implements Direction() and uses 'count' to move thrice in the same direction
	public int getMove(CritterInfo info) {
		if (count == 0) {
			a = Direction();
			count = 3;
		}
		count -= 1;
		return a;
	}
}
