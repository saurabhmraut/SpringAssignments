package classFiles;

import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountServices { 
	
	public BankAccountServiceImpl() { 
		System.out.println("Service class");
	}

	public double withdraw(long accountId, double balance) { 
		return 0;
	}

	public double deposit(long accountId, double balance) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return getBalance(150);
	}

	public boolean fundTransfer(long fromAccount, long accountId, double amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
