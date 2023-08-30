package d0810;

public class MainAnimal {

	public static void main(String[] args) {
		Dog happy = new Dog("강아지", 5, "수컷");
		happy.makeSound();
		happy.welcomeHome();
//		 
		Cat navi = new Cat("고양이", 10, "암컷");
		navi.makeSound();

	}

}
