import java.util.*;
public class ActivityHoliday extends Holiday {
	private HashMap<String,Cost> activities;
	
	public ActivityHoliday(String destination, int days){
		super(destination,days);
		activities= new HashMap<String,Cost>(10);
	}
	public void addActivity(String name,Cost c){
		activities.put(name, c);
	}
	@Override
	public String toString(){
		String out= super.toString()+"\nActivities:";
		for (Map.Entry<String, Cost> g: activities.entrySet()){
			out += "\n"+g.getKey()+" "+g.getValue();
		}
		return out;
	}
	
	public static void main(String[] args) {
		ActivityHoliday active = new ActivityHoliday("Korea", 14);
		Cost a = new Cost();
		a.setAmount(37);
		a.setCurrency("pounds sterling");
		active.addActivity("Kayak", a);
		System.out.println(active.toString());

	}

}