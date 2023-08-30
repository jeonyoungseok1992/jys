package d0811;

public class RectangleController {         //데이터를 가지고 계산만 하기위해 만듬
	private Rectangle r;
	
	
	public RectangleController() {
		r = new Rectangle();
	}
	
	public String calcArea(int x, int y, int width, int height ) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		
		return "면적 : "+r.toString()+ width * height;
	}
	
	public String calcimeter(int x, int y, int width, int height) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return "둘레 : "+r.toString()+ (width + height) * 2;
	}
	
	
}

