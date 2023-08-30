package testProject22;

public class Food {
	private String name;
	private int kcal;
	
	public void Food() {
		
	}
	
	public void Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getKcal() {
		return this.kcal;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setkcal(int kcal) {
		this.kcal = kcal;
	}
	
	public String toString() {
		return "이름 : "+this.name + "칼로리 : " + this.kcal;
	}

	

}
