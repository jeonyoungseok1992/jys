package d0810;

public class Animal {
	private int age;
	private String gender;
	private String name;
	
	public Animal(String name2) {
		this.name = name2;
	}

	public Animal(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void makeSound() {
		System.out.println("짖고 있는 "+gender);
	}
	
	
	

}
