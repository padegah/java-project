package classes;

import java.util.ArrayList;

public class Bank 
{

	ArrayList<Branch> branches;
	private String name;
	
	public Bank(String name)
	{
		this.name = name;
		this.branches = new ArrayList<Branch>();
	}
	
	public boolean addBranch(String name)
	{
		if(findBranch(name) == null)
		{
			this.branches.add(new Branch(name));
			return true;
		}
		
		return false;
	}
	
	public boolean addCustomer(String branchName, String customerName, double transaction)
	{
		Branch branch = findBranch(branchName);
		
		if(branch != null)
		{
			return branch.newCustomer(customerName, transaction);
		}
		
		return false;
	}
	
	public boolean addCustomerTransaction(String branchName, String customerName, double transaction)
	{
		Branch branch = findBranch(branchName);
		
		if(branch != null)
		{
			return branch.addCustomerTransaction(customerName, transaction);
		}
		
		return false;
	}
	
	private Branch findBranch(String name)
	{
		int arr = branches.size();
		
		for(int i=0; i<arr; i++)
		{
			if(this.branches.get(i).getName().equals(name))
			{
				return branches.get(i);
			}
		}
		
		return null;
	}
	
	public boolean listCustomers(String branchName, boolean printTransactions)
	{
		Branch branch = findBranch(branchName);
		
		if(branch != null)
		{
			System.out.println("Customer details for branch " + branchName);
			
			ArrayList<Customer> branchCustomers = branch.getCustomer();
			
			int arr = branchCustomers.size();
			
			for(int i=0; i<arr; i++)
			{
				int customerNum = i+1;
				
				System.out.println("Customer: " + branchCustomers.get(i).getName() + "[" + customerNum + "]");
				
				if(printTransactions)
				{
					System.out.println("Transactions");
					
					ArrayList<Double> customerTransactions = branchCustomers.get(i).getTransactions();
					
					int arr1 = branchCustomers.get(i).getTransactions().size();
					
					for(int j=0; j<arr1; j++)
					{
						int transNum = j+1;
						System.out.println("[" + transNum + "] Amount " + customerTransactions.get(j));
					}
				}
			}
			
			return true;
		}
		
		return false;
	}
}
