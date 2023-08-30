package d0811;

public class CircleController {
	private Circle c;
	private final double PI = 3.14;
	
	public CircleController() {
		c = new Circle();
	}
	
	public String calcArea(int x, int y, int radius) {
//		c.setX(x);
//		c.setY(y);
		c.setRadius(radius);  
		return "둘레 : "+c.toString()+ this.PI * radius *2;

	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius); 
		return "둘레 : "+c.toString()+ this.PI * radius *radius;
	}
	
	
		
		
	
	
	
}
