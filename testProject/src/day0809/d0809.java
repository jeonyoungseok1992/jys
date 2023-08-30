package day0809;

public class d0809 {

	public static void main(String[] args) {
		//상속
		//물려준애 먼저 그다음 상속받은애가 후에 참조
//		Man jeon = new Man();
//		jeon.name ="영석";
//		BusinessMan kim = new BusinessMan();
////		
//		
//		jeon.tellYourName();
//		System.out.println(kim.name);
//		kim.name = "지호";
//		System.out.println(kim.name);
//		kim.tellYourName();
////		
//		kim.tellYourInfo();
		
		
		BusinessMan kim = new BusinessMan("Kh", "학생", "wefwf");
		kim.tellYourInfo();
		
		
		//static상속----자식클래스에서 static바꿔도 부모클래스 static도 바뀐다
		//static은 하나의 메모리로 공유하기 때문
		
		
		
		
		
		
	}

}
