package testCases;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class RemovingA {
	/*TODO list of my feature
	 * 1.   1 A at index 1 "ABCD"="BCD" -success
	 * 2.   2 A at indexes 0,1 "AABC"="CD"-success
	 * 3.   3 A at indices 2 "BACD"="BCD"-success
	 * 4.   0 A "BBCD"="BBCD"-success
	 */
	
	

	@Test
	public void testRemoveAAt1() {
		RemoveFirst2A removeFirst2A=new RemoveFirst2A();
		String actual=removeFirst2A.remove("ABCD");
		assertEquals("BCD",actual);
	}
	@Test
	public void testRemoveAAt01() {
		RemoveFirst2A removeFirst2A=new RemoveFirst2A();
		String actual=removeFirst2A.remove("AACD");
		assertEquals("CD",actual);
	}
	@Test
	public void testRemoveAAt2() {
		RemoveFirst2A removeFirst2A=new RemoveFirst2A();
		String actual=removeFirst2A.remove("BACD");
		assertEquals("BCD",actual);
	}
	@Test
	public void testRemoveNoA() {
		RemoveFirst2A removeFirst2A=new RemoveFirst2A();
		String actual=removeFirst2A.remove("BBCD");
		assertEquals("BBCD",actual);
	}
	

	



}
