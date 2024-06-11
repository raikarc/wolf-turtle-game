//Raika Roy Choudhury; P2 APCS Peterson
//
// This class describes the movement of the OldTurtle critter, which acts exactly like Turtle, but alternates between moving 
// and staying stationary
public class OldTurtle extends Turtle implements Critter {
	private int n = 1; // describes whether the Old Turtle is stationary or not
	
	public char getChar() {
		return 'O';
	}
	
	public int getMove(CritterInfo info) {
		if (n > 0) {
			n *= -1;
			return super.getMove(info);
		} else {
			n *= -1;
			return CENTER;
		}
	}
}
