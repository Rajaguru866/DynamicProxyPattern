package dynamicProxy;

public class CustomerService implements Customer{

	private String customerName;
	
	public CustomerService(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public void printName() {
		System.out.println("Real Customer - " + this.customerName);
	}
	

}
