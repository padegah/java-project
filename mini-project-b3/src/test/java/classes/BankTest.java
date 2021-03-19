package classes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankTest 
{

	Bank bank;
	
	@Before
	public void setUp() throws Exception 
	{
		bank = new Bank("myBank");
	}

	@Test
	public void testAddBranch() 
	{
		assertTrue(bank.addBranch("myBranch"));
	}

	@Test
	public void testAddCustomer() {
		testAddBranch();
		assertTrue(bank.addCustomer("myBranch", "myCustomer", 111.22));
	}

	@Test
	public void testAddCustomerTransaction() 
	{
		testAddCustomer();
		assertTrue(bank.addCustomerTransaction("myBranch", "myCustomer", 100.54));
	}

	@Test
	public void testListCustomers() 
	{
		testAddCustomerTransaction();
		assertTrue(bank.listCustomers("myBranch", true));
	}

}
