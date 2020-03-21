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
	RemoveFirst2A removeFirst2A;
	@BeforeEach
	public void setUp()
	{
		removeFirst2A=new RemoveFirst2A();
	}

	@Test
	public void testRemoveAAt1() {
		setUp();
		assertEquals("BCD",removeFirst2A.remove("ABCD"));
	}
	@Test
	public void testRemoveAAt01() {
		setUp();
		assertEquals("CD",removeFirst2A.remove("AACD"));
	}
	@Test
	public void testRemoveAAt2() {
		setUp();
		assertEquals("BCD",removeFirst2A.remove("BACD"));
	}
	@Test
	public void testRemoveNoA() {
		setUp();
		assertEquals("BBCD",removeFirst2A.remove("BBCD"));
	}
	

	



}
