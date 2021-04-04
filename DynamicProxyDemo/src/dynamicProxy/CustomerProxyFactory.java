package dynamicProxy;

import java.lang.reflect.Proxy;

public class CustomerProxyFactory {
	
	public static Customer getDynamicProxy(Customer cust)
	{
		ProxyInvocationHandler handler = new ProxyInvocationHandler(cust);
		ClassLoader loader = CustomerProxyFactory.class.getClassLoader();
		Class[] interfaceName = new Class[] {Customer.class};
		Customer proxy = (Customer) Proxy.newProxyInstance(loader,interfaceName, handler);		
		return proxy;
	}

	

}
