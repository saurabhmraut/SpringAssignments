package classFiles;

public interface BankAccountServices {

	public double withdraw(long accountId, double balance);
	public double deposit(long accountId, double balance);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount,long accountId, double amount);
}
