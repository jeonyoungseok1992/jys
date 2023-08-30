package d0811;

public class Circle extends Point {
	private int radius;
	
	public Circle() {
		
	}
	
//	public Circle(int x, int y, int radius) {
////		super.setX(x);        
////		super.setY(y);
//		super(x,y);   //가능
//		this.radius = radius;
//	}
	
	

	public String toString() {
		return super.toString() + "," + radius;
			
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
