import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BonusSeller extends Seller {
	private HashMap<String, Double> sales;

	public BonusSeller(String n) {
		super(n);
		this.sales = new HashMap<String, Double>(10);
	}

	public void sale(String name, double HMbought) {
		super.sale(HMbought);
		if (sales.containsKey(name)) {
			HMbought += sales.get(name);
		}
		sales.put(name, HMbought);
	}

	@Override
	public String toString() {
		String a = super.toString() + "\nSales per customer:";
		for (String key : sales.keySet()) {
			a += ("\n" + key + ":" + (int) Math.round(sales.get(key)) + "kg");
			// Map <String, Double> sales = new HashMap<String,Double>();
			// sales.put("Arthur", (double) 23); sales.put("Ford", (double) 42);
			// sales.put("Trillian", 21.0);
			// for (Map.Entry<String, Double> sale : sales.entrySet()) {
			// System.out.println(sale.getKey() + ":" + sale.getValue());
		}
		return a;
	}

	public int calculateBonus() {
		int n = 0;
		for (Double d : sales.values()) {
			if (d >= 20) {
				n++; // ignore the customers who bought less than 20 kg
			}
		}
		if (n < 5) {
			return 0;
		}
		if (n >= 5 && n < 10) {
			return 5;
		}
		else {
			return 7;
		}
	}

	public static void main(String[] args) {
		BonusSeller s = new BonusSeller("Johnny");
		s.sale("Arthur", (double) 23);
		s.sale("Arthur", (double) 23);
		s.sale("As", (double) 29);
		System.out.println(s.toString());
	}
}
