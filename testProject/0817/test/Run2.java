package test;

public class Run2 {

	public static void main(String[] args) {
		Car c = new Sonata("붕붕이", 10);
		
		c.makeSound();
		((Sonata)c).run();
		((Sonata)c).stop();

	}

}
