package interfaces;

import java.util.ArrayList;

import classes.Customer;

public interface IBranch 
{

	public String getName();
	
	public ArrayList<Customer> getCustomer();
	
	public boolean newCustomer(String name, double transaction);
	
	public boolean addCustomerTransaction(String name, double transaction);
	
	
}
