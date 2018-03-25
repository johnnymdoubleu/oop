public class Cost {
	private int amount;
	private String currency;
	
	public Cost() {
		setAmount(0);
		setCurrency("pounds sterling");
	}
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		if(currency.equals("pounds sterling") || currency.equals("US dollars") || currency.equals("euros")) {
			this.currency = currency;
		}
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		if(amount >= 0) {
			this.amount = amount;
		}
	}
	public void convert(String newCurrency, double rate) {
		double a = amount / rate;
		if(newCurrency.equals("pounds sterling") || newCurrency.equals("US dollars") || newCurrency.equals("euros")) {
			setCurrency(newCurrency);
			this.amount = (int) Math.round(a);
		}
	}
	public String toString() {
		return getAmount() + " " + getCurrency() + "";
	}
}
