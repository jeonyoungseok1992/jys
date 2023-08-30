package test;

public class Fish extends Animal implements Swwimmable {
	
	public Fish(String name, int age) {
		super(name, age);
	}
	
	public void swim() {
		System.out.println(this.name + "헤엄침");
	}
	
	public void makeSound() {
		System.out.println(this.name + "움");
	}

}
