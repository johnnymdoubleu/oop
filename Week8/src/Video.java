import java.util.ArrayList;
public class Video {
	private String title;
	private boolean checkedOut;
	private ArrayList<Integer> ratings;
	
	public Video(String title){
		this.title = title;
		checkedOut = false;
		ratings = new ArrayList<Integer>();
	}
	public String getTitle() {
		return title;
	}
	public boolean addRating(int rating) {
		if ( rating >= 1 && rating <= 5) {
			ratings.add(rating);
			return true;
		}
		else {
			System.out.println(rating + " should be between 1 and 5.");
			return false;
		}
	}
	public double getAverageRating() {
		int n = ratings.size();
		int total = 0;
		
		if (n == 0) {
			return 0;
		}
		for (int i = 0; i < ratings.size(); i++) {
			total += ratings.get(i);
		}
		return (double) total / n;
	}
	public boolean checkOut() {
		if (checkedOut) {
			System.out.println(this + " is already checked out.");
			return false;
		}
		checkedOut = true;
		return  true;
	}
	public boolean returnToStore() {
		if (!checkedOut) {
			System.out.println(this + " is not checked out.");
			return false;  
		}
		checkedOut = false;
		return true;
	}
	public boolean isCheckedOut() {
		return checkedOut;
	}
	@Override
	public String toString() {
		return String.format("Video[title=\"%s\", checkedOut=%s]", title, checkedOut);
		// return "Video[title=\"" + title + "\", checkedOut=" + checkedOut + "]";
	}
	public static void main(String[] args) { 
		Video v = new Video("Iron Man");
		
		
		System.out.println(v.toString());
	}
}
