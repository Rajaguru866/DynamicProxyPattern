package dynamicProxy;

public class CustomerService implements Service{

	private String customerName;
	private String email;
	
	public CustomerService(String customerName,String email) {
		this.customerName = customerName;
		this.email = email;
	}

	@Override
	public void message()
	{
		System.out.println("Customer " + this.customerName + " with Email " + this.email + " was created");
	}

	@Override
	public String toString() {
		return "CustomerService [customerName=" + customerName + ", email=" + email + "]";
	}
	
	
	

}
