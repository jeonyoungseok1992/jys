package member;

public class Member {
	private String id;
	private String name;
	private String password;
	private String email;
	private int age;
	private double height;
	private double weight;
	
	public Member() {
		
	}
	
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public String getId() {
		return id;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	
	public String toString() {
		return name+ age+ height+ weight;
	}

}
