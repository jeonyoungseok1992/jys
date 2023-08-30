package generic;

public class Main {

	public static void main(String[] args) {
//		Box x = new Box();
//		
//		x.set(3);
//		
//		System.out.println(x.get());
//		
//		
//        int num = (int) x.get(); 
//        System.out.println(num);
        
//		Box<Apple> a = new Box<Apple>();
//		Box<Orange> o = new Box<Orange>();
//		
//		a.set(new Apple());        //new Orage()로 하면 객체설정에 어긋나기때문에 오류
//		o.set(new Orange());
//		
//		Apple ap = a.get();        //Apple 타입의 ap로 받아준다 a.get();으로 오는 애플타입 객체를
//		Orange or = o.get();
		

		
		
		
		
		
		
		Box x = new Box();               //String문자열로 저장된 x.get을 Apple로 강제형변환 하려하니 에러발생
										//이 경우엔 에러나도 바로 고칠 수 있으니 별거아닌 에러
		x.set("Apple");
		
		Apple ap = (Apple)x.get();
		
		System.out.println(ap);
		
		
		
		
//		Box x = new Box();               //코드는 문제 없지만 원래 의도한 결과가 아닌 값이 출력되는 논리에러 발생
//										//이 경우가 제네릭을 쓰게 되는 큰 이유 : 논리에러
//		x.set("Apple");			
//		
//		System.out.println(x.get());
		

		
		
		
		
//		Box x = new Box();         //의도했던 결과를 출력 하지만 강제형변환이 번거롭다
//									//게다가 애써 한 강제형변환이 컴파일러의 에러 발견 가능성을 저해한다
//		x.set(new Apple());
//		
//		Apple ap = (Apple)x.get();      //x.get()이 Object형이기 때문에 다운캐스팅해줘야 함
//		
//		System.out.println(ap);


	}

}
