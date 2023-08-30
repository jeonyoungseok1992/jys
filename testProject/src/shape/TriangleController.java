package shape;

public class TriangleController {
	private Shape s;
	
	public TriangleController() {
		s = new Shape();
	}
	
	
	
	
	
	public double calcArea(double height, double width) {
		s = new Shape(4, height, width);        //Shape s = new Shape(4, height, width); 이런 식으로하면
		return s.getHeight()*s.getWidth() / 2;  //다른 클래스에서 필드의 s를 활용하지 못한다
	}
	
	public void paint(String color) {
		s.setColor(color);
		System.out.println("색이 수정되었습니다");
	}
	
	public String Print() {
		return s.inform();
	}
	

}
