package Demo;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	@Bean(name = "address")
	public Address address() {
		return new Address("First street","Pune","Maharastra",411018,"India");
	}
	
	@Bean(name = "customer")
	public Customer customer() {
		Address address = new Address("First street","Pune","Maharastra",411018,"India");
		return new Customer(1212,"Saurabh","9720390239", address);
	}
	

}
