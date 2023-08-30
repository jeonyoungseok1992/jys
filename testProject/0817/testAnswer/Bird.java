package testAnswer;

public class Bird extends Animal implements Flyable {
	
//	public Bird() {       //이 상태로는 부모생성자가 없기 때문에 에러
//		super(name, age); //슈퍼해서 부모생서자 만들어 줘야 가능
//	}
	
	public Bird(String name, int age) {
		super(name, age);
		
	}
	
	public void fly() {
		System.out.println(this.name+"하늘을 날아다닌다");          //부모필드가 프로텍티드기때문에 this가능
		
	}
	
	public void makeSound() {
		System.out.println(this.name+"하늘에서 울고있다");
		
	}
}
