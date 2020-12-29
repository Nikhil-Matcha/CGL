
public class Game {
	public static void main(String args[]) {
		Board b = new Board(3,4);
		int[][] l = {{0,2},{1,2},{0,0},{2,3}};
		while(true) {
			System.out.println(b);
			b.nextGeneration(b);
		}
	}
}
