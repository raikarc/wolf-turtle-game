//Raika Roy Choudhury; P2 APCS Peterson
//
// This class describes the movement of the Bird critter, which randomly a direction to advance each move
import java.util.Random;

public class Bird implements Critter {
	public char getChar() {
		return 'B';
	}
	
	public int getMove(CritterInfo info) {
		Random r = new Random();
		int a = r.nextInt(4) + 1;
		if (a == 1) {
			return NORTH;
		} else if (a == 2) {
			return SOUTH;
		} else if (a == 3) {
			return EAST;
		} else if (a == 4) {
			return WEST;
		} else {
			return -1;
		}
	}
	
}
