package interfaces;

public interface IBank
{

	public boolean addBranch(String name);
	
	public boolean addCustomer(String branchName, String customerName, double transaction);
	
	public boolean addCustomerTransaction(String branchName, String customerName, double transaction);
	
	//Branch findBranch(String name);
	
	public boolean listCustomers(String branchName, boolean printTransactions);
	
}
