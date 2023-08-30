package com.kh.javai;
import java.util.*;

//main 메서드를 실행해주기위해 만든 클래스
public class MainStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		인스턴스 객체 생성 방법		  
//		 클래스 객체이름 = new 생성자(클래스와 이름이 동일한 메서드);
		 
		
//		Student jeon = new Student();         //변수() == 메서드 ------형식약속
//		Student kim = new Student("김강");        
//		Student choi = new Student("최후", 'a');        
//		Student yoon = new Student("윤겔라", 48, 'M');        
//		//아래 두 코드가 실행되면 각기 다른 결과값이 나타난다 이를통해 각기 다른 메모르공간을 확보하고 사용한다는 것을 알 수 있다
//		yoon.info();
//		kim.info();
		
		
//		 Student choi = new Student("전영석", 32, "남자");
//
//		 System.out.print("영어점수 : ");
////	      en = sc.nextInt();
////	      choi.setEnScore(en);       //이걸 줄여서
//	      choi.setEnScore(sc.nextInt());
//	      
//	      System.out.print("국어점수 : ");
//	      choi.setKoScore(sc.nextInt());
//	      
//	      System.out.print("수학점수 : ");
//	      choi.setMathScore(sc.nextInt());
//	          
////	      System.out.println("영어점수 : " + choi.getEnScore());
////	      System.out.println("국어점수 : " + choi.getKoScore());
////	      System.out.println("수학점수 : " + choi.getMathScore());
////	      System.out.println("총합 : " + choi.getTotal());
////	      System.out.println("총합 : " + choi.getAvg());
//
//	      choi.checkPassisTrue();
//	      choi.displayMyInfo();
	      System.out.println(Student.count);         ////////클래스.스태틱 ---이 방법이 다른데서도 알아볼수 있기때문에 이 방법으로 쓰길 추천
	      Student choi = new Student("최영", 18, "남자");
	      Student kim = new Student("김영", 49, "남자");
	      Student jeon = new Student("전영", 32, "남자");
	      Student.showCount();
	      System.out.println(choi.count);
	      System.out.println(jeon.count);
	      System.out.println(kim.count);
	

	}
}
