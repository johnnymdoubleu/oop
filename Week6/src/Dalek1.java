public class Dalek1 {
	private double batteryCharge = 5.0; // instance variable => can use it directly inside any instance method
	
	public void batteryReCharge(double c) {
		batteryCharge += c;
		System.out.println("Battery charge is: " + batteryCharge);
	}
	
	public void move (int distance) {
		for (int i = 1; i <= distance; i++) {
			if (batteryCharge >= 0.5) {
				System.out.printf("[%d] ", i);
				batteryCharge -= 0.5;
			}
			else {
				System.out.println("Out of power!");
			}
		}
	}
	public static void main(String[] args) {
	    Dalek1 d = new Dalek1(); // start off with a well-charged battery
	    d.move(11);              // move around and use up the charge
	    d.batteryReCharge(2.5);  // get a new charge
	    d.batteryReCharge(0.5);  // add a bit more
	    d.move(5);               // move some more
	}
}

/*public class Dalek1 {
		private double batteryCharge = 5.0;
	
	public void batteryReCharge(double c) {
		this.batteryCharge += c;
		System.out.printf("Battery charge is: %.1f\n", this.batteryCharge);
	}
	
	public void move(int distance) {
		for (int i = 0; i <= distance; i++) {
			if(this.batteryCharge >= 0.5) {
				System.out.printf("[%d]", i);
				this.batteryCharge -= 0.5;
			}
			else {
				System.out.println("Out of Power!");
				break;
			}
		}
	}
     public void move(int distance) {
    int count = 1;
    int remainingDistance = distance;
    while (batteryCharge >= 0.5 && remainingDistance > 0) {
        System.out.print("[" + count + "] ");
        count++;
        batteryCharge -= 0.5;
        if (batteryCharge == 0) {
            System.out.print("Out of power!");
        }
        remainingDistance -= 1;
    }
    System.out.println();
}
	public static void main(String[] args) {

        Dalek1 d = new Dalek1(); // start off with a well-charged battery
        d.move(11); // move around and use up the charge
        d.batteryReCharge(2.5); // get a new charge
        d.batteryReCharge(0.5); // add a bit more
        d.move(5); // move some more
	}
}*/
