import java.util.HashMap;
import java.util.Map;

public class PremiumCustomer extends Customer {
	private Map<String, String> freeGifts;

	public PremiumCustomer(String name, Map<String, String> freeGifts) {
		super(name);
		this.freeGifts = freeGifts;
	}

	public void giftsFrom(String name, int numOrdered) {
		if (freeGifts.containsKey(name)) {
			System.out.println(freeGifts.get(name) + " x " + numOrdered);
		}
	}

	public String toString() {
		String a = super.toString() + "\nFree gifts:";
		for (String key : freeGifts.keySet()) {
			a += "\n" + freeGifts.get(key) + " on ordering " + key;
		}
		return a;
	}

	public int chocolateGifts() {
		int n = 0;
		for (String value : freeGifts.values()) {
			if (value.contains("chocolate")) {
				n++;
			}
		}
		// String a = "avdavd";
		// System.out.println(a.concat("dd"));
		return n;

	}

	public static void main(String[] args) {
		Map<String, String> freeGifts = new HashMap<String, String>();
		freeGifts.put("printer cartridge", "cholocalate");
		freeGifts.put("box of paper", "biscuits");
		PremiumCustomer nn = new PremiumCustomer("Johnny", freeGifts);
		System.out.println(nn.toString());
		nn.chocolateGifts();
	}
}
