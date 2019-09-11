package stationery.stationery_shop;

public class CounterSingleton {
	private static CounterSingleton instance;
	private int price;
	private String payment;
	
	private CounterSingleton() {
		
	}

	public static CounterSingleton getInstance() {
		if (instance == null) {
			instance = new CounterSingleton();
		}
		return instance;
	}
	public void payment() {
		
	}

	public int getPrice() {
		return price;
	}

	public void getPayment(String payment) {
		this.payment = payment;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}
}
