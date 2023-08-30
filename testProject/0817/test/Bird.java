package test;

public class Bird extends Animal implements Flyable {
	
	public Bird() {
		
	}
	
	public Bird(String name , int age) {
		super(name, age);
	}
	
	public void fly() {
		System.out.println(this.name + "날아다님");
	}
	
	public void makeSound() {
		System.out.println(this.name + "움");
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

}
