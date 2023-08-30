package d0810;

public class Dog extends Animal {
	private int age1;
	private String gender1;
	private String name1;
	public Dog(String name, int age, String gender) {              //이대로 두면 Animal에는 기본생성자가 없기때문에 Animal 필드 초기화가 안되기 때문에
		super("코끼리");
		this.name1 = name;
		this.age1 = age;
		this.gender1 = gender;    //Animal의 필드를 초기화 해주어야 한다
	}
	
	
	
	public void welcomeHome() {
		System.out.println(gender1+"꼬리를 흔들며 반겨준다");
		super.makeSound();
		
	}
	public void welcomeHome(String name) {
		System.out.println(name+"머리를 흔들며 반겨준다");
	}
	
//	public void makeSound() {          
//		System.out.println("멍멍");
//	}
	
	
}
