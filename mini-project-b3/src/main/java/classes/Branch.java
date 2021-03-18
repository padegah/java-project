package classes;

import java.util.ArrayList;

import interfaces.IBranch;

public class Branch implements IBranch
{

	private String name;
	ArrayList<Customer> customers;
	
	public Branch(String name)
	{
		this.name = name;
		customers = new ArrayList<Customer>();
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public ArrayList<Customer> getCustomer()
	{
		return this.customers;
	}
	
	public boolean newCustomer(String name, double transaction)
	{
		if(findCustomer(name) == null)
		{
			this.customers.add(new Customer(name, transaction));
			return true;
		}
		
		return false;
	}
	
	public boolean addCustomerTransaction(String name, double transaction)
	{
		Customer customer = findCustomer(name);
		
		if(customer != null)
		{
			customer.addTransaction(transaction);
			return true;
		}
		
		return false;
	}
	
	private Customer findCustomer(String name)
	{
		int arr = customers.size();
		
		for(int i=0; i<arr; i++)
		{
			if(this.customers.get(i).getName().equals(name))
			{
				return customers.get(i);
			}
		}
		
		return null;
	}
}
