package dynamicProxy;

public class ProxyMain {

	public static void main(String[] args) {
		
		Customer cust = new CustomerService("Rajaguru");
		Customer proxy = CustomerProxyFactory.getDynamicProxy(cust);
		proxy.printName();
		System.out.println("ended");
	}

}
