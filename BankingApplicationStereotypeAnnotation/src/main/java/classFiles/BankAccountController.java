package classFiles;

import org.springframework.stereotype.Controller;

@Controller
public class BankAccountController { 
	
	public BankAccount bankAccount; 
	public BankAccountController(BankAccount bankAccount) { 
		
		this.bankAccount = bankAccount;
		System.out.println("BankAccoutnController"+bankAccount);

		
	}

	public BankAccountController() { 
		
	} 
	public double withdraw(long accountId, double balance) { 
		double total = bankAccount.getAccountBalance()-balance;
		bankAccount.setAccountBalance(total);
		return bankAccount.getAccountBalance();
	}

	public double deposit(long accountId, double balance) { 
		double total = bankAccount.getAccountBalance()+balance;
		bankAccount.setAccountBalance(total);
		return bankAccount.getAccountBalance();
	}

	public double getBalance(long accountId) { 
		return bankAccount.getAccountBalance();
	}

	public boolean fundTransfer(long fromAccount, long accountId, double amount) { 
		return false;
	}
}
