package shape;

public class Shape {
	private int type;
	private double height;
	private double width;
	private String color = "white";
	
	public Shape() {
	}

	
	public Shape(int type, double height, double width) {
//		this();          //---------생성자는 생성자 안에서만 호출 가능하다
		this.type = type;
        this.height = height;
        this.width = width;
	}
	 public int getType() {
	        return type;
	    }

    public void setType(int type) {
        this.type = type;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String inform() {
        String str;
        str = "type: " + this.type + ", height: " + this.height + ", width: " + this.width + "color : "+this.color;
    	
    	return str;
    }

}
