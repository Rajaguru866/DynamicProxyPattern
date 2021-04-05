package dynamicProxy;

public class PaymentCreation implements Payment{

	public int amount;
	public String charge_id;
	
	public PaymentCreation(int amount, String charge_id) {
		
		this.amount = amount;
		this.charge_id = charge_id;
	}

	@Override
	public void message() {
		
		System.out.println("Payment of " + this.amount + " was succeeded for " + this.charge_id);
		
	}

	@Override
	public String toString() {
		return "PaymentCreation [amount=" + amount + ", charge_id=" + charge_id + "]";
	}
	

}
