package d0811;

public class Rectangle extends Point {
	private int width;
	private int height;
	
	public Rectangle() {
		super();
		this.width = 0;
		this.height = 0;
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
		
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public String toString() {
		return super.toString() + "," + width+ ","+height ;   //부모메서드 오버라이딩
		
		
	}
	

	
}
