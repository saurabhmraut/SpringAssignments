package demo;
 
 import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required; 


public class Customer {
	private String customerName;
	private int customerId;
	private int customerContact;
	 @Inject
	private Address customerAdress;
//	public Customer(String customerName, int customerId, int customerContact, Address customerAdress) {
//		super();
//		this.customerName = customerName;
//		this.customerId = customerId;
//		this.customerContact = customerContact;
//		this.customerAdress = customerAdress;
//	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAdress() {
		return customerAdress;
	}
	@Required
	public void setCustomerAdress(Address customerAdress) {
		this.customerAdress = customerAdress;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerContact="
				+ customerContact + ", customerAdress=" + customerAdress + "]";
	}
	
	
}
