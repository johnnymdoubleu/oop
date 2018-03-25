public class Interval {
	private double left, right;
	public Interval(double left, double right) {
		this.left = left;
		this.right = right;
	}
	public boolean doesContain(double x) {
		if (isEmpty()) {
			return false;
		}
		return (left < x && right > x);
	}
	public boolean isEmpty() {
		if (left > right) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean intersects(Interval b) {
		if (isEmpty() || b.isEmpty()) {
			return false;
		}
		if (left > b.right) {
			return false;
		}
		if (right < b.left) {
			return false;
		}
		return true; 
	}
	public String toString() {
		if (isEmpty()) {
			return "Interval: (EMPTY)";
		}
		return "Interval: [" + left + ", "+ right +"]";
	}
}
