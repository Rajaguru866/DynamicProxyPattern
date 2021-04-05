package dynamicProxy;

public class ConnectedAccountCreation implements Service{

	public String accountType;
	public String merchantName;
	public String currency;
	public ConnectedAccountCreation(String accountType, String merchantName, String currency) {
		this.accountType = accountType;
		this.merchantName = merchantName;
		this.currency = currency;
	}
	
	
	@Override
	public void message()
	{
		System.out.println("Connected Account created for " + this.merchantName);
	}


	@Override
	public String toString() {
		return "ConnectedAccountCreation [accountType=" + accountType + ", merchantName=" + merchantName + ", currency="
				+ currency + "]";
	}
	

}
