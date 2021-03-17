package classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {

	@Test
	public void testAddNum() {
		int act = Bank.addNum(1, 2);
		int exp = 3;
		
		assertEquals(act, exp);
	}

	@Test
	public void testMulNum() {
		int act = Bank.mulNum(1, 2);
		int exp = 2;
		
		assertEquals(act, exp);
	}

}
