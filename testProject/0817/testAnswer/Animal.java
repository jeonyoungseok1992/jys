package testAnswer;
//추상클래스는 일반클래스와 동일하지만
//추상 메서드를 포함 할 수 있어 객체생성이 되지 않는다
//상속받아 추상메서드를 모두 구현해야 사용할 수 있다

public abstract class Animal {
	protected String name;
	protected int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void makeSound();
	

}
