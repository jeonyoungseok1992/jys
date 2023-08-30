package test;

public abstract class Human {
	private String name;
	protected int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void makeSound();



//	public void setName(String name) {
//		this.name = name;
//	}
	
	public String getName() {
		return this.name;
	}
	
}