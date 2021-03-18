package classes;

import java.util.ArrayList;

import interfaces.ICustomer;

public class Customer implements ICustomer
{

	private String name;
	ArrayList<Double> transactions;
	
	public Customer(String name, double initial_transaction)
	{
		this.name = name;
		transactions = new ArrayList<Double>();
		transactions.add(initial_transaction);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public ArrayList<Double> getTransactions()
	{
		return this.transactions;
	}
	
	public void addTransaction(double transaction)
	{
		transactions.add(transaction);
	}
	
}
