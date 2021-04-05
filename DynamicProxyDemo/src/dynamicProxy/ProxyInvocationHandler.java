package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ProxyInvocationHandler implements InvocationHandler{

	private final Object target;
	

	public ProxyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("Passing through proxy");
		Object result = method.invoke(target, args);
		Log.addLog(target.getClass().getSimpleName());
		return result;
	}

}
