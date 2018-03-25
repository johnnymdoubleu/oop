import java.util.Scanner;
public class Totalincome {
	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		int pay, total = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("Employee #" + (i+1) + ": $");
			pay = kb.nextInt();
			total += pay;
		}
		System.out.println("the total amount is $" + total);
	}
}
