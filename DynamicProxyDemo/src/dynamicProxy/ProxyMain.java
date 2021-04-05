package dynamicProxy;


import java.util.List;

public class ProxyMain {

	public static void main(String[] args) {
		
		Customer cust = new CustomerService("Rajaguru");
		Customer proxy = CustomerProxyFactory.getDynamicProxy(cust);
		proxy.printName();
		System.out.println("ended");
		System.out.println("Total Log count is " + Log.getCount());
		ProxyMain.printLog(Log.getList());
		
		
	}
	
	public static void printLog(List<String> list)
	{
		for(String log : list)
		{
			System.out.println("Logged for " + log);			
		}
	}

}
