import java.util.HashMap;

public class GymSession extends ExerciseSession{
	private HashMap<String, Length> machines;
	
	public GymSession(String type, String place) {
		super(type, place);
		machines = new HashMap<String, Length> (8);
	}
	public void addMachine (String name, Length length) {
		machines.put(name, length);
	}
	@Override
	public String toString() {
		String a = "Machines:";
		for (String key : machines.keySet()) {
			a += "\n" + key + " " + machines.get(key).toString();
		}
		return super.toString() + "\n" + a;
	}
	public static void main(String[] args) {
		GymSession a = new GymSession("Gym", "The Pleasance");
		Length b = new Length();
		b.setNumber(10);
		b.setUnits("minutes");
		Length c = new Length();
		c.setNumber(20);
		c.setUnits("sdsf");
		a.addMachine("Treadmill", b);
		a.addMachine("BenchPress", c);
		System.out.println(a.toString());
	}
}	