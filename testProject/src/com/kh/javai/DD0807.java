package com.kh.javai;

import java.util.*;

public class DD0807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char classRoom;
		int choice;
		//객체이름이 yoon, choi, kim이라는 Student 객체를 생성해라
//		Student yoon = new Student("윤미진",21,"여자");
//		Student choi = new Student("최민정", 32,"여자");
//		Student kim = new Student("김민수",27,"남자");
		
//		Student[] iban = new Student[3];        //여기까지는 0 1 2 에 각각 주소만 입력한 상태다
//		iban[0] = new Student("윤미진",21,"여자");
//		iban[1] = new Student("윤미진",21,"여자");
//		iban[2] = new Student("윤미진",21,"여자");   //이렇게해야 0 1 2에 각각 객체생성 완료
		
		
		//최대 학생의 수가 30인 클래스(i, h, j)를 3개 만들어라
		Student[] iban = new Student[30];
		Student[] hban = new Student[30];
		Student[] jban = new Student[30];
		Student[] selectBan;
		
		//관리할 클래스를 선택해 주세요
		while(true) {
			System.out.println("관리할 클래스를 선택해 주세요. (i, h, j 선택 다른 키워드 입력시 종료)");
				
			switch(sc.next().charAt(0)) {
				case 'i' :{
					selectBan = iban;
				
				}	break;
				
				case 'h' :{
					selectBan = hban;
				}	break;
				
				case 'j' :{
					selectBan = jban;
				}	break;
				
				default :{
					selectBan = null;
				}
			}	
			if(selectBan == null)
				break;
		
		//1.학생추가
		//2.학생삭제
		//3.학생목록 확인
		//4.학생조회
		//기타입력시 뒤로 그전까지 반복
			boolean isTrue = true;
			while(isTrue) {
				System.out.println("1.학생추가 \n2.학생삭제 \n3.학생목록 확인 \n4.학생조회 \n기타입력시 뒤로");
				
				switch(sc.nextInt()) {
					case 1 :{				
						// selectBan의 빈자리 찾기 
						int index = 0;
						while(index < selectBan.length && selectBan[index] != null ) {    //&&순서바뀌면 에러??????? 
							index++;
						}
						//자리가 있을 시 학생을 추가해 준다
						if(index == selectBan.length)
							System.out.println("더이상 학생을 추가 할 수 없습니다");
						else {
						System.out.println("추가할 학생의 이름, 나이, 성별을 입력해 주세요.");
						selectBan[index] = new Student(sc.next(), sc.nextInt(), sc.next());
						}
					}break;
					case 2 :{
						int index = 0;
						while(index < selectBan.length && selectBan[index] != null) {
							index++;
						}
						if(index == 0)
							System.out.println("삭세할 학생이 없습니다.");
						else {
							selectBan[index - 1] = null;
							Student.count--;
						}
					}break;	
					case 3 :{
						System.out.println("---------------");
						System.out.println("이름\t나이\t성별");
						for(int i = 0; i < selectBan.length; i++) {
							if(selectBan[i] == null)
								break;				
							selectBan[i].info();    //참조변수.메소드()
						}
						System.out.println("---------------");
					}break;
					case 4 :{
						System.out.println("조회할 학생의 정보를 입력하세요(이름,나이,성별)");
						String name = sc.next();
						int age = sc.nextInt();
						String gender = sc.next();
						Student tmp = null;
						for(int i = 0; i < selectBan.length; i++) {	
							if(selectBan[i] == null) {
								System.out.println("조회불가능");
								break;
							}
							else if(selectBan[i].equals(name, age, gender)){    //같다의 equals가 아니고 클래스메소드 중 equals를 사용
								tmp = selectBan[i];
								System.out.println("조회가능");
								break;
							}
					}
					}
					default:
						isTrue = false;
				
				
				}
			}
		}	
	System.out.println("총 학생의 수 : " + Student.count + "명을 등록 완료되었습니다.");

		
	}

}
