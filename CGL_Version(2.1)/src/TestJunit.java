import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunit {
	@Test
	public void testCellOne() {
		Cell c1 = new Cell(3, 5, true);
		System.out.println("======TEST ONE EXECUTED=======");
		
	    Assertions.assertEquals("The Cell at 3,5 is alive.", c1.toString());
	}
	
	@Test
	public void testCellTwo() {
		Cell c2 = new Cell(6, 8, false);
		System.out.println("======TEST TWO EXECUTED=======");
		// System.out.println(c2.toString());
	    Assertions.assertEquals("The Cell at 6,8 is dead.", c2.toString());
	}
	
	@Test
	public void testBoardOne() {
		Board b = new Board(4, 5);
		System.out.println("======TEST THREE EXECUTED=======");
		
	    Assertions.assertEquals(".....\n.....\n.....\n.....\n", b.toString());
	}
	
	@Test
	public void testBoardTwo() {
		Board b1 = new Board(5, 5);
		System.out.println("======TEST FOUR EXECUTED=======");
		int l[][] = { {1,2}, {4,4}, {0,2}, {3,1}, {1,4} };
		b1.createBoard(l);
		
	    Assertions.assertEquals("..*..\n..*.*\n.....\n.*...\n....*\n", b1.toString());
	}
	
	@Test
	public void testBoardThree() {
		Board b2 = new Board(3,3);
		System.out.println("======TEST FIVE EXECUTED=======");
		int l[][] = { {1,2}, {0,2}, {2,1} };
		b2.createBoard(l);
		Assertions.assertEquals("..*\n..*\n.*.\n", b2.toString());
		// . . * .    . . . .
		// . . * .    . * * *
		// . * . *    . * . *
		// . . * .    . . * .
		Assertions.assertEquals(1,b2.getAliveNeighbours(b2.grid[0][2]));
//		Assertions.assertEquals(3,b2.getAliveNeighbours(b2.grid[1][1]));
//		Assertions.assertEquals(0,b2.getAliveNeighbours(b2.grid[0][0]));
	}
	
	@Test
	public void testGameOne() {
		Game g = new Game();
		System.out.println("======TEST SIX EXECUTED=======");
		Board b1 = new Board(4,4);
		int l[][] = { {1,2}, {0,2}, {2,1}, {2,3}, {3,2} };
		b1.createBoard(l);
		Board b2 = g.nextGeneration(b1);
		Assertions.assertEquals("....\n.***\n.*.*\n..*.\n", b2.toString());
		
	}
}
