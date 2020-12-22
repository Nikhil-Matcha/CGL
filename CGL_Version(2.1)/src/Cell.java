
public class Cell {
	int x;
	int y;
	boolean isAlive;
	
	public Cell(int x, int y, boolean isAlive) {
		this.x = x;
		this.y = y;
		this.isAlive = isAlive;
	}
	
	public String toString() {
		if(this.isAlive) {
			return "The Cell at " + this.x + "," + this.y + " is alive.";
		}
		return "The Cell at " + this.x + "," + this.y + " is dead.";
	}
}
