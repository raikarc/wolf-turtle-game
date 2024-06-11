//Raika Roy Choudhury; P2 APCS Peterson
//
// This class describes the movement of the Turtle critter, which moves in a box-like pattern, advancing in each direction 5 times
public class Turtle implements Critter {
	private int count = 0; // counter keeps track of whether the amount of moves in one direction has hit 5
	public char getChar() {
		return 'T';
	}
	public int getMove(CritterInfo info) {
		int move = count % 20;
		count += 1;
		
		if (move < 5) {
			return SOUTH;
		} else if (move < 10) {
			return WEST;
		} else if (move < 15) {
			return NORTH;
		} else {
			return EAST;
		}
	}
}
