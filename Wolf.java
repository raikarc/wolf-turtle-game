//Raika Roy Choudhury; P2 APCS Peterson
//
// This class describes the movement of the Wolf critter, which moves in a random direction based off if the random number is
// even or odd, and greater than or less than 5
import java.util.Random;

public class Wolf implements Critter {
	public char getChar() {
		return 'W';
	}
	public int getMove(CritterInfo info) {
		Random r = new Random();
		int a = r.nextInt(10) + 1;
		if (a % 2 == 0) {
			if (a < 5) {
				return WEST;
			} else {
				return NORTH;
			}
		} else {
			if (a < 5) {
				return SOUTH;
			} else {
				return EAST;
			}
		}
		
	}
}
