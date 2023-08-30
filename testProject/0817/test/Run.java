package test;

public class Run {

	public static void main(String[] args) {
		Bird b = new Bird("참새", 3);
		Fish f = new Fish("붕어", 5);
		
		b.fly();
		b.makeSound();
		
		f.swim();
		f.makeSound();
		
		Animal bb = new Bird("독수리", 10);
		Animal ff = new Fish("악어", 9);
		
		bb.makeSound();
		((Bird)bb).fly();
		
		ff.makeSound();
		((Fish)ff).swim();
		
//		System.out.println(Bird.add(5, 7));   //그냥 뜬금없이 스태틱메서드 써본거임
//		Bird.add(5, 7);
		

		

		
		
		
		
		
			
	}

}
