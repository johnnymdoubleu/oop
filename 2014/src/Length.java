public class Length {
	private int number;
	private String units;
	public Length() {
		setNumber(0);
		setUnits("km");
	}
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if(number >= 0) {
			this.number = number;
		}
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		//units = ((junits == "km" || junits == "miles" || junits == "minutes")?junits:"");
		if(units.equals("km")|| units.equals("miles") || units.equals("minutes")) {
			this.units = units;
		}
			
	}
	public void convert(String newUnits, double rate) {
		double a = number / rate;
		if((newUnits.equals("km")|| newUnits.equals("miles") || newUnits.equals("minutes"))) {
			this.number = ((int) Math.round(a));
			//this.units = newUnits;
			setUnits(newUnits);
		}
	}
	public String toString() {
		return number + " " + units;
	}
	public static void main(String[] args) {
		Length a = new Length();
		a.setNumber(40);
		a.setUnits("minutes");
		//a.convert("km", 0.6);
		System.out.println(a.getNumber() + " " + a.getUnits());
	}
}
