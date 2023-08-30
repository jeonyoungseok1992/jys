package d0811;

public class Main {

	public static void main(String[] args) {
//		SmartPhone ph1 = 
//				new SmartPhone("010-555-777", "Nougat");
//		MobilePhone ph2 = 
//				new SmartPhone("010-999-333", "Nougat");
//		//업캐스팅
//		ph1.answer();
//		ph1.playApp();
////		System.out.println();
////		
////		
//		ph2.answer();
//		ph2.playApp();
//		((SmartPhone)ph2).playApp();
//		
		//상속 되었을 경우
	    //부모 자식 오버라이딩 되면 자식 메서드만 남는다(자식이 부모 삼킴)
		//클래스가 오버라이딩 되면 외부에선 부모클래스 메서드를 호출 할 수 없다
		
		
		//super를 이용해서 자식클래스 메서드에서 부모 메서드 소환 가능
		//	            생성자도 생성자 안에서는 부모 생성자 소환 가능
		
		
		
		Box instance1 = new Box();
		PaperBox instance2 = new PaperBox();
		GoldPaperBox instance3 = new GoldPaperBox();
		PaperBox instance4 =  new GoldPaperBox();
		Box instance5 =  new GoldPaperBox();
		Box instance6 =  new PaperBox();
//		PaperBox instance4 =  new GoldPaperBox();
//		wrapBox(instance1);
		wrapBox(instance2);
		wrapBox(instance3);
		wrapBox(instance4);
//		wrapBox(instance5);
//		wrapBox(instance6);
		
		
	}
	public static void wrapBox(PaperBox x) {        //이 부분에서 2,3 업캐스팅이 이뤄진다
		if (x instanceof GoldPaperBox) {       //Box x = new GoldPaperBox();
			((GoldPaperBox)x).goldWrap();
		}
		else if (x instanceof PaperBox) { //오른쪽이 참조변수가 가르키는 것과 연관이 있냐
			((PaperBox)x).paperWrap();
		}
		else {
			
			x.simpleWrap();
		}
	
	}
//
}
