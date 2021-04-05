package dynamicProxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {
	
	static ClassLoader loader = ProxyFactory.class.getClassLoader();
	
	
	public static Service getDynamicProxyService(Service obj)
	{
		@SuppressWarnings("rawtypes")
		Class[] interfaceName = new Class[] {Service.class};
		ProxyInvocationHandler handler = new ProxyInvocationHandler(obj);
		Service proxy = (Service) Proxy.newProxyInstance(loader,interfaceName, handler);		
		return proxy;
	}
	
	public static Payment getDynamicProxyPayment(Payment obj)
	{
		@SuppressWarnings("rawtypes")
		Class[] interfaceName = new Class[] {Payment.class};
		ProxyInvocationHandler handler = new ProxyInvocationHandler(obj);
		Payment proxy = (Payment) Proxy.newProxyInstance(loader,interfaceName, handler);		
		return proxy;
	}

	

}
