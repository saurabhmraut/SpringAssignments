package classFiles;

import org.springframework.stereotype.Repository;

@Repository
public class BankAccountRepositoryImpl implements BankAccountRepository {

	public BankAccountRepositoryImpl() {
		System.out.println("Repository class");
		// TODO Auto-generated constructor stub
	}

	public double getBalance(long acountId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double updateBalance(long accountId, double newBalance) {
		// TODO Auto-generated method stub
		return 0;
	}

}
