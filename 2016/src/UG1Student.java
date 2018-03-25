public class UG1Student extends Student {
	private char mainSchedule;

	public UG1Student(String studentname, String uun, char mainSchedule) {
		super(studentname, uun, 1);
		this.mainSchedule = mainSchedule;
	}

	public UG1Student() {
		this("not set", "not set", 'X');
	}

	public boolean addCourse(Course course) {
		if (course.getLevel() != 7 && course.getLevel() != 8) {
			return false;
		} else {
			return super.addCourse(course);
		}
	}

	/*
	 * public boolean addCourse(Course course) { if (course.getLevel() == 7 ||
	 * course.getLevel() == 8) { return super.addCourse(course); } else { return
	 * false; } }
	 */
	/*
	 * public boolean addCourses(Course[] c) { boolean success = false; for (int
	 * i = 0; i < c.length; i++) { if (addCourse(c[i]) == true ) { success =
	 * true; } } return success; }
	 */
	public boolean addCourses(Course[] c) {
		boolean success = true;
		for (Course i : c) {
			success = success & addCourse(i);
		}
		return success;
	}

	/**/
	/*
	 * public String toString() { String out = super.toString() +
	 * "\nMain schedule " + mainSchedule + " courses:\n"; Course[] courselist =
	 * super.getCourses(); for (int i = 0; i < courselist.length; i++) { out +=
	 * courselist[i].getName() + "\n" ; } return out; }
	 */
	/*
	 * public String toString() { String s = ""; for(int i = 0; i <
	 * super.getCourses().length; i++) { s +=
	 * Character.toString((super.getCourses()[i]).getSchedule()) + " "; } String
	 * n = ""; for (int i = 0; i < super.getCourses().length; i++) { n += "\n" +
	 * super.getCourses()[i].getName(); } return super.toString() +
	 * "\nMain Schedule " + s + "courses: \n" + n; }
	 */
	@Override
	public String toString() {
		String a = "";
		for (Course i : super.getCourses()) {
			if (mainSchedule == i.getSchedule()) {
				a += "\n" + i.getName();
			}
		}

		return super.toString() + "\n" + "Main schedule " + mainSchedule + " courses:" + a;
	}

	public static void main(String[] args) {
		UG1Student a = new UG1Student("Johnny Lee", "s1687781", 'O');
		a.addCourse(new Course("Informatics 1 Object Oriented Programming", 'O', 8));
		UG1Student c = new UG1Student("Bob adskdg", "s1616531", 'I');
		a.addCourse(new Course("Proof and Problem Solving", 'I', 8));
		System.out.println(a.toString());
	}
}
