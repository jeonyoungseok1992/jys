package test;

public class Student extends Human implements Swwimmable, Sleepable {
	
	public Student(String name, int age) {
		super(name, age);
	}
	
	public void swim() {
		System.out.println(this.getName() + "수영을 합니다");
	}
	
	public void sleep() {
		System.out.println(super.getName() + "잠을 잡니다");
	
	}
	
	public void makeSound() {
		System.out.println("저는 "+super.getName() + "이고 "+this.age +"살 입니다"  );
	}

}
