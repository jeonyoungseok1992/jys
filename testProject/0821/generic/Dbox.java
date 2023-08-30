package generic;

public class Dbox<L, R> {
	private L left;
	private R right;
	
	public void set(L o, R r) {
		left = o;
		right = r;
	}
	
	public String toString() {
		return left+" "+right;
	}
}
