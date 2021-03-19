package classes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest 
{
	
	Customer customer;

	@Before
	public void setUp() throws Exception 
	{
		customer = new Customer("Prince",123.45);
	}

	@Test
	public void testGetName() 
	{
		assertEquals("Prince", customer.getName());
	}

	@Test
	public void testGetTransactions() 
	{
		assertEquals(123.45,(double) customer.getTransactions().get(0), 0.00);
	}

	@Test
	public void testAddTransaction() 
	{
		customer.addTransaction(111.22);
		customer.addTransaction(222.33);
		assertEquals(3, customer.getTransactions().size());
	}

}
