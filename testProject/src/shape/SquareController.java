package shape;

public class SquareController {
	private Shape s = new Shape();
	
	public SquareController() {
		
	}

	
	public double calcPerimeter(double height, double width) {
		s = new Shape(4, height, width);
		return s.getHeight()*2 + s.getWidth()*2;
	}
	
	public double calcArea(double height, double width) {
		s = new Shape(4, height, width);
		return s.getHeight()*s.getWidth();
	}
	
	public void paint(String color) {
		s.setColor(color);
	}
	
	public String Print() {
		return s.inform();
	}
	
	
}
