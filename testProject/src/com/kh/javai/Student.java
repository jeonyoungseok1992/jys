package com.kh.javai;

import java.util.Scanner;

//클래스는 붕어빵 틀---------------계속해서 찍어낸다
public class Student {
	//필드(데이터 집합)
	static int count = 0;     //전체 학생 수          //스태틱 진도 시작
	String name;
	int age;
	String gender;
	int mathScore;
	int enScore;
	int koScore;
	int total;
	
	//생성자
	//인스턴스 객체를 생성할 때 데이터를 초기화하기위해
	//자동으로 한번만 실행하는 특별한 메서드
	//특징은 메서드처럼 접근해서 실행할 수 없으며 class의 이름과 동일한 이름을 가진다
	//초기화를 위한 메서드이기 때문에 반환값은 없다(void)
	/*기본생성자
	 * 생성자를 아무것도 작성하지 않았을 때 컴파일러가 기본적으로 생성해주는 생성자(아무 기능이 없다)
	 */
	//생성자는 여러개 생성 가능하다
	//생성자가 여러개일 때는 매개변수로 식별한다.
	public Student() {
		System.out.println("Student의 기본생성자");
	}
	public Student(String tname) {
		System.out.println("tname을 매게변수로 받는 생성자");
		name = tname;
	}
	public Student(String tname, int tage) {
		System.out.println("tname, tage를 매게변수로 받는 생성자");
	}
	public Student(String tname, int tage, String tgender) {
		// String name으로 적고 밑에 name = tname을 지우면 메서드생성자 이후에 정보가 사라진다------생성자메서드는 기본정보를 입력하기 위한 것
		count++;
		name = tname;
		age = tage;
		gender = tgender;
		
		System.out.println("이름:"+name+" 나이 :"+age+" 성별:"+gender);
		System.out.println("학생이 추가 되었습니다");
	}
	
	public void info() {
		System.out.println(name + "\t" + age + "\t" + "\t" + gender);
	}
	
	
	public Student(int tage) {                          //논리오류가 일어나는 애매한 생성자는 지양한다.
		
	}
	public Student(double tage) {
		
	}
	
	//메서드(기능 집합)
	//info메서드 생성
//	public void info() {
//		System.out.println("저는 "+age+"살의 "+name+"입니다"+gender);

	public void setEnScore(int tEnScore) {
	      if (tEnScore < 0) {
	         enScore = 0;
	         return;
	      }
	      enScore = tEnScore;
	   }
	   
	   public void setKoScore(int tKoScore) {
	      if (tKoScore < 0) {
	         koScore = 0;
	         return;
	      }
	      koScore = tKoScore;
	   }
	   
	   public void setMathScore(int tMathScore) {
	      if (tMathScore < 0) {
	         mathScore = 0;
	         return;
	      }
	      mathScore = tMathScore;
	   }
	   
	   //get메서드(getter) => 필드데이터의 값을 사용하기 위한 메서드
	   public int getEnScore() {
	      return enScore;	 	   
	   }
	   public int getKoScore() {
		      return koScore;	 	   
		   }
	   public int getMathScore() {
		      return mathScore;	 	   
		   }
	
	   // 기능을 담당하는 메서드
	   // 토탈값을 반환하는 메서드
	  public int getTotal() {
		  total = enScore+koScore+mathScore;
		  return total;
}
	  public double getAvg() {		  
		  return (getTotal()/3d);
}
//	  public void checkPass() {
//	      if (enScore >= 40 && koScore >= 40 && mathScore >= 40 && getAvg() >= 60) {
//	         System.out.print("합격입니다.");
//	      } else {
//	         System.out.print("불합격입니다.");
//	      }
	
	  public boolean checkPassisTrue() {
    if (enScore >= 40 && koScore >= 40 && mathScore >= 40 && getAvg() >= 60) {
       return true;
    } else {
       return false;
    }
	  }
	
	//displayMyInfo 메서드를 만들어보자
	//매개변수는 없고 리턴값도 존재하지않는다
	//실행의 결과로 
	//저는 00살의 000입니다
	
 public void displayMyInfo() {
	      System.out.println("영어점수 : "+enScore);
		   System.out.println("국어점수 : "+koScore);	      
		   System.out.println("수학점수 : "+mathScore);
		  total = enScore+koScore+mathScore;
		  System.out.println("합계 : "+total);
		  System.out.println("평균 : "+getAvg());
		  
		  if(checkPassisTrue()) {
			  System.out.println("으로 시험에 합격");
		  }else
			  System.out.println("으로 불합격");
 } 
  	public String getGender() {
  		return this.gender;
  	}
  	public int getAge() {
  		return this.age;
  	}
  	public String getName() {
  		return this.name;
  	}
  	//매개변수 값과 객체의 데이터가 동일하다면 true, 아니면 false를 반환
  	public boolean equals(String name, int age, String gender) {
  		if(this.name.equals(name) && this.age == age && this.gender.equals(gender))
  			return true;
  		else
  			return false;
  		
  	}
  	public static void showCount() {
  		System.out.println(count);
  	}
  	
  	//AAA클래스 안에  static void addNum() 안의 일반 num변수를 쓸 수 없다 	
  	//다른 객체에서 이름.num 했을 때 AAA.num을 쓰면 설계도가 바뀌기때문에
    //AAA.num 쓰면 안된다
 
}