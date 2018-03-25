import java.util.*;

public class AdvancedTutorial extends Tutorial{
	private String topic;
	
	public AdvancedTutorial(String topic, String tutor, String time) {
		super(tutor, time);
		this.topic = topic;
	}
	public String toString() {
		return "Topic: " + topic + " " + super.toString();
	}
	public boolean couldCombineWith(AdvancedTutorial ad) {
		if (ad.getTime() == super.getTime() && ad.topic == topic) {
			return true;
		}
		return false;
	}
	public static HashMap<String, ArrayList<AdvancedTutorial>> construct(String[] s) {
		HashMap <String, ArrayList <AdvancedTutorial>> a = new HashMap <String, ArrayList <AdvancedTutorial>> ();
		//ArrayList <AdvancedTutorial> ad = new ArrayList <AdvancedTutorial> ();
		for (int i = 0; i< s.length; i = i+3) {
			/*ArrayList <AdvancedTutorial> ad = new ArrayList <AdvancedTutorial> ();
			ad.add(new AdvancedTutorial (s[i],s[i+1],s[i+2]));
			a.put(s[i], ad);*/
			if (!a.containsKey(s[i])) {
				a.put(s[i], new ArrayList<AdvancedTutorial>());
			}
			a.get(s[i]).add(new AdvancedTutorial(s[i], s[i+1], s[i+2]));
		}
		/*for (AdvancedTutorial b : ad) {
 			ArrayList <AdvancedTutorial> ad2 = new ArrayList <AdvancedTutorial> ();
 			ad2.add(b);
			for (AdvancedTutorial c : ad) {
				if (b.couldCombineWith(c) && ! b.equals(c)){
					ad2.add(c);
				}
			}
			a.put(b.topic, ad2);
		}
		*/
		return a;
	}
	public static void main (String[] args) {
		if (args.length % 3 == 0 && args.length > 0) {
			System.out.println(construct (args));
		}
		else {
			System.out.println("Wrong number of arguments!");
		}
	}
}
