package dynamicProxy;


import java.util.List;

public class ProxyMain {

	public static void main(String[] args) {
		
		Service cust = new CustomerService("Rajaguru","rajagurudemo@gmail.com");
		Service merchant = new ConnectedAccountCreation("Custom","Ramesh","INR");
		Payment pay = new PaymentCreation(2000,"ch_200078");
		Service merchantProxy = ProxyFactory.getDynamicProxyService(merchant);
		merchantProxy.message();
		Service custProxy = ProxyFactory.getDynamicProxyService(cust);
		custProxy.message();
		Payment payProxy = ProxyFactory.getDynamicProxyPayment(pay);
		payProxy.message();
		
		System.out.println("Total Log count is " + Log.getCount());
		ProxyMain.printLog(Log.getList());
		
	}
	
	public static void printLog(List<String> list)
	{
		for(String log : list)
		{
			System.out.println(log);	
		}
	}

}
