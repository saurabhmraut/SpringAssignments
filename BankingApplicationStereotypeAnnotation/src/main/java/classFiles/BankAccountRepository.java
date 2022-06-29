package classFiles;


public interface BankAccountRepository {
	
	public double getBalance( long acountId);
	public double updateBalance(long accountId, double newBalance);

}
