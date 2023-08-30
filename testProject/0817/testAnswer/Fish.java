package testAnswer;

public class Fish extends Animal implements Swwimmable {
	

	
	public Fish(String name, int age) {
		super(name, age);
		
	}
	
	public void swim() {                  //인터페이스Swimmable 구현 메서드
		System.out.println(this.name+"물속을 헤엄친다");         
		
	}
	
	public void makeSound() {             //Animal 구현 메서드
		System.out.println(this.name+"물속에서 울고있다");
		
	}
}
