import java.util.Calendar;

public class CreditCard {
	private int expiryMonth;
	private int expiryYear;
	private String firstName;
	private String lastName;
	private String ccNumber;
	
	public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber) {
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ccNumber = ccNumber;
	}
	public String formatExpiryDate() {
		String expiryY = Integer.toString(expiryYear).substring(2, 4);
		return String.format("%s/%s", expiryMonth, expiryY);
	}
	public String formatFullName() {
		return firstName + " " + lastName;
	}
	/*public String formatCCNumber() {
		return String.format("%s %s %s %s", this.ccNumber.substring(0, 4), this.ccNumber.substring(4, 8), this.ccNumber.substring(8, 12), this.ccNumber.substring(12, 16));
	}*/
	public String formatCCNumber() {
		String[] nums = new String[4];
		for (int i = 0; i < nums.length; i++) {
			int index = i * 4;
			nums[i] = ccNumber.substring(index, index + 4);
		}
		String s = String.format("%s %s %s %s", (Object[]) nums);
		return s;
	}
	public boolean isValid() {
		Calendar now = Calendar.getInstance();
		int nowMonth = now.get(Calendar.MONTH) + 1;
		int nowYear = now.get(Calendar.YEAR);
		return expiryYear > nowYear || (expiryYear == nowYear && expiryMonth > nowMonth);
	}
	public String toString() {
		return String.format("Number: %s\nExpiration date: %s\nAccount holder: %s\nIs valid: %s", formatCCNumber(), formatExpiryDate(), formatFullName(), isValid());
	}
	public static void main(String[] args) {
		CreditCard cc1 = new CreditCard(10, 2017, "Bob", "Lee", "1234567890123456");
		System.out.println(cc1.toString());
	}
	
	/*private int expiryMonth;
	private int expiryYear;
	private String firstName;
	private String lastName;
	private String ccNumber;
	
	public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber) {
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ccNumber = ccNumber;
	}
	public String formatExpiryDate() {
		return 	String.format("%d/%d", expiryMonth, expiryYear % 100);
	}
	
	public String formatFullName() {
		return firstName + " " + lastName;
	}
	public String formatCCNumber() {
		return String.format("%s %s %s %s" , ccNumber.substring(0, 4), ccNumber.substring(4, 8), ccNumber.substring(8, 12), ccNumber.substring(12));
	}
	public boolean isValid() {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		
		return expiryYear > year || (expiryYear == year && month < expiryMonth );
	}
	public String toString() {
		return String.format("Number: %s\nExpiration date: %s\nAccount holder: %s\nIs valid: %s", formatCCNumber(), formatExpiryDate(), formatFullName(), isValid());
	}*/
}
