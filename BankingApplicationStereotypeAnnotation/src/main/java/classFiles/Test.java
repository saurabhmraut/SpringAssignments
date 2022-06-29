package classFiles; 
import org.springframework.context.annotation.AnnotationConfigApplicationContext; 
 

public class Test { 
	
	public static void main(String[] args) { 
		
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	        context.scan("classFiles");
	        context.refresh(); 
	       BankAccount component = context.getBean(BankAccount.class);
	       System.out.println(component.getAccountBalance());
	       
	       BankAccountController controller = context.getBean(BankAccountController.class);
	       
	       BankAccountRepositoryImpl repository = context.getBean(BankAccountRepositoryImpl.class);
	       
	        context.close();
		 
		
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
//		BankAccount bankAccount = (BankAccount) applicationContext.getBean("bankAccount");	
//		System.out.println(bankAccount);		
//		System.out.println(bankAccount.getAccountBalance());
		
//		BankAccountController bankAccountController = applicationContext.getBean("bankAccountController", BankAccountController.class);
////		BankAccount bankAccount1 = applicationContext.getBean("bankAccountController", BankAccountController.class);
//		System.out.println(bankAccountController.getBalance(1001)); 
//		System.out.println(bankAccountController.deposit(1000, 2000));
//		System.out.println(bankAccountController.withdraw(1001, 5000));
//		System.out.println(bankAccountController.getBalance(1001));


	}
}
