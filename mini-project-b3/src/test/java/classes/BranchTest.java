package classes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BranchTest 
{
	Branch branch;
	
	@Before
	public void setUp() throws Exception 
	{
		branch = new Branch("myBranch");
		branch.newCustomer("myCustomer", 101.23);
	}

	@Test
	public void testGetName() 
	{
		assertEquals("myBranch", branch.getName());
	}

	@Test
	public void testGetCustomers() 
	{
		assertEquals(1,branch.getCustomers().size());
	}

	@Test
	public void testNewCustomer() {
		assertTrue(branch.newCustomer("myNewCustomer", 45.00));
	}

	@Test
	public void testAddCustomerTransaction() {
		testNewCustomer();
		assertTrue(branch.addCustomerTransaction("myNewCustomer", 200.43));
	}

}
