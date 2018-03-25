import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Collections;

public class Student extends Person {
	private ArrayList<Course> activeCourses;
	private ArrayList<Course> completedCourses;
	private int maxCourses;

	public int getMaxCourses() {
		return maxCourses;
	}

	public void setMaxCourses(int maxCourses) {
		this.maxCourses = maxCourses;
	}

	public Student(String fn, String ln, ArrayList<Course> activeCourses, ArrayList<Course> completedCourses, int MC) {
		super(fn, ln);
		this.activeCourses = activeCourses;
		this.completedCourses = completedCourses;
		setMaxCourses(MC);
	}

	public boolean canEnroll(Course course) {
		boolean a = false;
		Collection <String> valuess = new ArrayList<String>();
		for (int i = 0 ; i< completedCourses.size() ; i++) {
			valuess.add(completedCourses.get(i).getName());
		}
		if (valuess.containsAll(course.getPrerequisiteCourses())) {
			a = true;
		}
		boolean b = activeCourses.size() < maxCourses;
		boolean c = !completedCourses.contains(course);
		boolean e = !activeCourses.contains(course);
		boolean d = a && b && c && e;
		return d;
	}

	public boolean enroll(Course course) {  
		boolean a = false;
		if (canEnroll(course)) {
			activeCourses.add(course);
			a = true;
			return a;
		}
		return a;
	}

	public boolean complete(String courseName) {
		boolean success = false;
		for (Course a : activeCourses) {
			if (a.getName().equals(courseName) ) { //if(a.getName() == courseName)
				completedCourses.add(a);
				activeCourses.remove(a);
				success = true;
				return success;
			}
			else {
				return success;
			}
		}
		return success;
	}

	public HashMap<Course, String> getAllCourses() {
		HashMap<Course, String> list = new HashMap<Course, String>();
		for (Course a : activeCourses) {
			list.put(a, "active");
		}
		for (Course a : completedCourses) {
			list.put(a, "completed");
		}
		return list;
	}

	public String summary() {
		String s = "";
		//if(activeCourse.size() >= 0) {}
		for (int i = 0; i < activeCourses.size(); i++) {
			s += activeCourses.get(i).getName() + " (active)\n";
		}
		for (int i = 0; i < completedCourses.size(); i ++) {
			if (i == completedCourses.size() - 1) {
				s += completedCourses.get(i).getName() + " (completed)";
			}
			else {
				s += completedCourses.get(i).getName() + " (completed)\n";
			}
		}
		return s;
		
		/*Set <Course> c = getAllCourses().keySet();
		Iterator <Course> it = c.iterator();
		String a = "";
		while (it.hasNext()) {
			
			a += it.next().getName() + " (" + getAllCourses().get(it.next()) + ")\n";
		}
		return a.trim();
		*/
	}
	public static void main(String[] args) {
		ArrayList<Course> activeCourse = new ArrayList<Course>();
		ArrayList<Course> completedCourse = new ArrayList<Course>();
		ArrayList<String> pre = new ArrayList <String> ();
		pre.add("1");
		pre.add("2");
		activeCourse.add(new Course ("FP", pre ));
		activeCourse.add(new Course ("FO", pre ));
		completedCourse.add(new Course ("as", pre));
		Student s = new Student("Johnny", "Lee", activeCourse, completedCourse, 4);
		System.out.println(s.summary());
	}
}
