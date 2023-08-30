package d0810;

public class Cat extends Animal {
	public Cat(String name, int age, String gender) {            
		super(name, age, gender);     
	}
	
	public void welcomeHome() {
		System.out.println("숨는다");
	}
	
	public void makeSound() {
		System.out.println("야옹");
		welcomeHome();
	}

}
