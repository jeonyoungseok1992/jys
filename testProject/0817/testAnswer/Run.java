package testAnswer;

public class Run {

	public static void main(String[] args) {
//		Bird b = new Bird("참새", 3);
//		b.makeSound();
//		b.fly();
//		
//		Fish f = new Fish("금붕어", 1);
//		f.makeSound();
//		f.swim();
		
		Animal b = new Bird("참새", 3);          //이렇게 부모클래스로 참조변수 만들어서 업캐스팅 해줄 수 있음
		b.makeSound();    //오버라이딩 -자식메서드가 이미 부모 메서드를 가려버림
		((Bird)b).fly();  //자식클래스에 있는 기능을 요구하는 상태=다운캐스팅이 필요함
		
		Swwimmable f = new Fish("금붕어", 1);   //인터페이스를 참조변수로 한 경우도 가능
		((Fish)f).makeSound();
		f.swim();

	}

}
// Car 추상클레스 작성
// 필드 값 : String name, int age
// 필드를 초기화하는 생성자 작성
// 추상메서드 makeSound : 매게변수와 반환값(리턴값)이 없음

//인터페이스 runnable 작성
// 추상메서드 run : : 매게변수와 반환값(리턴값)이 없음

//인터페이스 stoppable 작성
// 추상메서드 stop : : 매게변수와 반환값(리턴값)이 없음

// sonata 클레스 작성
// car을 상속받고, runnable를 구현함
// run메서드에서는 "oo는 하늘을 날아다닌다" 출력
// makeSound메서드 "oo이 하늘에서 울고있습니다." 출력
//stop메서드 출력

// Fish 클레스 작성
// Animal을 상속받고, Swimmable를 구현함
// swim메서드에서는 "oo는 물을 헤엄친다" 출력
// makeSound메서드 "oo이 물에서 울고있습니다." 출력

//메인문에서 각각 객체를 하나 만들고 테스트 실행
