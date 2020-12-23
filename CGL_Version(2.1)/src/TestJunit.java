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
		System.out.println(c2.toString());
	    Assertions.assertEquals("The Cell at 6,8 is dead.", c2.toString());
	}
}
