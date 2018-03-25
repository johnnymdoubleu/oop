public class UG5Student extends Student {
	private int extraLevel9s;

	public UG5Student(String name, String uun, int attribute) {
		super(name, uun, 5);
		this.extraLevel9s = attribute;
	}

	public UG5Student() {
		this("not set", "not set", 0);
	}

	public int level9s() {
		int a = 0;
		for (Course c : super.getCourses()) {
			if (c.getLevel() == 9) {
				a++;
			}
		}
		return a;
	}

	public boolean addCourse(Course course) {
		if (course.getLevel() != 9) {
			super.addCourse(course);
			return true;
		}
		if (extraLevel9s - level9s() >= 0) {
			super.addCourse(course);
			return true;
		}
		return false;
	}

	public String toString() {
		if (level9s() <= 1) {
			return super.toString();
		}
		String a = super.toString() + "\nTaking extra level 9s. Permission for " + (extraLevel9s + 1 - level9s())
				+ " extra.";
		//String out = super.toString();
		//if (level9s() > 1) {
		//	out = out + "\nTaking extra level 9s. Permission for " + extraLevel9s + " extra"; 
		//}
		for (Course c : super.getCourses()) {
			a += "\n" + c.getName();
		}
		return a;
	}

	public static void main(String[] args) {
		UG5Student a = new UG5Student("Johnny Lee", "s1687781", 1);
		a.addCourse(new Course("Informatics 1 Object Oriented Programming", 'O', 9));
		a.addCourse(new Course("Proof and Problem Solving", 'I', 9));
		a.addCourse(new Course("Calculus and it's Application", 'I', 8));
		a.addCourse(new Course("Data and Analysis", 'I', 9));
		a.addCourse(new Course("Introduction to Linear Algebra", 'I', 8));
		System.out.println(a.toString());
	}
}
