package test;

public class Sonata extends Car implements Runnable, Stoppable {
	
	public Sonata(String name, int age) {
		super(name, age);
	}
	
	public void run() {
		System.out.println(this.name + "달림");
	}
	
	public void stop() {
		System.out.println(this.name + "멈춤");	
	}
	
	public void makeSound() {
		System.out.println("시끄러움");
	}
	
	

}
