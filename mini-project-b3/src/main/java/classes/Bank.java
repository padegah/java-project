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
}
