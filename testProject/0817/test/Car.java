package test;

public abstract class Car {
	protected String name;
	protected int age;
	
	public Car(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void makeSound();

}
