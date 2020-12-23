import org.junit.jupiter.api.Assertions;

public class cellTest {
	@Test
	public void testCellOne() {
		Cell c1 = new Cell(3, 5, true);
		System.out.println("======TEST ONE EXECUTED=======");
	    Assertions.assertEquals("Cell at 3,5 is alive.", c1.toString());
	}
	
	@Test
	public void testCellTwo() {
		Cell c2 = new Cell(6, 8, true);
		System.out.println("======TEST TWO EXECUTED=======");
	    Assertions.assertEquals("Cell at 6,8 is dead.", c2.toString());
	}
}
